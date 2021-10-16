package pages;

import com.codeborne.selenide.Condition;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class ProjectsPage {
    public pages.ProjectsPage shouldBeOpened() {
        $("#createButton").shouldBe(Condition.visible);
        return this;
    }

    public ProjectDetailsPage openProject(String name) {
        $$("a.defect-title").findBy(Condition.text(name)).click();
        $$(By.xpath("//a[contains(@class, 'btn btn-primary ms-3')]")).findBy(Condition.text("Create new case")).click();
        return new ProjectDetailsPage();
    }

    public void create(String projectName, String projectCode, String description,
                       String accessType, String memberAccess) {
        $("#createButton").click();
        $("#inputTitle").sendKeys(projectName);
        if (StringUtils.isNotEmpty(projectCode)) {
            $("#inputCode").sendKeys(projectCode);
        }
        $("#inputDescription").sendKeys(description);
        switch (accessType) {
            case "Private": {
                $("#private-access-type").click();
                switch (memberAccess) {
                    case "Add all members to this project": {
                        $("#accessAll").click();
                        break;
                    }
                    case "Add members from specific group": {
                        $("#accessGroup").click();
                        break;
                    }
                    case "Don't add members": {
                        $("#accessNone").click();
                        break;
                    }
                }
                break;
            }
            case "Public": {
                $("#public-access-type").click();
                break;
            }
        }
        $(byText("Create project")).click();
    }
}
