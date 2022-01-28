package Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExPagination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();

        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList")).click();

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
        WebElement nxtBtn = (WebElement) driver.findElements(By.xpath("//li[@class='next']"));


        boolean notFound=true;
        while(notFound) {
            for (int i = 0; i < tableRows.size(); i++) {
                String text = tableRows.get(i).getText();

                if (text.contains("26335A")) {
                    System.out.println("i found the text");
                }
            }
            if(notFound) {
                WebElement nxtBt=driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nxtBtn.click();

            }
        }
    }
}
