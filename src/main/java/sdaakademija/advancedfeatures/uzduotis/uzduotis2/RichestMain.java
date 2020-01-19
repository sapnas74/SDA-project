package sdaakademija.advancedfeatures.uzduotis.uzduotis2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class RichestMain {

    public static void main(String[] args) {

        List<World> objList = Arrays.asList(
                new Country("Mozambikas", BigDecimal.valueOf(300)),
                new Country("Rusija", BigDecimal.valueOf(400)),
                new Person("B. Gates", BigDecimal.valueOf(600)),
                new Person("Bezos", BigDecimal.valueOf(500))
        );

        World richest = objList.get(0);

        for (int i = 0; i < objList.size() - 1; i++) {
            if(richest.findRicher(objList.get(i+1).amount)) {
                richest = objList.get(i + 1);
            }
        }
        System.out.println("Richest is: " + richest.name + " with ammount: " + richest.amount);
    }
}
