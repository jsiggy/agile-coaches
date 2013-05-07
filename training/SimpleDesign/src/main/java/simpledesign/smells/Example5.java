package simpledesign.smells;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Example5.java
public class Example5 {
   // This is the connection
   private Connection connection;

   // This is for logging in
   public boolean login(String user, String password) throws SQLException {
      PreparedStatement preparedStatement = connection.prepareStatement("select user from users where user = ? and password = ?");
      preparedStatement.setString(1, user);
      preparedStatement.setString(2, password);

      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next())
         if (resultSet.getString(1) == user)
            return true;

      return false;
   }

   //This is for setting the connection
   public void setConnection(Connection connection) {
      this.connection = connection;
   }
}
