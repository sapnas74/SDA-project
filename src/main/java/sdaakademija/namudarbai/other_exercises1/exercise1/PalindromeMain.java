package other_exercises1.exercise1;

import flow_control.exercise8.StringChecker;

public class PalindromeMain {
    public static void main(String[] args) {
        String reverseText = "";
        boolean process = true;
        StringChecker stringChecker = new StringChecker();

        while (process) {
            String scannedWord = stringChecker.checkString("Iveskite bet koki zodi : ");
            for (int i = scannedWord.length() - 1; i >= 0; i--) {
                reverseText += scannedWord.charAt(i);
            }
            if (reverseText.equals(scannedWord) &&  reverseText != "" ) {
                System.out.println("*************************");
                System.out.println("Zodis YRA palindromas !!! ");
                System.out.println("*************************");
            } else {
                System.out.println("*************************");
                System.out.println("Zodis NERA palindromas !!! ");
                System.out.println("*************************");
            }
            System.out.println("Jei norite testi spauskite <ENTER>");
            String exitCheck = stringChecker.checkString("Baigti darba, parasykite <ne> : ");

            if (exitCheck.equals("ne")) {
                process = false;
                System.out.print("Zodis yra" + reverseText);
            }
        }
    }
}
