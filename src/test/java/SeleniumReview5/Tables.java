package SeleniumReview5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tables {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

//        login code     username:Admin  password :Hum@nhrm123
//        for username
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");

//        for password
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");

//        for login btn
        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
//        click login btn
        loginBtn.click();

//        click on PIM
        WebElement PIM = driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        PIM.click();
//        click on EmployeeList
        WebElement EmployeeList = driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList"));
        EmployeeList.click();


        boolean notFound = true;
        while (notFound) {
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));


            for (int i = 0; i < rows.size(); i++) {

                String rowText = rows.get(i).getText();

                if (rowText.contains("25677A")) {
                    System.out.println(rowText);
                    System.out.println("the index of id is : "+i);

            WebElement checkbox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td/input"));
                    checkbox.click();
                    notFound = false;
                    break;
                }
            }
            if (notFound) {
                WebElement nxtBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nxtBtn.click();
            }


        }
    }
}
