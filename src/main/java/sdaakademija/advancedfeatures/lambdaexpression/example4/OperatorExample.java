package sdaakademija.advancedfeatures.lambdaexpression.example4;

import java.util.function.UnaryOperator;

public class OperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> toSquareUnaryOperator = i -> i*i;
        System.out.println(toSquareUnaryOperator.apply(5));
    }
}
