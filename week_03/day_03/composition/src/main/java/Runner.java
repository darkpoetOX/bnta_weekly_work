import products.Product;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Engine;
import vehicles.IVehicle;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<IVehicle> vehicles = new ArrayList<>();

        Bicycle bicycle = new Bicycle(10, 20, new Product(350,6,"BMX"));

        vehicles.add(bicycle);
        System.out.println("wheels: " + bicycle.getWheelCount());
        System.out.println("speed: " + bicycle.getMaxSpeed());
        System.out.println("price: " + bicycle.getPrice());

        Car car = new Car(200,120,new Product(10000,3,"Honda"), new Engine(100,150));

        vehicles.add(car);

        System.out.println("car price: " + car.getPrice());
        System.out.println("car fuel: " + car.getFuel());
        car.startEngine();


    }

}
