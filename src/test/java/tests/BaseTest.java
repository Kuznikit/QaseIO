package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup() {
        //ImplicitlyWait
        Configuration.timeout = 10000;
        //Browser Type
        Configuration.browser = "chrome";
        //Base URL
        Configuration.baseUrl = "https://app.qase.io/";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        //All clicks
        Configuration.clickViaJs = false;
    }

}
