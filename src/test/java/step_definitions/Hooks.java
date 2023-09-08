package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser(){
        //WebDriverManager.chromedriver().clearDriverCache().setup();
        //buka chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        //inisiasi librery selenium
        driver = new ChromeDriver(co);

        //membuka saucedome
        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl); //open link
        driver.manage().window().maximize(); //max browser
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }


}
