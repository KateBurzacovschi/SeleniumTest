package test;

import org.openqa.selenium.WebElement;
import page.LoginPage;
import testBase.BaseClass;
import utils.CommonMethods;

public class loginPageTest {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
       loginPage.passwordField.sendKeys("Hum@nhrm123");
       loginPage.loginBtn.click();

        //WebElement username=loginPage.userNameField;
        //CommonMethods.sendText(username,"Admin");
    }
}
