package simpledesign.smells.domain;

import java.sql.SQLException;

public interface LoginDao {
   boolean login(String user, String password) throws SQLException;
}
