package simpledesign.smells;

import simpledesign.smells.domain.FastLoginDao;
import simpledesign.smells.domain.LoginDao;

import java.sql.SQLException;

public class AuthenticateService {
   private LoginDao loginDao = new FastLoginDao();

   public boolean login(String user, String password) throws SQLException {
      try {
         return loginDao.login(user, password);
      } catch (SQLException e) {
         e.printStackTrace();
      }

      return false;
   }
}
