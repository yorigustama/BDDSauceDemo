package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckOutComplete;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutCompleteSteps {
    private final WebDriver driver = Hooks.driver;
   CheckOutComplete checkOutCompleteut = new CheckOutComplete(driver);
    @And("User already to Thank you page")
    public void labelThankYou(){
        Assert.assertTrue(checkOutCompleteut.setLabelThankYou());
    }

}
