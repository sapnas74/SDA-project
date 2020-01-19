package sdaakademija.advancedfeatures.genericclass.example2;

public class GarageMain {

    public static void main(String[] args) {

        Car car = new Car();
        Garage<Car> garage = new Garage<>(car);
        garage.repairVehicle();
    }
}
