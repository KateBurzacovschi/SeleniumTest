package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClas {
    public  static WebDriver driver;
    //this method will navigate to a given URL
    //@param url
    public static void openWithSpecificUrl(String url){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    //this method will quit the opened browser
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}



