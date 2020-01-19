package sdaakademija.advancedfeatures.genericinterface;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(350);
        Car car2 = new Car(200);

        if(car1.compareTo(car2) > 0) {
            System.out.println("carl is faster !!!");
        }
    }
}
