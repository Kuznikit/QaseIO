package models;

public class ProjectDetailsFactory {
    public static ProjectDetails getData(){
        return new ProjectDetails(
                "Title description",
                "Deprecated",
                "Test cases without suite",
                "Blocker",
                "High",
                "Functional",
                "API",
                "Yes",
                "Not set",
                "Positive",
                "Automated");
    }

}
