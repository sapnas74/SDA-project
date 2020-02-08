package sdaakademija.advancedfeatures.lambdaexpression.example1;

import java.util.function.Predicate;

public class FunctionInterfaceExample1 {
    public static void main(String[] args) {
        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();

        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));
    }
}
