package sdaakademija.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchExample {
    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        boolean allNamesLengthIsGtThan3 = names.stream()
        //        .filter(name -> name.startsWith("B"))                   // pvz
                .allMatch(name -> name.length() > 3);                   // any match
        logger.info(allNamesLengthIsGtThan3);

        boolean thereIsANameWhichLengthIsGtThan3 = names.stream()
                .anyMatch(name -> name.length() > 3);                   //all match
        logger.info(thereIsANameWhichLengthIsGtThan3);
    }
}
