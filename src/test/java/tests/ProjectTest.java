package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class ProjectTest extends BaseTest{
    @Test(description = "Create new project with name qwe")
    public void projectShouldBeCreated(){
        new LoginPage()
                .open()
                .login(user,password)
                .create("qwe","12","qwe","Public", "Add members from specific group");

    }
}
