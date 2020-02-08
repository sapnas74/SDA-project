package sdaakademija.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Uzduotis2 {
    private static final Logger logger = Logger.getLogger(Uzduotis2.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Romualdas", "Agnė", "Elena", "Angelė", "Laurynas", "Karolis", "Bronius", "Ignė", "Meda", "Lena");

        names.stream()
                .filter(name -> name.length() < 6)
                .filter(name -> name.contains("e"))
                .sorted()
                .peek(name -> System.out.println(name.toUpperCase()))
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(name -> System.out.println(name.toUpperCase()));
        }
    }

