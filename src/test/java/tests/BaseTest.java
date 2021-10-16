package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import utils.PropertyReader;

public class BaseTest {
    String user;
    String password;
    @BeforeMethod
    public void setup() {
        //ImplicitlyWait
        Configuration.timeout = 10000;
        //Browser Type
        Configuration.browser = "chrome";
        //Base URL
        Configuration.baseUrl = PropertyReader.getProperty("qase.url");
        user = PropertyReader.getProperty("qase.user");
        password = PropertyReader.getProperty("qase.pass");
        Configuration.startMaximized = true;
        Configuration.headless = false;
        //All clicks
        Configuration.clickViaJs = false;
    }

}
