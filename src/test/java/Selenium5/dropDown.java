package Selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find the WebElement :dropdown
      WebElement days= driver.findElement(By.cssSelector("select#select-demo"));

        //use the select class to select from dropdown

     Select select=new Select(days);
     select.selectByIndex(1);

     Thread.sleep(2000);

     select.selectByIndex(2);

//select by text
     select.selectByVisibleText("Thursday");

   //select by value


   select.selectByValue("Wednesday");

     List< WebElement>  allOption=select.getOptions();
     int Size=allOption.size();
        System.out.println(Size);

        for(int i=0;i<Size;i++){
     String OptionText=allOption.get(i).getText();
            System.out.println(OptionText);
            System.out.println("*********************");


            Iterator<WebElement> iterator= allOption.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next().getText());
            }







        }






    }
}
