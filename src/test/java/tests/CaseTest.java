package tests;

import models.ProjectDetails;
import models.ProjectDetailsFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectDetailsPage;

public class CaseTest extends BaseTest{

    @Test(description= "Filling all fields in test case")
    public void testCaseShouldBeCreated() {
        new LoginPage()
                .open()
                .login(user, password)
                .openProject("qwe");
        ProjectDetails projectDetails = ProjectDetailsFactory.getData();
        new ProjectDetailsPage()
                .selectingDropDownFields(projectDetails);

        //open project by name ABC
        //create case
        //validate info
    }
}
