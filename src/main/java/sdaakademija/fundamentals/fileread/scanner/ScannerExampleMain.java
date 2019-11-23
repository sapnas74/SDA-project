package sdaakademija.fundamentals.fileread.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static sdaakademija.fundamentals.fileread.Util.FILE_LOCATION;

public class ScannerExampleMain {

    public static void main(String[] args) {

        // Need to close
        try {
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION));
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }

        // Closes automatically

        try (Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
    }
}
