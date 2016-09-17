package misc.carTripV2;

public class CarTripMain {
    public static void main(String[] args) {
        Car car = new Car(100, 20, 20);
        car.travel(200);
        System.out.println(car.getFuel());
        System.out.println(car.getDistanceTravelled());
        System.out.println(car.getTimeTraveled());
    }
}
