package sdaakademija.advancedfeatures.streams.examples;

import java.util.Random;

public class Uzduotis3 {

    public static void main(String[] args) {

        int number = new Random().ints(100, 0, 2).sum();
        System.out.println(Math.sqrt(number));

    }
}

