package sdaakademija.advancedfeatures.lambdaexpression.example2;

import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person("Marry", "Potter",222);
        Predicate<Person> adultPersonTest = Person::isAdult;
        Predicate<Person> adultPersonTest1 = person1 -> person.isAdult();

        // uzrasitos 2 eilutes tas pats , kaip lengviau taip ir rasyk

        adultPersonTest.test(person);
        System.out.println(adultPersonTest1.test(person));
    }
}
