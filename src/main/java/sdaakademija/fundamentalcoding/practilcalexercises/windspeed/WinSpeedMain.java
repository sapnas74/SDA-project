package sdaakademija.fundamentalcoding.practilcalexercises.windspeed;

import java.util.Scanner;

// 1. Ivedamas vejo skaicius
// 2. Paverciamas vejo greitis is km/h  ---> greitis mazgais
// 3. Vejo greiti Beuforto skaleje Math.pow(greitis, laipsnis) beuforo skales formule = vejo greitis : 3.01 ^ 1.5
// 3.1 Beuforo greitis ne didesnis negu 12 km/h
// 4. Jei vejo greitis didesnis nei 2km -> Stiprus
// 5. Atspausdinti

public class WinSpeedMain {

    private static final double NAUTIC_MILE = 1.852;
    private static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Iveskite vejo stipruma km/h : ");
        int windSpeedKilometersPerHour = inputScanner.nextInt();

        System.out.println("Vejo greitis mazgais : " + kilometersPerHourToKnots(windSpeedKilometersPerHour));
        System.out.println("Vejo stiprumas Beauforto skaleje : " + kilometersPerHourToBeaufortScale(windSpeedKilometersPerHour));
        System.out.println("Vejo stiprumas : " + getWindSpeed(windSpeedKilometersPerHour));
    }

    private static double kilometersPerHourToKnots(int windSpeed) {
        return  (NAUTIC_MILE * windSpeed);
    }

    private static double kilometersPerHourToBeaufortScale(int windSpeed) {
        if (windSpeed < 12) {
            return (Math.pow(windSpeed / BEAUFORT_CONSTANT, 1.5));
        } else {
            return (12);
            // int beufort = Math.pow(windSpeed / BEAUFORT_CONSTANT, 1.5);
            // return Math.min(beufort, 12);
            // kitas variantas kaip rasyt
        }
    }

    private static double getWindSpeed (int windPower) {

        if (windPower > 2) {
            System.out.println("Vejas Stiprus");
        } else {
            System.out.println("Vejas Normalus  :) ! ");
        }

        return (windPower);

        //arba
        // String t = windPower <=20 ? "ramus" : "stiprus"

    }
}
