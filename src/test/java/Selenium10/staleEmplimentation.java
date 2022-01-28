package Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class staleEmplimentation {

        public static String url="https://chercher.tech/practice/stale-element";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

            WebElement refreshbtn = driver.findElement(By.cssSelector("button#refresh-button"));
            Thread.sleep(11000);

            refreshbtn = driver.findElement(By.cssSelector("button#refresh-button"));
            refreshbtn.click();


        }
}
