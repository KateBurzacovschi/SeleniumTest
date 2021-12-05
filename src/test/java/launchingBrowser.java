
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class launchingBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

driver.get("http://www.google.com");
String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is : "+url);
String title= driver.getTitle();
        System.out.println("The current title of the page is: "+ title);
driver.quit();
    }
}
