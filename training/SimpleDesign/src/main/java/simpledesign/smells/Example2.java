package simpledesign.smells;

import java.sql.SQLException;

public class Example2 {
   private LoginDao loginDao;

   public boolean login(String user, String password) throws SQLException {
      try {
         return loginDao.login(user, password);
      } catch (SQLException e) {
         e.printStackTrace();
      }

      return false;
   }

   public void setLoginDao(LoginDao loginDao) {
      this.loginDao = loginDao;
   }
}
