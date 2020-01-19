package flow_control.exercise8;

import java.util.Scanner;

public class EchoMain {
    public static void main(String[] args) {
        StringChecker stringChecker = new StringChecker();
        boolean count = true;
        String reverseText = "";
        Scanner answerScanner = new Scanner(System.in);

        while (count) {
            String inputText = stringChecker.checkString("Iveskite bet koki zodi : ");
            System.out.printf("%n");
            System.out.println("Sutvarkytas tekstas : " + inputText);
            for (int i = inputText.length() - 1; i >= 0; i--) {
                reverseText = reverseText + inputText.charAt(i);
            }
            System.out.println("Reverse text : " + reverseText);
            System.out.printf("%n");
            System.out.println("Jei norite testi darba spauskite bet kokia klavisa, arba spauskite <NE/ne>: ");
            String answer = answerScanner.nextLine();

            if ((answer.equals("NE") || answer.toLowerCase().equals("ne"))) {
                count = false;
                System.out.println("Good Bye !");
            } else {
                System.out.println("Tesiam darba !!! ");
                System.out.println(" ");
                reverseText = "";
            }
        }
    }
}
