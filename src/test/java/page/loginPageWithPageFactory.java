package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethod;

public class loginPageWithPageFactory extends CommonMethod {
@FindBy(id="txtUsername")
    public WebElement userName;
    @FindBy(name="txtPassword")
    public WebElement password;
    @FindBy (name="Submit")
    public  WebElement loginBtn;


    public loginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
