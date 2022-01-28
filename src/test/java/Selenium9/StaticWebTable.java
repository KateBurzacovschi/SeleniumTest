package Selenium9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebTable {
    public static String url="https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

     List<WebElement> tableRows= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println("the number of rows in the table are..."+tableRows.size());

        for(WebElement row:tableRows){
          String  text=row.getText();
            System.out.println(text);

            List<WebElement> col2= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
            for(WebElement col:col2){
                System.out.println("the data for column 2 is..."+col.getText());
            }




        }
    }
}
