/*
 * SingleResponsibilityTest
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.fixed;

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
public class Example5Test {

   @Mock Connection connection;
   @Mock PreparedStatement statement;
   @Mock ResultSet resultSet;
   private Example5 example;

   @Before
   public void setUp() throws Exception {
      example = new Example5();
      example.setConnection(connection);
      when(connection.prepareStatement(Mockito.anyString())).thenReturn(statement);
      when(statement.executeQuery()).thenReturn(resultSet);
   }

   @Test
   public void login_found() throws SQLException {
      when(resultSet.next()).thenReturn(true);
      when(resultSet.getString(1)).thenReturn("abe");
      example.login("abe", "lincoln");
      
      verify(statement).setString(1, "abe");
      verify(statement).setString(2, "lincoln");
   }

   @Test
   public void login_notFound() throws SQLException {
      when(resultSet.next()).thenReturn(false);
      try {
         example.login("abe", "incorrect");
         fail("Should have thrown an exception");
      } catch (RuntimeException e) {
         assertEquals("User failed to login", e.getMessage());
      }

      verify(statement).setString(1, "abe");
      verify(statement).setString(2, "incorrect");
   }

   @Test
   public void login_sqlInjected() throws SQLException {
      when(resultSet.next()).thenReturn(true);
      when(resultSet.getString(1)).thenReturn("notAbe");
      try {
         example.login("garbage", "moregarbage");
      } catch (RuntimeException e) {
         assertEquals("User failed to login", e.getMessage());
      }

      verify(statement).setString(1, "garbage");
      verify(statement).setString(2, "moregarbage");
   }
   
   @Test
   public void login_sqlException() throws SQLException {
      when(connection.prepareStatement(Mockito.any(String.class))).thenThrow(new SQLException("Had some issue"));
      try {
         example.login("garbage", "moregarbage");
         fail("Should have thrown an error");
      } catch (RuntimeException e) {
         assertEquals("Had some problem accessing database", e.getMessage());
      }

      verify(resultSet, never()).next();
      verify(statement, never()).setString(anyInt(), anyString());
   }
}
