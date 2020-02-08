package sdaakademija.advancedfeatures.lambdaexpression.example1;

import java.util.function.Function;

public class FunctionInterfaceExample2 {
        public static void main(String[] args) {
            Function<String, Integer> stringLength = s -> s.length();
            System.out.println(stringLength.apply("ABCDEF"));

            Function<String, String> replaceCommasWithDots = s -> s.replaceAll(",", ".");
            System.out.println(replaceCommasWithDots.apply("a,b,c"));
            System.out.println(replaceAll("a,b,c"));
        }

        //tas pats kaip ir:

        private static String replaceAll(String word){
            return word.replaceAll(",", ".");
        }
    }

