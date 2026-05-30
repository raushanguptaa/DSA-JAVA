package opps.inheritance;

public class PersonStudentDemo {

    /*
    Question:
    Create Person class:

    name
    age

    Create Student class extending Person:

    course

    Create constructor for both classes.

    Display:
    Name
    Age
    Course

    Expected Output:

    --------- Student Details ---------
    Name: Rohit
    Age: 22
    Course: B.Tech

    --------- Student Details ---------
    Name: Mohit
    Age: 23
    Course: B.Sc
    */

    static class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Student extends Person {

        String course;

        Student(String name, int age, String course) {
            super(name, age);
            this.course = course;
        }

        void displayDetails() {

            System.out.println("--------- Student Details ---------");

            System.out.println("Name: " + name);

            System.out.println("Age: " + age);

            System.out.println("Course: " + course);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Student st1 =
                new Student("Rohit", 22, "B.Tech");

        Student st2 =
                new Student("Mohit", 23, "B.Sc");

        st1.displayDetails();

        st2.displayDetails();
    }
}
