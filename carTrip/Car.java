package misc.carTrip;

public class Car {
    private double speed;
    private double fuelAmount;
    private double fuelEconomy;
    private double distance;
    private double time;

    public Car(double speed, double fuelAmount, double fuelEconomy) {
        this.speed = speed;
        this.fuelAmount = fuelAmount;
        this.fuelEconomy = fuelEconomy;
        this.distance = 0.0;
        this.time = 0.0;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void refuel(double liters) {
        if (liters < 0) {
            return;
        }
        this.fuelAmount += liters;
    }

    public void travel(double distance) {
        double canTravel = (this.fuelAmount * 100) / this.fuelEconomy;
        if (canTravel < distance) {
            distance = canTravel;
        }

        this.fuelAmount -= distance * (this.fuelEconomy / 100);
        this.distance += distance;
        this.time += (distance / this.speed) * 60;
    }

}
