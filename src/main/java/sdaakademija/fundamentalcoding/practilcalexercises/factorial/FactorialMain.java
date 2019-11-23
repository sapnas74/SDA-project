package sdaakademija.fundamentalcoding.practilcalexercises.factorial;

import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        int result = 1;

        System.out.println("Ivesk skaiciu : ");
        int input = numberScanner.nextInt();

        for ( int i = 1; i <= input; i++ ) {
            result *= i;
        }

        System.out.println(result);

        }
    }

