package java_advanced.inheritance.example2;

public class Car extends Vehicle {
    private String name;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    public int getParentHiddenField() {
        return maxSpeed;   // cia dabar mato kintamaji
    }
}
