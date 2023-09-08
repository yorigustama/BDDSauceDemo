package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckOutStepTwoPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutStepTwoPageSteps {
    private final WebDriver driver = Hooks.driver;
    CheckOutStepTwoPage checkOutStepTwoPage = new CheckOutStepTwoPage(driver);

    @Then("User already to check out page and click button finis")
    public void checkOutPage() {
        Assert.assertTrue(checkOutStepTwoPage.setLabelPriceTotal());
        checkOutStepTwoPage.setButtonFinis();
    }
}
