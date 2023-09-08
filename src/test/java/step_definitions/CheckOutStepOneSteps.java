package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckOutStepOnePage;
import org.openqa.selenium.WebDriver;


public class CheckOutStepOneSteps {
    private final WebDriver driver = Hooks.driver;
    CheckOutStepOnePage checkOutStepOnePage = new CheckOutStepOnePage(driver);

    @And("User input firstName {string} lastName {string} and zip {string} check out information")
    public void inputCheckOutInformation(String fName, String lName, String zip) {
        checkOutStepOnePage.setInputFirstName(fName);

        checkOutStepOnePage.setInputLastName(lName);

        checkOutStepOnePage.setInputZip(zip);

        checkOutStepOnePage.setButtonContinue();
    }



}
