package basics.exercise3;

import basics.exercise1.CheckForEnteredInt;

public class InToDoubleMain {
    public static void main(String[] args) {
        CheckForEnteredInt intCheck = new CheckForEnteredInt();
        double result = (double) intCheck.scanEnteredData("Iveskite pirma int tipo skaiciu : ") /
                intCheck.scanEnteredData("Iveskite antra int tipo skaiciu : ");
        System.out.printf("Rezultatas : %.3f", result);
    }
}
