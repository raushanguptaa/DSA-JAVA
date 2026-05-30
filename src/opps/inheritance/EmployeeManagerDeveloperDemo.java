package opps.inheritance;

public class EmployeeManagerDeveloperDemo {
     /*
    Question:
    Create Employee class:

    name
    salary

    Create Manager class extending Employee:
    teamSize

    Create Developer class extending Employee:
    programmingLanguage

    Display details of both objects.

    Expected Output:

    ---------- Manager Details ----------
    Name: John
    Salary: 80000.00
    Team Size: 10

    ---------- Developer Details ----------
    Name: Alice
    Salary: 70000.00
    Programming Language: Java
    */

    static class Employee {

        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.printf("Salary: %.2f%n", salary);
        }
    }

    static class Manager extends Employee {

        int teamSize;

        Manager(String name, double salary, int teamSize) {
            super(name, salary);
            this.teamSize = teamSize;
        }

        void displayManagerInfo() {

            System.out.println("---------- Manager Details ----------");

            displayInfo();

            System.out.println("Team Size: " + teamSize);

            System.out.println();
        }
    }

    static class Developer extends Employee {

        String programmingLanguage;

        Developer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }

        void displayDeveloperInfo() {

            System.out.println("---------- Developer Details ----------");

            displayInfo();

            System.out.println("Programming Language: " + programmingLanguage);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Manager manager =
                new Manager("John", 80000, 10);

        Developer developer =
                new Developer("Alice", 70000, "Java");

        manager.displayManagerInfo();

        developer.displayDeveloperInfo();
    }
}
