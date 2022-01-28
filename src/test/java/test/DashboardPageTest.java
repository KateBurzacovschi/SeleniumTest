package test;

import org.openqa.selenium.WebElement;
import page.Dashboardpage;
import page.loginPageWithPageFactory;
import testBase.BaseClas;
import testBase.BaseClass;
import utils.CommonMethod;

public class DashboardPageTest {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        loginPageWithPageFactory login=new loginPageWithPageFactory();
        WebElement user=login.userName;
        CommonMethod.sendText(user,"Admin");

        WebElement pass=login.password;
        CommonMethod.sendText(pass,"Hum@nhrm123");
        login.loginBtn.click();

        Dashboardpage dasboard=new Dashboardpage();
        WebElement message=dasboard.welcomeMessage;
        System.out.println(message.getText());

        CommonMethod.takeTheSs("dashboardPage");

    }
}
