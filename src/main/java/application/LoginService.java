package application;

public class LoginService {
    private final String validUsername = "testUser";
    private final String validPassword = "password123";

    public String login(String username, String password) {
        if (validUsername.equals(username) && validPassword.equals(password)) {
            return "Dashboard";
        } else {
            return "Login Failed";
        }
    }
}
