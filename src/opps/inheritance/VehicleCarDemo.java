package opps.inheritance;

public class VehicleCarDemo {
    /*
    Question:
    Create a Vehicle class with:

    brand
    speed

    Create a Car class that extends Vehicle.

    Add:
    fuelType

    Create object of Car
    and display all details.
    */

    static class Vehicle {

        String brand;
        int speed;

        Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }
    }

    static class Car extends Vehicle {

        String fuelType;

        Car(String brand, int speed, String fuelType) {
            super(brand, speed);
            this.fuelType = fuelType;
        }

        void displayDetail() {
            System.out.println("---------- Car Details ----------");
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed);
            System.out.println("Fuel Type: " + fuelType);
        }
    }

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 180, "Petrol");

        car1.displayDetail();
    }
}
