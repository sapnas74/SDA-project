package other_exercises1.exercise4;

import basics.exercise1.CheckForEnteredInt;

public class Fibonaci {

    public static void main(String[] args) {

        CheckForEnteredInt checkForEnteredInt = new CheckForEnteredInt();
        int previousNumber = 1;
        int nextNumber = 1;
        int nextResult = 0;
        int position = checkForEnteredInt.scanEnteredData("Iveskite Fibonaci sekos pozicija : ");

        if (position == 1 || position == 2) {
            System.out.print("Jusu pasirinktai pozicijai atitinka Fibonaci skaicius - 1");
        }
        if (position > 2) {
            System.out.println("Spausdiname Fibonaci seka iki Jusu pasirinktos pozicijos - " + position);
            System.out.printf("%n");
            System.out.print(previousNumber + " ");
            System.out.print(nextNumber + " ");
            nextResult = printingFibonaci(position, previousNumber, nextNumber, nextResult);
            System.out.printf("%n");
            System.out.println("Jusu pasirinktai pozicijai atitinka Fibonaci skaicius - " + nextResult);
        }
    }

    private static int printingFibonaci(int position, int previousNumber, int nextNumber, int nextResult) {
        for (int i = 1; i < position; i++) {
            nextResult = previousNumber + nextNumber;
            System.out.print(nextResult + " ");
            previousNumber = nextNumber;
            nextNumber = nextResult;
        }
        return nextResult;
    }
}
