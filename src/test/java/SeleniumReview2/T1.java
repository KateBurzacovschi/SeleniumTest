package SeleniumReview2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class T1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/selenium/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement FirstName=driver.findElement(By.xpath("//*[@name='firstName']"));
        FirstName.clear();
        FirstName.sendKeys("Kate");

        WebElement LastName=driver.findElement(By.xpath("//*[@name='lastName']"));
        LastName.clear();
       LastName.sendKeys("Burz");

        WebElement phone=driver.findElement(By.xpath("//*[@name='phone']"));
        phone.clear();
        phone.sendKeys("1234555");

        WebElement email=driver.findElement(By.xpath("//*[@name='userName']"));
        email.clear();
        email.sendKeys("adc@.com");

        WebElement address=driver.findElement(By.xpath("//*[@name='address1']"));
        address.clear();
        address.sendKeys("large street");

        WebElement city= driver.findElement(By.xpath("//*[@name='city']"));
        city.clear();
        city.sendKeys("Herndon");

        WebElement state= driver.findElement(By.xpath("//*[@name='state']"));
        state.clear();
        state.sendKeys("Herndon");

        WebElement postalcode= driver.findElement(By.xpath("//*[@name='postalCode']"));
        postalcode.clear();
        postalcode.sendKeys("Herndon");

        WebElement country=driver.findElement(By.xpath("//*[@name='country']"));
        Select s=new Select(country);
        s.selectByVisibleText("UNITED STATES");

        WebElement username=driver.findElement(By.cssSelector("input#email"));
       username.clear();
       username.sendKeys("Hasim123");



       WebElement pass=driver.findElement(By.xpath("//*[@name='password']"));
       pass.clear();
       pass.sendKeys("Test@123");


        WebElement cofpass=driver.findElement(By.xpath("//*[@name='confirmPassword']"));
        cofpass.clear();
       cofpass.sendKeys("Test@123");

WebElement subm=driver.findElement(By.xpath("//*[@name='submit']"));
subm.click();






    }
}
