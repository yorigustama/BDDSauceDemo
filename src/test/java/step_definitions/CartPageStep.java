package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartPageStep {
    private final WebDriver driver = Hooks.driver;
    CartPage cartPage = new CartPage(driver);

    @Then("User already on your cart page")
    public void labelCart() {
        Assert.assertTrue(cartPage.setLabelYourCardDisplayed());

    }

    @When("User can delete item Sauce Labs Onesie")
    public void buttonDeletItem() {
        cartPage.setButtonRemoveCard();

    }

    @And("User click button check out")
    public void buttonCheckOut() {
        cartPage.setButtonCheckOut();
    }




}