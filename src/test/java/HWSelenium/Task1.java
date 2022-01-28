package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("");
        driver.findElement(By.id("btnLogin")).click();
        driver.quit();

    }
}
