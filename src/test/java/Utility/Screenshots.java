package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class Screenshots {

    public static void Screenshot(WebDriver driver, String screenshotname) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./Screenshots/" + screenshotname + ".png"));



    }

}

