package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelYourCard;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement buttonRemoveCard;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckOut;

    public boolean setLabelYourCardDisplayed(){
        return labelYourCard.isDisplayed();
    }
    public void setButtonRemoveCard(){
        buttonRemoveCard.click();
    }
    public void setButtonCheckOut(){
        buttonCheckOut.click();
    }
}
