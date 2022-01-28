package SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Review1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println("browser launched");

        driver.get("https://www.google.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        }
    }
