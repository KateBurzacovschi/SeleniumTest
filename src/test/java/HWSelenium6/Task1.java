package HWSelenium6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
        Thread.sleep(2000);
        Alert confAlert=driver.switchTo().alert();
        confAlert.accept();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        Alert promAlert=driver.switchTo().alert();
        promAlert.accept();

    }
}
