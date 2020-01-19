package basics.exercise1;

import java.util.Scanner;

public class CheckForEnteredInt {
    public int scanEnteredData(String messageToUser) {

        Scanner scanNumber = new Scanner(System.in);
        System.out.print(messageToUser);
        String scannedNumber = scanNumber.nextLine();
        while (integerEnteredChecker(scannedNumber)) {

            System.out.println("KLAIDA !!! Neteisingai ivestas skaicius !!!");
            System.out.print("Bandykite dar karta : ");
            scannedNumber = scanNumber.nextLine();

        }
        return Integer.parseInt(scannedNumber);
    }

    public boolean integerEnteredChecker(String enteredString) {
        try {
            Integer.parseInt(enteredString);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
