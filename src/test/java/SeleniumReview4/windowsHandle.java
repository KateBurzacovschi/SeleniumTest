package SeleniumReview4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowsHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com/mail/u/0/?pli=1#inbox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //click on facebook link
  WebElement fb= driver.findElement(By.xpath("//a[text()='Terms']"));
  fb.click();

        String mainpageHandle = driver.getWindowHandle();
        System.out.println("the current pagehandle is "+ mainpageHandle);

   Set<String> allHandles=driver.getWindowHandles();


        Iterator<String> it=allHandles.iterator();
        while(it.hasNext()){
         String handle=it.next();
         driver.switchTo().window(handle);
         if(driver.getCurrentUrl().equalsIgnoreCase("https://policies.google.com/terms?gl=PK&hl=en-GB")){
             System.out.println(driver.getTitle());
             break;
         }

        }
        driver.findElement(By.xpath("//a[text()='Overview']")).click();
        driver.switchTo().defaultContent();
    }
}
