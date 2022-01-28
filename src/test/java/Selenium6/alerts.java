package Selenium6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        //enable alert
        driver.findElement(By.xpath("//*[@id=\'alert\']")).click();
        Thread.sleep(2000);

       //switch the focus of selenium
      Alert simpleAlert =driver.switchTo().alert();
      simpleAlert.accept();

      //handling confirmation alert
      driver.findElement(By.xpath("//*[@id=\'confirm\']")).click();
      Thread.sleep(2000);
    Alert confAlert =driver.switchTo().alert();
        System.out.println( confAlert.getText());

        //cancel alert
        confAlert.dismiss();

        //prompt alert enable
        driver.findElement(By.xpath("//*[@id=\'prompt\']")).click();
      Alert  promptAlert=driver.switchTo().alert();
      promptAlert.sendKeys("Katya");
//accept
        promptAlert.accept();





    }
}
