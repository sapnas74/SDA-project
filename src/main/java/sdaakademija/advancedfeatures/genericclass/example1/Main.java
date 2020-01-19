package sdaakademija.advancedfeatures.genericclass.example1;

import java.math.BigDecimal;

public class Main {

    @SuppressWarnings("unchecked") // sumazina warningus
    public static void main(String[] args) {
        Car car = new Car();

        GenericBox<Car> boxWithCarInIt = new GenericBox(car);
        boxWithCarInIt.setItem(new Car());
        System.out.println(boxWithCarInIt.getItem());

        GenericBox box = new GenericBox(); //ne nurodom kokio tipo Generis , ir galim setinti bet ka
        box.setItem("bla");
        box.setItem(BigDecimal.valueOf(42));
        box.setItem(new Car());
        System.out.println(box.getItem());
    }
}
