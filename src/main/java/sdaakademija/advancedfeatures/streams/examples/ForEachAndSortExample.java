package sdaakademija.advancedfeatures.streams.examples;

import org.apache.log4j.Logger;
import sdaakademija.advancedfeatures.lambdaexpression.example2.Person;

import java.util.Arrays;
import java.util.List;

public class ForEachAndSortExample {
    private static final Logger logger = Logger.getLogger(ForEachAndSortExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Michael","Andrew", "Brandon");
        names.forEach(System.out::println);
        names.forEach(logger::info);

        List<Person> people = Arrays.asList(
                new Person("John", "Smith",20),
                new Person("Sarah", "Connor", 30)
        );

        people.stream()
                .sorted((p1,p2) -> p2.getSurname().compareTo(p1.getSurname())) //pakeist elementus vietom kita rusiavimo tvarka
                .forEach(person -> logger.info(person.getSurname()));
    }
}
