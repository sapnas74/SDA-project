package flow_control.exercise1;

import basics.exercise2.CheckForEnteredDouble;

public class EqualOrLowerMain {
    public static void main(String[] args) {
        CheckForEnteredDouble doubleCheck = new CheckForEnteredDouble();

        double number = doubleCheck.scanEnteredData("Iveskite bet koki skaiciu : ");

        if (number < 30)
            System.out.println("Ivestas skaicius yra mazesnis uz 30");
        if (number == 30)
            System.out.println("Ivestas skaicius yra lygus 30");
        if (number > 30)
            System.out.println("Ivestas skaicius yra didesnis uz 30");
    }
}
