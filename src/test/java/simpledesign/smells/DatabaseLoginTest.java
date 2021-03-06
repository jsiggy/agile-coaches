package simpledesign.smells;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DatabaseLoginTest {

   @Mock Connection connection;
   @Mock PreparedStatement statement;
   @Mock ResultSet resultSet;
   private DatabaseLogin example;

   @Before
   public void setUp() throws Exception {
      example = new DatabaseLogin();
      example.setConnection(connection);
      when(connection.prepareStatement(Mockito.anyString())).thenReturn(statement);
      when(statement.executeQuery()).thenReturn(resultSet);
   }

   @Test
   public void login_found() throws SQLException {
      when(resultSet.next()).thenReturn(true);
      when(resultSet.getString(1)).thenReturn("abe");
      assertTrue(example.login("abe", "lincoln"));
      
      verify(statement).setString(1, "abe");
      verify(statement).setString(2, "lincoln");
   }

   @Test
   public void login_notFound() throws SQLException {
      when(resultSet.next()).thenReturn(false);
      assertFalse(example.login("abe", "incorrect"));

      verify(statement).setString(1, "abe");
      verify(statement).setString(2, "incorrect");
   }

   @Test
   public void login_sqlInjected() throws SQLException {
      when(resultSet.next()).thenReturn(true);
      when(resultSet.getString(1)).thenReturn("notAbe");
      assertFalse(example.login("garbage", "moregarbage"));

      verify(statement).setString(1, "garbage");
      verify(statement).setString(2, "moregarbage");
   }
   
   @Test
   public void login_sqlException() throws SQLException {
      when(connection.prepareStatement(Mockito.any(String.class))).thenThrow(new SQLException("Had some issue"));
      try {
         example.login("garbage", "moregarbage");
         fail("Should have thrown an error");
      } catch (SQLException e) {
         assertEquals("Had some issue", e.getMessage());
      }

      verify(resultSet, never()).next();
      verify(statement, never()).setString(anyInt(), anyString());
   }
}
