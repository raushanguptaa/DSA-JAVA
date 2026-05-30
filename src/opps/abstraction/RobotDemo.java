package opps.abstraction;

public class RobotDemo {
    /*
    Question:
    Create interfaces:

    Walkable
    Speakable

    Methods:

    walk()
    speak()

    Create Robot class implementing BOTH interfaces.

    Output:

    Robot is walking.
    Robot is speaking.
*/
    interface Walkable{
        void walk();
    }

    interface Speakable{
        void speak();
    }

    static class Robot implements Walkable, Speakable{

        @Override
        public void speak() {
            System.out.println("Robot is speaking");
        }

        @Override
        public void walk() {
            System.out.println("Robot is walking");
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.speak();
    }
}
