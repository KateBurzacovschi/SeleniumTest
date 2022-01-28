package Selenium9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {
    public static String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();

    List<WebElement>rows= driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
    for(int i=1;i<rows.size();i++){
        String rowtext = rows.get(i).getText();
        System.out.println(rowtext);

        if(rowtext.contains("ScreenSaver")){
      List<WebElement>  checkboxes= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
            checkboxes.get(i).click();
        }


    }
    }
}
