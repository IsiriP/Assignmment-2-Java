package thoughtclan;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Workable {
    protected String empId;
    protected String name;
    protected double salary;
    protected Department department;
    protected EmployeeType type;
    protected List<Project> projects;

    public Employee(String empId, String name, Department department, EmployeeType type, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = salary;
        this.projects = new ArrayList<>();
    }

    public abstract double calculateBonus();

    public void displayDetails() {
        System.out.println("ID: " + empId + " | Name: " + name +
                " | Department: " + department + " | Role: " + type +
                " | Salary: " + salary);
    }

    public void displayDetails(boolean showBonus) {
        displayDetails();
        if (showBonus) {
            System.out.println("Calculated Bonus: " + calculateBonus());
        }
    }

    public void assignProject(Project project) {
        projects.add(project);
        System.out.println("Assigned project '" + project.getProjectName() + "' to " + name);
    }

    public void showProjects() {
        System.out.println("\nProjects for " + name + ":");
        if (projects.isEmpty()) {
            System.out.println("No projects assigned.");
        } else {
            for (Project p : projects) {
                System.out.println(p);
            }
        }
    }

    public void promote(String newRole) {
        System.out.println(name + " has been promoted to " + newRole);
    }
}
