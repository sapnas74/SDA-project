package algorithms_webinar.gcd;

import basics.exercise1.CheckForEnteredInt;

public class GcdMain {
    public static void main(String[] args) {
        CheckForEnteredInt checkForEnteredInt = new CheckForEnteredInt();
        int a = checkForEnteredInt.scanEnteredData("Iveskite pirma skaiciu : ");
        int b = checkForEnteredInt.scanEnteredData("Iveskite antra skaiciu : ");;

        while(a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Didziausias bendras dalyklis yra : " + a);
    }
}
