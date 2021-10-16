package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import utils.PropertyReader;

public class BaseTest {
    public String user;
    public String password;
    @BeforeMethod
    public void setup() {
        //ImplicitlyWait
        Configuration.timeout = 10000;
        //Browser Type
        Configuration.browser = "chrome";
        //Base URL
        Configuration.baseUrl = System.getenv().getOrDefault("QASE_URL",
                PropertyReader.getProperty("qase.url"));
        user = System.getenv().getOrDefault("QASE_USER",
                PropertyReader.getProperty("qase.user"));
        password = System.getenv().getOrDefault("QASE_PASSWORD",
                PropertyReader.getProperty("qase.pass"));
        Configuration.startMaximized = true;
        Configuration.headless = false;
        //All clicks
        Configuration.clickViaJs = false;
    }

}
