package thoughtclan;

public class Manager extends Employee {
    public Manager(String empId, String name, Department department) {
        super(empId, name, department, EmployeeType.MANAGER, getHardcodedSalary(department));
    }

    private static double getHardcodedSalary(Department department) {
        switch (department) {
            case JAVA: return 90000;
            case DATA_SCIENCE: return 95000;
            case DEVOPS: return 92000;
            case DOT_NET: return 88000;
            default: return 85000;
        }
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Manager) oversees projects in " + department + " department.");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // Managers get 15% bonus
    }
}
