package opps.polymorphism;

public class ShapeDemo {
    static class Shape{

        void draw(){
            System.out.println("Drawing shape");
        }
    }

    static class Circle extends Shape{
        @Override
        void draw(){
            System.out.println("Drawing Circle");
        }
    }

    static class Rectangle extends Shape{
        @Override
        void draw(){
            System.out.println("Drawing Rectangle");
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}
