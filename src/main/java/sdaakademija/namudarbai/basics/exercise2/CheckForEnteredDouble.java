package basics.exercise2;

import java.util.Scanner;

public class CheckForEnteredDouble {

    public double scanEnteredData(String messageToUser) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.print(messageToUser);
        String scannedNumber = scanNumber.nextLine();
        while (doubleEnteredChecker(scannedNumber)) {
            System.out.println("KLAIDA !!! Neteisingai ivestas skaicius !!!");
            System.out.print("Bandykite dar karta : ");
            scannedNumber = scanNumber.nextLine();
        }
        return Double.parseDouble(scannedNumber);
    }

    public boolean doubleEnteredChecker(String enteredString) {
        try {
            Double.parseDouble(enteredString);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
