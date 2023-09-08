package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;

    LoginPage loginPage = new LoginPage(driver);

    @When("User input {string} as a userName {string} as a password")
    public void inputCredential(String usrName, String psword) throws InterruptedException {
        loginPage.setUserName(usrName);
        loginPage.setPassword(psword);
        loginPage.setButtonLogin();

    }

    @Given("User open the website sauce demo")
    public void verifyLoginPage(){
        Assert.assertTrue(loginPage.userNameDisplayed());
    }

    @Then("User already on home page")
    public void labelProduct(){
       Assert.assertTrue(loginPage.labelProductDisplayed());
    }

    @Then("User see error {string} on login page")
    public void verifyLabelErrorText(String errorText) {
        Assert.assertEquals(loginPage.getLabelErorText(), errorText);
    }



}
