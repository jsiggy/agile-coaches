package simpledesign.smells;

public class UserService {
    public UserDetails createUser(String first, String last) {
       return new UserDetails(first, last);
    }

    public boolean isValidUser(UserDetails userDetails) {
        if (userDetails.hasErrors() == true)
            return false;
        else
            return true;
    }
}
