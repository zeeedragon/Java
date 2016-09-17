package misc.carTripV2;

public class Car {
    private double speed;
    private double fuel;
    private double fuelEconomy;
    private double timeTravelled;
    private double distTravelled;

    public Car(double speed, double fuel, double fuelEconomy) {
        this.setSpeed(speed);
        this.setFuel(fuel);
        this.setFuelEconomy(fuelEconomy);
    }

    public double getFuel() {
        return this.fuel;
    }

    private void setSpeed(double speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative");
        }
        this.speed = speed;
    }

    private void setFuel(double fuel) {
        if (fuel < 0) {
            throw new IllegalArgumentException("Fuel cannot be negative");
        }
        this.fuel = fuel;
    }

    public void setFuelEconomy(double fuelEconomy) {
        if (fuelEconomy < 0) {
            throw new IllegalArgumentException("Fuel economy cannot be negative");
        }
        this.fuelEconomy = fuelEconomy;
    }


    public void travel(double distance) {
        double possibleDistance = distance;
        if (distance > this.calculatePossibleDistance()) {
            possibleDistance = this.calculatePossibleDistance();
        }
        this.distTravelled += possibleDistance;
        this.setFuel(fuel - possibleDistance * fuelEconomy / 100);
        this.timeTravelled += possibleDistance / this.speed;
    }

    private double calculatePossibleDistance() {
        double result = fuel / fuelEconomy * 100;
        return result;
    }

    public double getDistanceTravelled() {
        return this.distTravelled;
    }

    public double getTimeTraveled() {
        return this.timeTravelled;
    }
}
