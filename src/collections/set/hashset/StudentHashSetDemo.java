package collections.set.hashset;

import java.util.Collections;
import java.util.HashSet;

public class StudentHashSetDemo {
    /*
    Question:
    Create a Student class:

    name
    marks

    Create a HashSet<Student>

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
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("Rohit", 85));
        students.add(new Student("Mohit", 90));
        students.add(new Student("Sahil", 78));

        for (Student student: students){
            System.out.printf("Name: %s, Marks: %d%n", student.name, student.marks);
        }

        Student hightestMarks = null;
        for (Student student: students){
            if (hightestMarks == null || student.marks > hightestMarks.marks){
                hightestMarks = student;
            }
        }
        System.out.printf("Hightest Marks:%n%s - %d", hightestMarks.name, hightestMarks.marks);
    }
}
