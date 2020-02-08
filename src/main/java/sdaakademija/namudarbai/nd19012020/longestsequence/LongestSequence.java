package sdaakademija.namudarbai.nd19012020.longestsequence;

import java.util.ArrayList;
import java.util.List;

public class LongestSequence {
    public static void main(String[] args) {

        String firstWord = "abarttdmonkey";
        String secondWord = "monkeygdgeabar";

        List<String> allSequencesFirstWord = findAllSequences(firstWord);
        List<String> allSequencesSecondWord = findAllSequences(secondWord);

        List<String> finalMassive = checkSequencesMassives(allSequencesFirstWord, allSequencesSecondWord);
        printLongestSequence(finalMassive);

    }

    public static List<String> findAllSequences(String mainWords) {
        List<String> allSequences = new ArrayList();

        for (int i = 0; i < mainWords.length(); i++) {
            String sequenceBuilder = "";
            sequenceBuilder = sequenceBuilder + mainWords.charAt(i);
            for (int ii = i + 1 ;ii < mainWords.length() ; ii++) {
                sequenceBuilder = sequenceBuilder + mainWords.charAt(ii);
                allSequences.add(sequenceBuilder);
            }
        }
        return allSequences;
    }

    private static List<String> checkSequencesMassives(List<String> allSequencesFirstWord, List<String> allSequencesSecondWord) {
        List<String> allCoincidences = new ArrayList();

        for (int i = 0; i < allSequencesFirstWord.size(); i++) {
            for (int ii = 0; ii < allSequencesSecondWord.size(); ii++) {
                if (allSequencesFirstWord.get(i).equals(allSequencesSecondWord.get(ii))) {
                    allCoincidences.add(allSequencesFirstWord.get(i));
                }
            }
        }
        return allCoincidences;
    }

    private static void printLongestSequence(List<String> allCoincidences) {
        int volume = 0;

        for (int i = 0; i < allCoincidences.size(); i++) {
            if (volume < allCoincidences.get(i).length()) {
                volume = allCoincidences.get(i).length();
            }
        }
        for (int i = 0; i < allCoincidences.size(); i++) {
            if (volume == allCoincidences.get(i).length()) {
                System.out.println("Rasta bendra ilgiausia seka yra : " + allCoincidences.get(i));
            }
        }
    }
}

