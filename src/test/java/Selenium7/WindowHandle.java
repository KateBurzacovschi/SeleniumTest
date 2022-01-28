package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

        WebElement element = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termbtn=driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacybtn=driver.findElement(By.xpath("//a[text()='Privacy']"));

        element.click();
        termbtn.click();
        privacybtn.click();

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println(windowHandles.size());

        Iterator<String>it=windowHandles.iterator();

        while(it.hasNext()){
            String handle = it.next();
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")){
                System.out.println(title);
                break;
            }
        }
        String helpPageHandle=it.next();
        String termPageHandle=it.next();
        String privacyPagehandle=it.next();
        System.out.println("the handle for helpPage pages is: "+helpPageHandle);
        System.out.println("the handle for termPage pages is: "+termPageHandle);
        System.out.println("the handle for termPage pages is: "+termPageHandle);

        driver.switchTo().window(privacyPagehandle);
        System.out.println( driver.getTitle());


    }
}
