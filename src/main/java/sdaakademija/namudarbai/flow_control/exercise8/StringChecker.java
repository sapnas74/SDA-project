package flow_control.exercise8;

import java.util.Scanner;

public class StringChecker {
    public String checkString(String messageToUser) {
        String checkedStringInput = "";

        Scanner scanString = new Scanner(System.in);
        System.out.print(messageToUser);
        String scannedString = scanString.nextLine();
        for (int i = 0; i < scannedString.length(); i++) {
            int currentChar = scannedString.charAt(i);

            if ((currentChar > 64 && currentChar < 91) || (currentChar > 96 && currentChar < 123)) {
                checkedStringInput = checkedStringInput + (char) currentChar;
            }
        }
        return checkedStringInput;
    }
}
