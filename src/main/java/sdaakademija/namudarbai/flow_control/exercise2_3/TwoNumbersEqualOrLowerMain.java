package flow_control.exercise2_3;

import basics.exercise2.CheckForEnteredDouble;

import java.util.Random;

public class TwoNumbersEqualOrLowerMain {
    public static void main(String[] args) {
        CheckForEnteredDouble doubleCheck = new CheckForEnteredDouble();
        double firstNumber = doubleCheck.scanEnteredData("Iveskite pirma bet koki skaiciu : ");
        double secondNumber = doubleCheck.scanEnteredData("Iveskite antra bet koki skaiciu : ");

        randomizer(firstNumber, secondNumber);
    }

    private static void checkExerciseConditions(double number) {
        if (number < 30)
            System.out.println("Ivestas skaicius yra mazesnis uz 30");
        if (number == 30)
            System.out.println("Ivestas skaicius yra lygus 30");
        if (number > 30)
            System.out.println("Ivestas skaicius yra didesnis uz 30");
    }

    private static void randomizer(double firstNumber, double secondNumber) {
        Random random = new Random();
        int numberRandomChoice = random.nextInt(1);

        if (numberRandomChoice == 1) {
            System.out.println("Sistema isrinko skaiciu : " + firstNumber);
            checkExerciseConditions(firstNumber);
        }
        if (numberRandomChoice == 0) {
            System.out.println("Sistema isrinko skaiciu : " + secondNumber);
            checkExerciseConditions(secondNumber);
        }
    }
}
