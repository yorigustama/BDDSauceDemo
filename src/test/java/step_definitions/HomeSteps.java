package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User sort list filter by {string}")
    public void selectFilterProduct(String filterProduct) {
        homePage.selectFilterProduct(filterProduct);
    }
    @And("User click item {string} and {string}")
    public void clickButtonAddToCartItem(String item1, String item2) {
        homePage.clickButtonAddToCard(item1);
        homePage.clickButtonAddToCard(item2);
    }
    @And("User click button shopping cart")
    public void buttonCart1()  {
        homePage.setButtonShoppingCart();
    }
}
