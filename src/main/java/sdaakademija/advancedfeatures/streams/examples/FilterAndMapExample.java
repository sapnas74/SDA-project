package sdaakademija.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    private static final Logger logger = Logger.getLogger(FilterAndMapExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        //filter
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(logger::info);                     //nieko nekeicia

        //map                                               keicia struktura ir sukuria nauja
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        logger.info(nameLengths);

        OptionalDouble averageNameLengthOptional = names.stream()
                .mapToInt(name -> name.length())
                .map(number -> (int) Math.pow(number,2))
                .average();
        logger.info(averageNameLengthOptional.orElse(0));
        //use decimal format to round number
    }
}
