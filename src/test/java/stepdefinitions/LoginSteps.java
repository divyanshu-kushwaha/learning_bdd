package stepdefinitions;
import application.LoginService;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {

    private LoginService loginService;
    private String result;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginService = new LoginService();
        System.out.println("The user is on the login page");
    }

    @When("the user enters valid credentials")
    public void the_user_enter_valid_credentials() {
        result = loginService.login("testUser", "password123");
        System.out.println("The user enters valid credentials");
    }

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        result = loginService.login("invalid_username", "invalid_password");
        System.out.println("The user enters invalid credentials");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        System.out.println("The user clicks the login button");
    }

    @Then("the user should be redirected to dashboard")
    public void the_user_should_be_redirected_to_dashboard() {
        Assert.assertEquals("Dashboard", result);
        System.out.println("The user is redirected to dashboard");
    }

    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        Assert.assertEquals("Login Failed", result);
        System.out.println("User sees a login failed message");
    }
}
