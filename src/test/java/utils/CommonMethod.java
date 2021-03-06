package utils;

import com.oracle.tools.packager.IOUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import testBase.BaseClass;

import java.io.File;
import java.io.IOException;

public class CommonMethod extends BaseClass {


    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void takeTheSs(String filename) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File ss = ts.getScreenshotAs(OutputType.FILE);
        //save screenshot in our comp
        try {
            FileUtils.copyFile(ss, new File("screenshot/POM/" + filename + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
