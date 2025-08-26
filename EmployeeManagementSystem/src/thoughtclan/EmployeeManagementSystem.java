package thoughtclan;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employees
        Employee m1 = new Manager("M001", "Isiri", Department.JAVA);
        Employee m2 = new Manager("M002", "Akshay", Department.DATA_SCIENCE);
        Employee d1 = new Developer("D001", "Anu", Department.JAVA);
        Employee d2 = new Developer("D002", "Prakash", Department.DEVOPS);
        Employee d3 = new Developer("D003", "Raju", Department.DOT_NET);

        // Create Projects
        Project p1 = new Project("P001", "Banking App", ProjectStatus.ONGOING);
        Project p2 = new Project("P002", "AI Model", ProjectStatus.PENDING);
        Project p3 = new Project("P003", "DevOps Automation", ProjectStatus.ONGOING);

        m1.assignProject(p1);
        d1.assignProject(p1);
        m2.assignProject(p2);
        d2.assignProject(p3);
        d3.assignProject(p2);

        System.out.println("\n--- Employee Details ---");
        m1.displayDetails(true);
        m2.displayDetails(true);
        d1.displayDetails(true);
        d2.displayDetails(true);
        d3.displayDetails(true);

        System.out.println("\n--- Projects Assigned ---");
        m1.showProjects();
        m2.showProjects();
        d1.showProjects();
        d2.showProjects();
        d3.showProjects();

        System.out.println("\n--- Duties ---");
        m1.performDuties();
        d1.performDuties();

        System.out.println("\n--- Promotions ---");
        m1.promote("Senior Manager");
        d1.promote("Tech Lead");
    }
}
