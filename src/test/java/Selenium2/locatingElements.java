package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");

        driver.findElement(By.id("email")).sendKeys("ecaterina.burzacovschi@gmail.com");
        driver.findElement(By.name("email")).sendKeys("katia");
        driver.findElement(By.name("pass")).sendKeys("hghghghg");
        //driver.findElement(By.linkText("Forgot password?")).click();
       // driver.findElement(By.partialLinkText("Forgot ")).click();

    }
}
