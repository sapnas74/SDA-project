package other_exercises1.exercise2;

import flow_control.exercise8.StringChecker;

public class CesarMain {
    public static void main(String[] args) {
        String codedWord = "";
        StringChecker stringChecker = new StringChecker();

        String scannedWord = stringChecker.checkString("Iveskite zodi kuri norite uzkoduoti : ");
        codedWord = displacementWord(scannedWord, codedWord);
        System.out.printf("%n");
        System.out.println("Zodi - " + scannedWord + " uzkuodavom i zodi - " + codedWord);
        System.out.printf("%n");
    }

    private static int displacementChar(int charToDisplaceCode) {
        int morfedChar = 0;

            if (charToDisplaceCode > 85 && charToDisplaceCode < 91) {
                morfedChar = charToDisplaceCode - 21;
        } else if (charToDisplaceCode > 64 && charToDisplaceCode < 86) {
            morfedChar = charToDisplaceCode + 5;
            }
            if (charToDisplaceCode > 117 && charToDisplaceCode < 123) {
                morfedChar = charToDisplaceCode - 21;
        } else if (charToDisplaceCode > 96 && charToDisplaceCode < 118) {
                morfedChar = charToDisplaceCode + 5;
            }
        return morfedChar;
    }

    private static String displacementWord(String scannedWord, String codedWord) {
        for(int i = 0 ; i < scannedWord.length() ; i++) {
            int charToDisplaceCode = scannedWord.charAt(i);
            char displacedChar = (char) displacementChar(charToDisplaceCode);
            codedWord += displacedChar;
        }
        return codedWord;
    }
}
