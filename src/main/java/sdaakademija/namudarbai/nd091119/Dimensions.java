package sdaakademija.namudarbai.nd091119;

import java.util.Scanner;

public class Dimensions {

    public static void main(String[] args) {

        Scanner firstCoordinateScanner = new Scanner(System.in);
        Scanner secondCoordinateScanner = new Scanner(System.in);

        System.out.println("Ivesk pirma skaiciu : ");
        double firstCoordinate = secondCoordinateScanner.nextDouble();

        System.out.println("Ivesk antra skaiciu : ");
        double secondCoordinate = firstCoordinateScanner.nextDouble();

        if (firstCoordinate > 0 && secondCoordinate > 0) {

            System.out.println("Randasi 1m - kvadrate");
            System.out.println(firstCoordinate);
            System.out.println(secondCoordinate);

        } else {
        }
        if (firstCoordinate > 0 && secondCoordinate < 0) {

            System.out.println("Randasi 4m - kvadrate");

        } else {
        }
        if (firstCoordinate < 0 && secondCoordinate > 0) {

            System.out.println("Randasi 2m - kvadrate");

        } else {

        }
        if (firstCoordinate < 0 && secondCoordinate < 0) {

            System.out.println("Randasi 3m - kvadrate");

        } else {

        }
        if (firstCoordinate == 0 && secondCoordinate == 0) {

            System.out.println("Jus Esate Pasaulio centre !!! ");

        } else {
        }
        if (firstCoordinate == 0 && secondCoordinate != 0) {

            System.out.println("Jus Esate Y - asyje ");

        } else {
            if (firstCoordinate != 0 && secondCoordinate == 0) {

                System.out.println("Jus Esate X - asyje ");
            }
        }

    }
}


