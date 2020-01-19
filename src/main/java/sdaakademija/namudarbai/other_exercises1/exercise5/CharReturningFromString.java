package other_exercises1.exercise5;

import flow_control.exercise8.StringChecker;

public class CharReturningFromString {
    public char returnChar() {

        char scannedChar = checkIfUserEnteredChar("Iveskite zodzio raide : ");
        return scannedChar;
    }

    public char checkIfUserEnteredChar(String userMessage) {
        char scannedChar = ' ';
        StringChecker stringChecker = new StringChecker();
        String scannedString = stringChecker.checkString(userMessage);
        if (scannedString.length() != 0) {
            scannedChar = scannedString.charAt(0);
        } else {
            System.out.println("Klaida ! Ivestas skaicius vietoj raides ! ");
        }
        return scannedChar;
    }
}
