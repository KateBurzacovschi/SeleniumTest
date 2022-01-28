package Selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

    WebElement singleCheckbox= driver.findElement(By.cssSelector("input#isAgeSelected"));
    singleCheckbox.click();
    Thread.sleep(2000);
    singleCheckbox.click();

   List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
int size=checkBox.size();
        System.out.println("total number of checkboxes "+size);
for(WebElement check:checkBox){
    //check.click();


  String  valueAtrr=check.getAttribute("value");
    System.out.println(valueAtrr);

    if(valueAtrr.contains("Option-3")){
        check.click();
    }
}






    }
}
