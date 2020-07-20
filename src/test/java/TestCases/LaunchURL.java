package TestCases;

import Pages.LoginPage;
import Utility.Screenshots;
import org.testng.annotations.Test;

import java.io.IOException;

public class LaunchURL extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException, IOException {

        driver.get(baseURL);
        driver.manage().window().maximize();
        LoginPage login = new LoginPage(driver);
        login.enterUsername();
        Screenshots.Screenshot(driver,"ravi");
        login.enterPassword();
        login.ClickLoginButton();

        driver.switchTo().alert().accept();

        Screenshots.Screenshot(driver,"loginmessage");


    }
}


