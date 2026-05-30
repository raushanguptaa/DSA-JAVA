package opps.encapsulation;

public class Employee {
    /*
    Question:
    Create an Employee class with:

    private String name;
    private double salary;

    Create getters and setters.

    Rule:
    Salary cannot be negative.

    If user tries to set negative salary,
    print:
    "Invalid Salary"

    In main():
    Create employee object.
    Set salary.
    Display employee details.
*/
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.out.println("Error!\nInvalid Salary");
        }else {
            this.salary = salary;
        }
    }

    public Employee(String name, double salary){
        this.name = name;
        setSalary(salary);
    }

    public void employeeDetails(){
        System.out.println("----------Employee Details----------");
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Salary: $%.2f\n", getSalary());
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 515461);

        emp1.employeeDetails();
    }

}
