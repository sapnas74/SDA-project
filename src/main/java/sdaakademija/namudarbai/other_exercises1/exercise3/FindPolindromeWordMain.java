package other_exercises1.exercise3;

import flow_control.exercise8.StringChecker;
import java.util.ArrayList;
import java.util.List;

public class FindPolindromeWordMain {
    public static void main(String[] args) {
        StringChecker stringChecker = new StringChecker();
        List<String> allPossibleWords = new ArrayList();
        List<String> findedPolidromes = new ArrayList();
        String longestPolindrome = "";
        int howLongIsPolidrome = 0;

        String scannedWord = stringChecker.checkString("Iveskite bet koki zodi : ");
        System.out.printf("%n");
        allPossibleWords = findAllPossibleWords(allPossibleWords, scannedWord);
        for (int i = 0; i < allPossibleWords.size(); i++) {
            findedPolidromes = checkIfPolindromes(allPossibleWords.get(i), findedPolidromes);
        }
        System.out.println("Ilgiausias rastas polindromas yra : " + findLongestPolindrome(findedPolidromes, longestPolindrome, howLongIsPolidrome));
        System.out.printf("%n");
        for (int i = 0 ; i < findedPolidromes.size() ; i++) {
            System.out.println((i+1) + " . Rastas zodzis polindromas : " + findedPolidromes.get(i));
            }
    }

    public static List<String> findAllPossibleWords(List<String> allPossibleWords, String scannedWord) {
        for (int i = 0; i < scannedWord.length(); i++) {
            String wordBuilder = "";
            wordBuilder = wordBuilder + scannedWord.charAt(i);
            for ( int y = i + 1; y < scannedWord.length(); y++) {
                wordBuilder = wordBuilder + scannedWord.charAt(y);
                String buildedWord = wordBuilder;
                allPossibleWords.add(buildedWord);
            }
        }
        return allPossibleWords;
    }

    public static List<String> checkIfPolindromes(String wordToCheck, List<String> findedPolidromes) {
        String reverseText = "";

        for (int i = wordToCheck.length() - 1; i >= 0; i--) {
            reverseText = reverseText +  wordToCheck.charAt(i);
        }
        if (reverseText.equals(wordToCheck)) {
            findedPolidromes.add(reverseText);
        }
        return findedPolidromes;
    }

    public static String findLongestPolindrome(List<String> findedPolidromes, String longestPolindrome, int howLongIsPolidrome) {

        for (int i = 0 ; i < findedPolidromes.size() ; i++) {
            if (findedPolidromes.get(i).length() > howLongIsPolidrome) {
                longestPolindrome = findedPolidromes.get(i);
                howLongIsPolidrome = findedPolidromes.get(i).length();
            }
        }
        return longestPolindrome;
    }
}
