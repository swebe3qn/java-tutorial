package oop;

import java.util.ArrayList;

public class Garage {

    ArrayList<Car> parkedCars = new ArrayList<Car>();

    void park(Car car) {
        parkedCars.add(car);
        System.out.printf("The %s is parked in the garage.\n", car.brand);
    }

}
