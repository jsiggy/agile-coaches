package simpledesign.smells;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DatabaseLogin.java
public class DatabaseLogin {
   // the database connection
   private Connection connection;

    /**
     * Login
     * @param user the user
     * @param password the password
     * @return boolean
     * @throws SQLException when errors
     */
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

    /**
     * set the connection
     * @param connection
     */
   public void setConnection(Connection connection) {
      this.connection = connection;
   }
}
