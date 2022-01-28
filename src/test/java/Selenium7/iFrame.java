package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
    WebElement text1=  driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is :"+ text1.getText());


         driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is :"+text2.getText());

        driver.switchTo().defaultContent();
    }
}
