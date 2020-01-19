package java_advanced.inheritance.example2;

public class Vehicle {
    protected int maxSpeed; // mato Car , nes protected

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Fields values : maxSpeed = " + maxSpeed;
    }
}
