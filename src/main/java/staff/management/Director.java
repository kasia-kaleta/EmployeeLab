package staff.management;

import staff.Employee;

public class Director extends Employee {

    private double budget;
    private String deptName;

    public Director(String name, String NI, double salary, String deptName, double budget) {
        super(name, NI, salary);
        this.deptName = deptName;
        this.budget = budget;
    }


    public double getBudget() {
        return budget;
    }
}
