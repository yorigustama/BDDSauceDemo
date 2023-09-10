package org.example.pageObject;

import org.openqa.selenium.By;
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
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement labelPriceTotal;
    private By descriptionElement = By.xpath("//div[text()='Sauce Labs Onesie']//ancestor::div[@class='inventory_item_name']");
    private By priceElement = By.xpath("//div[@class='summary_info_label summary_total_label']");


    @FindBy(xpath = "//button[@id='finish']")
    private WebElement buttonFinis;

//    public boolean setLabelPriceTotal(){
//        return labelPriceTotal.isDisplayed();
//    }

    public String getItemDescription(){
        return webDriver.findElement(descriptionElement).getText();
    }


    public String getItemPrice(){
        return webDriver.findElement(priceElement).getText();
    }

    public void setButtonFinis(){
        buttonFinis.click();
    }




}
