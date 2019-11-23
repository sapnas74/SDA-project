package sdaakademija.fundamentals.objectoriented.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {    // vadinasi funkcijos deklaravimu

        // String[] reiskia kad galim paleisti programa su parametrais.
        // args parametrai pvz is konsoles.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kambario ploti : ");
        int width = scanner.nextInt();

        System.out.println("Iveskite kambario auksti : ");
        int length = scanner.nextInt();

        Room room = new Room (width, length);

        //System.out.println("Kambario plotas yra : " + width * length);

        // int squareOfRoom = room.getLength() * room.getWidth();
        // System.out.println("Kambario plotas yra : " + squareOfRoom);

        int squareOfRoom = calculateSquareOfRoom(room.getWidth(), room.getLength());
        System.out.println("Kambario plotas yra : " + squareOfRoom);

    }

    // Privati Funkcija
    private static int calculateSquareOfRoom(int width, int length) {

        return (width * length);  // ka grazins Funkcija, galima grazint tiesiog sandauga

    }

}
