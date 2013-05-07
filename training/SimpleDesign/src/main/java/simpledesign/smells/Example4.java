package simpledesign.smells;

import java.sql.SQLException;

public class Example4 {
   private LoginDao fLoginDao;
   private String fUser;
   private String fPassword;
   
   public boolean login(String e4User, String e4Password) throws SQLException {
      return fLoginDao.login(e4User, e4Password);
   }

   public void setfLoginDao(LoginDao fLoginDao) {
      this.fLoginDao = fLoginDao;
   }
}
