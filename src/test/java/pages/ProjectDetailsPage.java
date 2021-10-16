package pages;

import models.ProjectDetails;
import wrappers.DropDown;

import static com.codeborne.selenide.Selenide.$;

public class ProjectDetailsPage {
    public static final String TITLE = "#title";

    public ProjectDetailsPage selectingDropDownFields(ProjectDetails projectDetails) {
        $(TITLE).sendKeys(projectDetails.getTitle());
        new DropDown("Status").select(projectDetails.getStatus());
        new DropDown("Suite").select(projectDetails.getSuite());
        new DropDown("Severity").select(projectDetails.getSeverity());
        new DropDown("Priority").select(projectDetails.getPriority());
        new DropDown("Type").select(projectDetails.getType());
        new DropDown("Layer").select(projectDetails.getLayer());
        new DropDown("Is Flaky").select(projectDetails.getIsFlaky());
        new DropDown("Milestone").select(projectDetails.getMilestone());
        new DropDown("Behavior").select(projectDetails.getBehavior());
        new DropDown("Automation status").select(projectDetails.getAutomationStatus());
        return this;
    }
}
