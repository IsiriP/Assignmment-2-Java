package thoughtclan;

public class Developer extends Employee {
    public Developer(String empId, String name, Department department) {
        super(empId, name, department, EmployeeType.DEVELOPER, getHardcodedSalary(department));
    }

    private static double getHardcodedSalary(Department department) {
        switch (department) {
            case JAVA: return 60000;
            case DATA_SCIENCE: return 65000;
            case DEVOPS: return 62000;
            case DOT_NET: return 58000;
            default: return 55000;
        }
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Developer) is coding for projects in " + department + " department.");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; // Developers get 10% bonus
    }
}
