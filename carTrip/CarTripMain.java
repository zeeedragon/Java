package misc.carTrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarTripMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] params = reader.readLine().split("\\s+");

        double speed = Double.parseDouble(params[0]);
        double fuel = Double.parseDouble(params[1]);
        double fuelEconomy = Double.parseDouble(params[2]);
        Car car = new Car(speed, fuel, fuelEconomy);

        while (true) {

            String[] command = reader.readLine().trim().split("\\s+");
            if (command[0].equals("END")) {
                break;
            }

            switch (command[0]) {
                case "Travel":
                    double distance = Double.parseDouble(command[1]);
                    car.travel(distance);
                    break;
                case "Refuel":
                    double liters = Double.parseDouble(command[1]);
                    car.refuel(liters);
                    break;
                case "Distance":
                    System.out.printf("Total distance: %s kilometers\n", car.getDistance());
                    break;
                case "Time":
                    double totalTime = car.getTime();
                    int hours = (int) totalTime / 60;
                    int mins = (int) totalTime % 60;
                    System.out.printf("Total time: %s hours and %s minutes\n", hours, mins);
                    break;
                case "Fuel":
                    System.out.printf("Fuel left: %s liters\n", car.getFuelAmount());
                    break;
            }
        }
    }
}
