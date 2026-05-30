package collections.list.arraylist;

import java.util.ArrayList;

public class EmployeeArrayListDemo {
    /*
        Question:
        Create Employee class:

        id
        name
        salary

        Create ArrayList<Employee>

        Add:

        101, John, 50000
        102, Alice, 60000
        103, Bob, 55000

        Print all employee details.

        Also find:

        Employee with the highest salary.

        Output:

        Employee Details:
        101 John 50000
        102 Alice 60000
        103 Bob 55000

        Highest Salary:
        Alice - 60000
    */

    static class Employee{
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", 50000));
        employees.add(new Employee(102, "Alice", 60000));
        employees.add(new Employee(103, "Bob", 55000));

        for (Employee employee: employees){
            System.out.printf("Id: %d, Name: %s, Salary: %.2f%n", employee.id, employee.name, employee.salary);
        }

        //Employee with the highest salary
        Employee highestSalary = employees.get(0);

        for (Employee employee: employees){
            if (employee.salary > highestSalary.salary){
                highestSalary = employee;
            }
        }
        System.out.println("\nHighest Salary Employee:");
        System.out.printf("%s - %.2f %n",highestSalary.name, highestSalary.salary);
    }
}
