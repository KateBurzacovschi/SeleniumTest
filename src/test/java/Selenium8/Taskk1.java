package Selenium8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Taskk1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//*[@id='startButton']"));
        element.click();

        Thread.sleep(6000);
        WebElement element1 = driver.findElement(By.xpath("//*[@id='finish']/h4"));
        System.out.println(element1.getText());
        driver.quit();


    }
}
