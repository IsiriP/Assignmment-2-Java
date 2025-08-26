package thoughtclan;

public class Project {
    private String projectId;
    private String projectName;
    private ProjectStatus status;

    public Project(String projectId, String projectName, ProjectStatus status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.status = status;
    }

    public String getProjectName() {
        return projectName;
    }

    @Override
    public String toString() {
        return "ProjectID: " + projectId + " | Name: " + projectName + " | Status: " + status;
    }
}
