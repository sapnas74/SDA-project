package sdaakademija.advancedfeatures.genericclass.example1;

public class Car {

    public static void main(String[] args) {
        Car car = new Car();

        GenericBox<Car> boxWithCarInIt = new GenericBox<>(car);
    }
}
