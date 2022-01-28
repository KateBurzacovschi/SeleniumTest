package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethod;

public class Dashboardpage extends CommonMethod {
    @FindBy(id="welcome")
    public WebElement welcomeMessage;

    public Dashboardpage(){
        PageFactory.initElements(driver,this);
    }
}
