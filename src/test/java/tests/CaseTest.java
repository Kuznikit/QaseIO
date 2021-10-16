package tests;

import models.ProjectDetails;
import models.ProjectDetailsFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CaseTest extends BaseTest{
    ProjectDetails projectDetails;
    @Test
    public void testCaseShouldBeCreated(){
        new LoginPage()
                .open()
                .login()
                .openProject()
                .selectingDropDownFields(projectDetails= ProjectDetailsFactory.get());
        //open project by name ABC
        //create case
        //validate info
    }
}
