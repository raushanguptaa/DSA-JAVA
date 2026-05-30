package opps.abstraction;

public class ShapeArea {
    /*
    Question:
    Create an abstract class Shape.

    Create an abstract method:
    calculateArea()

    Create Circle class extending Shape:
    radius

    Create Rectangle class extending Shape:
    length
    width

    Implement calculateArea() in both classes.

    Display the area of:
    Circle
    Rectangle

    Example Output:

    Circle Area: 78.54
    Rectangle Area: 50.00
*/

    static abstract class Shape{
        abstract double area();
    }

    static  class Circle extends Shape{
        double radius;

        Circle(double radius){
            this.radius = radius;
        }

        @Override
        double area(){
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape{
        double length;
        double width;

        Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }

        @Override
        double area(){
            return length * width;
        }
    }

    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Rectangle rect = new Rectangle(10,5);

        System.out.printf("Area of Circle: %.2f\n",cir.area());
        System.out.printf("Area of Rectangle: %.2f\n",rect.area());

    }
}
