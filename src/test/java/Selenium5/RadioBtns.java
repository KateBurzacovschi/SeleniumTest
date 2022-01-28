package Selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        WebElement username= driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        username.sendKeys("AON");
        Thread.sleep(2000);
        username.clear();
        Thread.sleep(2000);
        username.sendKeys("Tester");


    }
}
