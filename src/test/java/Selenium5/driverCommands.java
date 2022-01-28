package Selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ebay.com/");

        //driver.findElement(By.tagName("a"));
     List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("the size of list containig is "+links.size());

        for(WebElement link:links){
           String LinkText= link.getText();
           if(!LinkText.isEmpty()) {
               System.out.println(LinkText);


          String LinkAdress= link.getAttribute("href");
               System.out.println(LinkAdress);
           }
        }
    }
}
