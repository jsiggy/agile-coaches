package simpledesign.fixed;

import simpledesign.smells.domain.FastLoginDao;
import simpledesign.smells.domain.LoginDao;

import java.sql.SQLException;

public class AuthenticateService {
    private LoginDao loginDao;

    public boolean login(String user, String password) {
        try {
            return loginDao.login(user, password);
        } catch (SQLException e) {
            throw new AuthenticationFailedException("Invalid username/password", e);
        }
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    private class AuthenticationFailedException extends RuntimeException {
        public AuthenticationFailedException(String msg, SQLException exception) {
        }
    }
}
