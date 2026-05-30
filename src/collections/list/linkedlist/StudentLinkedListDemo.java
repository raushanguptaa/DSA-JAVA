package collections.list.linkedlist;

import opps.encapsulation.Student;

import java.util.LinkedList;

public class StudentLinkedListDemo {
    /*
            Question:
            Create a Student class:

            name
            marks

            Create a LinkedList<Student>

            Add:

            Rohit - 85
            Mohit - 90
            Sahil - 78

            Print all student details.

            Also find the student with highest marks.

            Output:

            Name: Rohit, Marks: 85
            Name: Mohit, Marks: 90
            Name: Sahil, Marks: 78

            Highest Marks:
            Mohit - 90
        */


    static class Student{
        String name;
        double marks;

        Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("Rohit", 85.0));
        students.add(new Student("Mohit", 90.0));
        students.add(new Student("Sahil", 78.0));

        System.out.println("----Student Details----");
        for (Student student: students){
            System.out.printf("Name: %s, Marks: %.2f%n", student.name, student.marks);
        }

        Student highestMarks = students.get(0);
        for (Student student: students){
            if (student.marks > highestMarks.marks){
                highestMarks = student;
            }
        }

        System.out.println("Highest Marks");
        System.out.printf("%s - %.2f%n", highestMarks.name, highestMarks.marks);
    }
}
