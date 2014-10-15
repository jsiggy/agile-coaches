package simpledesign.smells.domain;

import java.sql.SQLException;

public class FastLoginDao implements LoginDao {
    @Override
    public boolean login(String user, String password) throws SQLException {
        // do some cool stuff here
        return false;
    }
}
