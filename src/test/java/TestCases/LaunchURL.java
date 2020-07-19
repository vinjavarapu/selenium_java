package TestCases;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LaunchURL extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {

        driver.get(baseURL);
        driver.manage().window().maximize();
        LoginPage login = new LoginPage(driver);
        login.enterUsername();
        Thread.sleep(9000);

    }
}


