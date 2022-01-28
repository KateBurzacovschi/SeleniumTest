package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class loginWithPageFactory extends CommonMethods {

        @FindBy(id="txtUsername")
        public WebElement username;
        @FindBy(id="txtPassword")
        public WebElement password;
        @FindBy (id="btnLogin")
        public  WebElement loginBtn;

        public loginWithPageFactory(){
            PageFactory.initElements(driver,this);
        }
    }

