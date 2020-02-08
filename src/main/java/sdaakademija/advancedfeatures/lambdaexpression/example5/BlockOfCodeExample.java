package sdaakademija.advancedfeatures.lambdaexpression.example5;

import java.util.function.UnaryOperator;

public class BlockOfCodeExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> toSquareUnaryOperator = i -> {
            int result = i * i;
            System.out.println("Result: " + result);
            return result;
        };
        toSquareUnaryOperator.apply(4);
    }
}

