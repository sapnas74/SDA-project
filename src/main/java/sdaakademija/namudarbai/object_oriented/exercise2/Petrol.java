package object_oriented.exercise2;

public class Petrol {
    private double litre;
    private double price;

    public Petrol(double litre, double price) {
        this.litre = litre;
        this.price = price;
    }

    public double getLitre() {
        return litre;
    }

    public double getPrice() {
        return price;
    }
}
