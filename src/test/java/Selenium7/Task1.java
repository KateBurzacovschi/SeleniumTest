package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);

        WebElement element = driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(element);
        System.out.println("the text of child frame is: "+driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());

    }
}
