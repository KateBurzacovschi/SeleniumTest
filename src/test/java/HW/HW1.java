package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Ecaterina");
        driver.findElement(By.name("customer.lastName")).sendKeys("Burz");
        driver.findElement(By.id("customer.adress.street")).sendKeys("Brook");
        driver.findElement(By.id("customer.adress.city")).sendKeys("Fairfax");
        driver.findElement(By.name("customer.adress.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("345-345-3455");
        driver.findElement(By.id("customer.ssn")).sendKeys("674-34-4544");


        driver.findElement(By.name("customer.username")).sendKeys("Kate");
        driver.findElement(By.id("customer.password")).sendKeys("Kate123");
        driver.findElement(By.id("reapetedPassword")).sendKeys("Kate123");
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}
