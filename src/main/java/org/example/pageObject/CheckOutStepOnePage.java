package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePage {
    public static WebDriver webDriver;

    public CheckOutStepOnePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement inputZip;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;

    public void setInputFirstName(String inputFirstName1){
        inputFirstName.sendKeys(inputFirstName1);
    }
    public void setInputLastName(String inputLastName1){
        inputLastName.sendKeys(inputLastName1);
    }
    public void setInputZip(String inputZip1){
        inputZip.sendKeys(inputZip1);
    }
    public void setButtonContinue(){
        buttonContinue.click();
    }
}
