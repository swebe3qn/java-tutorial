package oop;

public class Car extends Vehicle {

    String brand;
    String model;
    String color;
    int year;
    double price;
    static int numberOfCars = 0; // static means it is shared across all instances of the class

    // overloaded constructors - car with no params becomes default car (VW Golf)
    Car() {
        super(220.0);

        this.brand = "VW";
        this.model = "Golf VII Variant";
        this.color = "white";
        this.year = 2017;
        this.price = 21599.0;

        numberOfCars++;
    }

    Car(String brand, String model, String color, int year, double price, double speed) {
        super(speed);

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;

        numberOfCars++;
    }

    @Override
    void drive() {
        System.out.println(this.brand + " is driving.");
    }

    void brake() {
        System.out.println(this.brand + " is slowing down.");
    }

    public String toString() {
        return this.brand + " " + this.model + " (" + this.color + "), " + this.year + "\nPrice: "
                + String.format("%.2f", this.price) + " €\nMax speed: " + String.format("%.2f", this.speed) + " km/h";
    }

}
