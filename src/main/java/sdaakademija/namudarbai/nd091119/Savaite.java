package sdaakademija.namudarbai.nd091119;

import java.util.Scanner;

public class Savaite {

    public static void main(String[] args) {

        int count = 0;

        Scanner actionScanner = new Scanner(System.in);
        System.out.println("Iveskite Savaites Diena : ");
        System.out.println(" (Savaites dienos rasomos tokiu formatu - pvz. Treciadienis) ");
        String action = actionScanner.nextLine();

        System.out.println(action);

        switch (action) {
            case ("Pirmadienis"): {

                System.out.println("Pirma savaites diena");
                break;

            } case ("Antradienis"): {

                System.out.println("Antra savaites diena");
                break;

            } case ("Treciadienis"): {

                System.out.println("Trecia savaites diena");
                break;

            } case ("Ketvirtadienis"): {

                System.out.println("Ketvirta savaites diena");
                break;

            } case ("Penktadienis"): {

                System.out.println("Penkta savaites diena");
                break;

            } case ("Sestadienis"): {

                System.out.println("Sesta savaites diena");
                break;

            } case ("Sekmadienis"): {

                System.out.println("Septynta savaites diena - Dievas Liepe ilsetis :)) ");
                break;

            } default: {

                System.out.println("Nera tokios dienos !!!");
            }

            }

    }
}




       //  System.out.println(week[]);


