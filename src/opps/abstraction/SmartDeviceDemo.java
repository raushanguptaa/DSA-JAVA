package opps.abstraction;

public class SmartDeviceDemo {
    /*
    Question:
    Create an interface:

    SmartDevice

    Method:
    turnOn()

    Create:

    TV
    Fan

    Implement turnOn() in both classes.

    Output:

    TV is turning on.

    Fan is turning on.
*/

    interface SmartDevice{
        void turnOn();
    }

    static class TV implements SmartDevice{

        @Override
        public void turnOn() {
            System.out.println("TV is turning on.");
        }
    }


    static class Fan implements SmartDevice{

        @Override
        public void turnOn() {
            System.out.println("Fan is turning on.");
        }
    }

    public static void main(String[] args) {
        SmartDevice d1 = new TV();
        d1.turnOn();

        SmartDevice d2 = new Fan();
        d2.turnOn();
    }
}
