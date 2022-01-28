package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"))
       .sendKeys("Admin");
       driver.findElement(By.xpath("(//span[@class='form-hint']/preceding-sibling::input)[2]"))
      .sendKeys("AgGg123");
       driver.findElement(By.xpath("//div[@id='divLoginButton']/child::input"))
       .click();

        WebElement sp=driver.findElement(By.xpath("//input[@id='btnLogin']/following-sibling::span"));
        System.out.println(sp.getText());

        //driver.quit();
    }
}
