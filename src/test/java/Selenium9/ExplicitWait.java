package Selenium9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait");
     driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

WebElement enableBtn=driver.findElement(By.xpath("//*[@id='enable-button']"));
enableBtn.click();

WebDriverWait wait=new WebDriverWait(driver,12);
      wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));

 WebElement btn=driver.findElement(By.cssSelector("button#disable")) ;
 boolean status=btn.isEnabled();
        System.out.println(status);


    }
}
