package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Katya");
        driver.findElement((By.cssSelector("input[placeholder='Last Name']"))).sendKeys("Burzacovski");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("katya@burz");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("2345434532");
        driver.findElement(By.cssSelector("input[name*='ad']")).sendKeys("12 armits street");
        driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("Brooklyn");
        driver.findElement(By.cssSelector("select[class*='selectpicker']")).sendKeys("NY");
        driver.findElement(By.cssSelector("input[name*='zip']")).sendKeys("34444");
        driver.findElement(By.cssSelector("input[name*='web']")).sendKeys("www.ghy.com");
        driver.findElement(By.cssSelector("input[type*='ra']")).click();
        driver.findElement(By.cssSelector("textarea[placeholder*='on']")).sendKeys("test for selenium");
        driver.findElement(By.cssSelector("button[onclick*='r']")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
