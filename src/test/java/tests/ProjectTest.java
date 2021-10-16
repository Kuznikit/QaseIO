package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class ProjectTest extends BaseTest{
    @Test
    public void projectShouldBeCreated(){
        new LoginPage()
                .open()
                .login("kuznikit@gmail.com","Qazxcv123")
                .create("qwe","12","qwe","Public", "Add members from specific group");

    }
}
