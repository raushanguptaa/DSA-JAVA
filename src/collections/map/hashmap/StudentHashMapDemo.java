package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMapDemo {
    /*
    Question:
    Create a HashMap<Integer, Student>

    Student:
    name
    marks

    Add:

    101 -> Rohit, 85
    102 -> Mohit, 90
    103 -> Sahil, 78

    Print all student details.

    Also find the student with highest marks.

    Output:

    ID: 101, Name: Rohit, Marks: 85
    ID: 102, Name: Mohit, Marks: 90
    ID: 103, Name: Sahil, Marks: 78

    Highest Marks:
    Mohit - 90
*/

    static class Student{
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Student> students = new HashMap<>();

        students.put(101, new Student("Rohit", 85));
        students.put(102, new Student("Mohit", 90));
        students.put(103, new Student("Sahil", 78));

        for (Map.Entry<Integer, Student> student: students.entrySet()){
            System.out.printf("ID: %d, Name: %s, Marks: %d%n", student.getKey(), student.getValue().name, student.getValue().marks);
        }

        Student highestMark = null;
       for (Student student : students.values()){
           if (highestMark ==null || student.marks > highestMark.marks){
               highestMark = student;
           }
       }
        System.out.printf("Highest Marks:%n%s - %d%n", highestMark.name, highestMark.marks);





    }
}
