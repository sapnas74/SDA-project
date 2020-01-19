package tdd;

public class Euro {

    private double amount;

    public Euro(double amount) {
        this.amount = (double) amount;
    }

    @Override                   // spausdintu vieta rame
    public String toString() {
        return String.format("EUR %.2f", amount);
    }

    public boolean equal(Object o) {
        return o instanceof Euro && amount == ((Euro) o).amount;

        // ((Euro) o) Sukastinam objekta o

    }

    public int subtract(int number) {
        return (int) amount - number;
    }

    public int divide(int number, Object o ) {
        return (int) amount / (int) number;
    }

}
