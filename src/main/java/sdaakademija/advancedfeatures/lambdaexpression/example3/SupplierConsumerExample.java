package sdaakademija.advancedfeatures.lambdaexpression.example3;


import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumerExample {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(); //Supplier tik grazina reiksme
        int randomNumber = randomNumberSupplier.get();
        System.out.println(randomNumber);

        Consumer<Double> printWithPrefixConsumer = d -> System.out.println("Value : " + d); // Pasiima reiksme bet negrazina
        printWithPrefixConsumer.accept(10.5);
    }
}
