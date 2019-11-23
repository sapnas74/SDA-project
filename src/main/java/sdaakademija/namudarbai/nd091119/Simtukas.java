package sdaakademija.namudarbai.nd091119;

import java.util.Scanner;

public class Simtukas {

    public static void main(String[] args) {

        int counter = 1;
        int result = 0;

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Ivesk skaiciu : ");
        int number = numberScanner.nextInt();

        while (counter < 101) {

            result = counter / number;
            // System.out.println(result);
            // System.out.println(counter);

            // System.out.println("100 dalinamas is " + number);
            // System.out.println( result + "kartu");

            counter ++;
            }

            if (counter == 101) {

             System.out.println("skaiciai nuo 1 iki 100 dalinasi is " + number + " be liekanos : ");
             System.out.println( result + " kartu/kartus");

            }
        }
    }

