package flow_control.exercise7;

import basics.exercise2.CheckForEnteredDouble;

public class DivideLoopMain {
    public static void main(String[] args) {
        boolean count = true;

        while (count) {
            CheckForEnteredDouble doubleCheck = new CheckForEnteredDouble();

            double firstNum = doubleCheck.scanEnteredData("Iveskite pirma skaiciu : ");
            double secondNum = doubleCheck.scanEnteredData("Iveskite antra skaiciu : ");
            System.out.println("*******************************");

            if (firstNum != 0 & secondNum != 0) {
                System.out.printf("Dalybos resultatas yra : %.4f", (firstNum / secondNum));
                System.out.printf("%n");
                System.out.println("*******************************");
            } else {
                System.out.println("Programa sustabdoma nes ivestas NULIS !!! ");
                count = false;
            }
        }
    }
}
