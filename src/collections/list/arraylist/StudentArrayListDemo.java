package collections.list.arraylist;

import java.util.ArrayList;

public class StudentArrayListDemo {
    /*
            Question:
            Create a Student class with:

            name
            marks

            Create an ArrayList<Student>.

            Add:

            Rohit - 85
            Mohit - 90
            Sahil - 78

            Print all student details.

            Output:

            Name: Rohit, Marks: 85
            Name: Mohit, Marks: 90
            Name: Sahil, Marks: 78
        */

    static class  Student{
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        //adding new student
        students.add(new Student("Rohit", 85));
        students.add(new Student("Mohit", 90));
        students.add(new Student("Sahil", 78));

        System.out.println("Student Details");
        for (Student student: students){
            System.out.printf("Name: %s, Marks: %d%n",student.name,student.marks);
        }
    }
}
