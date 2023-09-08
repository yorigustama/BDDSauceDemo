package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public static WebDriver webDriver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filterProduct;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement buttonShoppingCart;

    public void selectFilterProduct(String filterProduct1){
        Select filter = new Select(filterProduct);
        filter.selectByValue(filterProduct1);
    }
    public void clickButtonAddToCard(String item){
        String xpath = "//div[text()='" + item + "']/ancestor::div[@class='inventory_item']//button";
        webDriver.findElement(By.xpath(xpath)).click();
    }

    public void setButtonShoppingCart(){
        buttonShoppingCart.click();
    }


}
