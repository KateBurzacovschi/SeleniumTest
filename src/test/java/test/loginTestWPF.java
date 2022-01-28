package test;

import page.loginWithPageFactory;
import testBase.BaseClass;

public class loginTestWPF {


        public static void main(String[] args) {

//        open the browser
            BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

//        create an object of loginwithPageFactory

           loginWithPageFactory login= new loginWithPageFactory();

            login.username.sendKeys("Admin");
            login.password.sendKeys("HRM@nhrm123");
            login.loginBtn.click();

//        close browser
            BaseClass.tearDown();

        }

}
