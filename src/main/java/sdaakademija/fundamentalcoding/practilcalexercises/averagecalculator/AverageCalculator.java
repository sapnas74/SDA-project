package sdaakademija.fundamentalcoding.practilcalexercises.averagecalculator;

import java.util.Arrays;
import java.util.List;

public class AverageCalculator {
    public static void main(String[] args) {

        // Integer - saraso tipas , sarasui nereikia nurodynet didzio.
        List<Integer> integers = Arrays.asList(1, 2, 32, 4, 5, 1, 90);

        // Prideti prie galo - integers.add(133);
        // integers.indexOf(32); duos vieta sarase.
        // integers.remove(i:12);


        int sum = 0;
        double average = 0;

        for (Integer number : integers) {
            sum += number;
        }

        average = (double) sum / integers.size(); //Kastinam siandien kad gauti tikslu atsakyma

        // System.out.println("Vidurkis : " + average);
        System.out.printf("Vidurkis : %.2f" , average);
    }
}
