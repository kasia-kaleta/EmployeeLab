package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String setName(String newName){
        if (newName != null){
        return this.name = newName;
        }
        return newName;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }


    public void raiseSalary(double raiseAmount) {
        this.salary += raiseAmount;

    }

    public double payBonus(){
        return this.salary / 100.00;

    }
}
