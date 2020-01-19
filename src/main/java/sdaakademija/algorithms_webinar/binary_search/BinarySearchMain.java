package algorithms_webinar.binary_search;

import basics.exercise1.CheckForEnteredInt;
import java.util.Random;

public class BinarySearchMain {
    public static void main(String[] args) {
        CheckForEnteredInt checkForEnteredInt = new CheckForEnteredInt();

        int massiveVolume = checkForEnteredInt.scanEnteredData("Iveskite masyvo dydi : ");
        int[] generatedMassive = new int[massiveVolume];
        int[] sortedMassive = new int[massiveVolume];

        generatedMassive = generateNewRandomMassive(generatedMassive);
        sortedMassive = bubbleSorting(generatedMassive);

        for (int i = 0; i < sortedMassive.length; i++) {
            if (i % 10 == 0) {
                System.out.printf("%n");
            }
            System.out.print(" " + sortedMassive[i]);
        }

        System.out.printf("%n");
        int numberToFind = checkForEnteredInt.scanEnteredData("Iveskite skaiciu is masivo : ");

        binarySearch(sortedMassive, numberToFind);

    }

    public static void binarySearch(int[] sortedMassive, int numberToFind) {
        int leftPosition = 0;
        int middle = 0;
        boolean process = true;
        int rightPosition = sortedMassive.length;

        while (process) {
            middle = (leftPosition + rightPosition) / 2;

            if (sortedMassive[middle] < numberToFind) {
                leftPosition = middle;
            }
            if (sortedMassive[middle] > numberToFind) {
                rightPosition = middle;
            }
            if (sortedMassive[middle] == numberToFind) {
                process = false;
                System.out.println("Skaicius - " + numberToFind + " , yra masivo pozicijoje - " + middle);
            }
        }
    }
    // TODO padaryk kai nera tokio skaiciaus

    public static int[] generateNewRandomMassive(int[] generatedMassive) {
        Random randomizer = new Random();

            for (int i = 0; i < generatedMassive.length; i++) {
                generatedMassive[i] = randomizer.nextInt( generatedMassive.length * 100);
                }
        return generatedMassive;
            }


    public static int[] bubbleSorting(int[] generatedMassive) {
        boolean sortingProcess = false;
        int buffer;

        while (!sortingProcess) {
            sortingProcess = true;
            for (int i = 0; i < generatedMassive.length - 1; i++) {
                if (generatedMassive[i] > generatedMassive[i + 1]) {
                    sortingProcess = false;
                    buffer = generatedMassive[i];
                    generatedMassive[i] = generatedMassive[i + 1];
                    generatedMassive[i + 1] = buffer;
                }
            }
        }
        return generatedMassive;
    }
}

