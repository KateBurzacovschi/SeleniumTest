package Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Pagination {
    public static String url = "https://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        WebElement nxtBtn = driver.findElement(By.xpath("//a[@class='next_link']"));


        boolean notFound = true;
        while (notFound) {
            for (WebElement tableRow : tableRows) {
                String text = tableRow.getText();
                if (text.contains("Archy J")) {
                    System.out.println(text);
                    notFound = false;
                    break;
                }
            }
            nxtBtn.click();


            boolean found = false;
            while (!found) {
                for (WebElement tableRow : tableRows) {
                    String textofRow = tableRow.getText();
                    if (textofRow.contains("Archy J")) {
                        System.out.println(textofRow);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    nxtBtn.click();
                }
            }
        }
    }

}
