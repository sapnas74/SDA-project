package sdaakademija.namudarbai.nd091119;

import java.util.Scanner;

public class Pirminis {

    static int var = 2;

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Ivesk skaiciu : ");
        int n = numberScanner.nextInt();
        checkIsItANaturalNumber(n);
        }

        private static void checkIsItANaturalNumber(int n) {

        if (n == 1) {
            System.out.println("Vienetas ne pirminis skaicius ! ");
        }
        if (n > 1) {
            if (n % var != 0 ) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var,n);
            }
        }

        }

        private static void printIsItNaturalNumber(int var, int n) {
        if (var == n) {
            System.out.println("Pirminis skaicius ! ");
        } else {
            System.out.println("Skaicius NE pirminis ! ");
        }
        }
    }

