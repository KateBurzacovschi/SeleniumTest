package HWSelenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("the size of list containig is "+links.size());

        for(WebElement link:links){
          String Text =link.getText();
          if(!Text.isEmpty()){
              System.out.println(Text);
          }
        }
    }
}
