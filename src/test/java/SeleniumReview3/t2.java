package SeleniumReview3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkbox = driver.findElement(By.xpath("//*[@value='Option']"));
        

    }
}
