package Selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;

public class multippleSelectDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
       WebElement statesDD= driver.findElement(By.cssSelector("select#multi-select"));

        Select select=new Select(statesDD);
     Boolean isMul =select.isMultiple();
        System.out.println(isMul);

        select.selectByIndex(4);
        Thread.sleep(3000);
        select.selectByVisibleText("Texas");
        Thread.sleep(3000);
        select.selectByValue("Ohio");
        Thread.sleep(3000);


        select.deselectByIndex(2);
        Thread.sleep(3000);
        select.deselectByVisibleText("Texas");




    }
}
