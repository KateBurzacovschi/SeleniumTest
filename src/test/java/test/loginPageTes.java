package test;

import org.openqa.selenium.WebElement;
import page.loginPageWithPageFactory;
import testBase.BaseClas;
import testBase.BaseClass;
import utils.CommonMethod;

public class loginPageTes {
    public static void main(String[] args) {
        //open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
      loginPageWithPageFactory login=new loginPageWithPageFactory();
        WebElement user=login.userName;
        CommonMethod.sendText(user,"Admin");

        WebElement pass=login.password;
        CommonMethod.sendText(pass,"dffghh");
        login.loginBtn.click();

//take screenshot
        CommonMethod.takeTheSs("login page");

//close the browser
        BaseClas.tearDown();



    }
}
