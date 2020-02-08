package sdaakademija.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uzduotis1 {
    private static final Logger logger = Logger.getLogger(Uzduotis1.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String oneWord = names.stream()
                .reduce("", (currentValue, element) -> currentValue + element);
        logger.info(oneWord);

        String oneWordUpper = names.stream()
                .map(name -> name.toUpperCase())
                .reduce("", (currentValue, element) -> currentValue + element);
        logger.info(oneWordUpper);

        String separatedWords = names.stream()
                .reduce("", (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ",") + element);
        logger.info(separatedWords);

        names.stream()
                .filter(name -> name.contains("o"))
                .forEach(name -> System.out.println(name));

    }
}
