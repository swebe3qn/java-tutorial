package oop;

public class Main {

    public static void main(String[] args) {

        Car defaultCar = new Car();
        Car dreamCar = new Car("Ferrari", "458 Pista", "silver", 2018, 330000.0, 350.0);

        // System.out.println(Car.numberOfCars);

        Car[] cars = { defaultCar, dreamCar };

        // System.out.println(defaultCar.brand + " " + defaultCar.model);
        // defaultCar.drive();

        // System.out.println(cars[1]); // implicitly use .toString()
        // cars[1].brake();

        Garage myGarage = new Garage();

        myGarage.park(cars[0]);
        myGarage.park(cars[1]);

        System.out.println("Now the following cars are parked in your garage:");

        for (Car car : myGarage.parkedCars) {
            System.out.println(car);
        }

    }

}
