package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwoPage {
    public static WebDriver webDriver;

    public CheckOutStepTwoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[.='Price Total']")
    private WebElement labelPriceTotal;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement buttonFinis;

    public boolean setLabelPriceTotal(){
        return labelPriceTotal.isDisplayed();
    }
    public void setButtonFinis(){
        buttonFinis.click();
    }
}
