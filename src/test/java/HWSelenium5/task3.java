package HWSelenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        Thread.sleep(3000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Kate");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Burz");

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("345-456-2323");

        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Kate123");

        WebElement dropDownMonth = driver.findElement(By.cssSelector("select#month"));
        new Select(dropDownMonth).selectByValue("10");

       WebElement day= driver.findElement(By.cssSelector("select#day"));
       new Select (day).selectByIndex(4);

       WebElement year=driver.findElement(By.cssSelector("select#year"));
       new Select(year).selectByValue("2000");

       driver.findElement(By.xpath("//input[@value='1']")).click();

       driver.findElement(By.xpath("//button[@name='websubmit']")).click();
       Thread.sleep(5000);
       driver.quit();

    }
}
