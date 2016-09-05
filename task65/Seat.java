package task65;

public class Seat {
    private int taken;
    private int price;

    public Seat(int taken, int price) {
        this.taken = taken;
        this.price = price;
    }

    public int getTaken() {
        return taken;
    }

    public void setTaken(int taken) {
        this.taken = taken;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "Taken: " + getTaken() + " Price: " + getPrice();
    }
}
