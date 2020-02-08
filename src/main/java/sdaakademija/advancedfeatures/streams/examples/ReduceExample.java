package sdaakademija.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    private static final Logger logger = Logger.getLogger(ReduceExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "", "Michael");

        String namesConcatenation = names.stream()
                .filter(name -> !name.isEmpty())           // ismeta tuscius
                .reduce("",                     // reduce irgi keicia struktura
                        (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ",") + element);
        logger.info(namesConcatenation);

        int num = names.stream()
                .map(String::length)
                .limit(2)   //paema tik pirmus 2 resultatus
                .reduce(0,
                        (sum,currentNum) -> (currentNum > 3 ? 1 : 0) +sum);
        logger.info(num);
    }
}
