package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();
        WebElement Link = driver.findElement(By.xpath("//a[contains(@id,'btn_b'"));
        Link.click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Simple Form Demo']")).click();
    driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("batch 11");
    driver.findElement(By.xpath("//button[text()=\"Show Message\"]")).click();
    }
}
