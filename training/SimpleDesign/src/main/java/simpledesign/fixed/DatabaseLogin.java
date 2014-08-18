package simpledesign.fixed;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseLogin {
   public static final String LOGIN_SQL = "select user from users where user = ? and password = ?";
   
   private Connection connection;

   public void login(String user, String password)  {
      try {
         PreparedStatement preparedStatement = connection.prepareStatement(LOGIN_SQL);
         preparedStatement.setString(1, user);
         preparedStatement.setString(2, password);

         ResultSet resultSet = preparedStatement.executeQuery();

         if (!resultSet.next() || !resultSet.getString(1).equals(user))
            throw new RuntimeException("User failed to login");
      } catch (SQLException e) {
         throw new RuntimeException("Had some problem accessing database", e);
      }
   }

   public void setConnection(Connection connection) {
      this.connection = connection;
   }
}
