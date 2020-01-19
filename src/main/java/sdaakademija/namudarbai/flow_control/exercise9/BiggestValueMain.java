package flow_control.exercise9;

import java.util.Random;

public class BiggestValueMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int biggestNumber = 0;
        int arrayValue = rand.nextInt(20);

        System.out.println(" ");
        System.out.println("Sugeneruotas masivo dydis : " + arrayValue);
        System.out.println(" ");

        int[] arrayToBuild = new int[arrayValue];

        for (int i = 0; i < arrayValue; i++) {
            int random = rand.nextInt(1000);
            arrayToBuild[i] = random;
        }
        System.out.println("Massivas : ");
        for (int i = 0; i < arrayValue; i++) {
            System.out.print(arrayToBuild[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arrayValue; i++) {
            if (arrayToBuild[i] > biggestNumber) {
                biggestNumber = arrayToBuild[i];
            }
        }
        System.out.println(" ");
        System.out.println("Didziausias masivo skaicius yra : " + biggestNumber);
    }
}
