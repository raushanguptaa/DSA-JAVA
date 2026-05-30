package opps.encapsulation;

public class Student {
    /*
    Question:
    Create a Student class with private fields:

    name
    rollNo
    marks

    Create getters and setters.

    In main():
    Set student details.
    Print all details using getters.
*/

    private String name;
    private  int rollNo;
    private double marks;

    public Student(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Roll No: %d\n", getRollNo());
        System.out.printf("Marks: %.2f\n", getMarks());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rohit", 1, 85);
        Student student2 = new Student("Sahil", 2, 86);

        student1.displayDetails();
        student2.displayDetails();
    }
}
