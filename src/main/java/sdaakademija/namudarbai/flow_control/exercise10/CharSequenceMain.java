package flow_control.exercise10;

import java.util.Random;

public class CharSequenceMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomStringsVolume = rand.nextInt(50);
        int maxStringLength = 0;
        String maxString = "";
        for (int i = 0; i < randomStringsVolume; i++) {
            String floatingString = randomStringGenerator();
            System.out.println(floatingString);
            if (floatingString.length() > maxStringLength) {
                maxStringLength = floatingString.length();
                maxString = floatingString;
            }
        }
        System.out.println(" ");
        System.out.println("Ilgiausia sugeneruota eilute yra : " + maxString);
        System.out.println("Eilutes ilgis yra : " + maxStringLength);
    }

    private static char randomCharGenerator() {
        Random rand = new Random();
        boolean randomCharFinder = true;
        char randomizedChar = ' ';
        int randomChar = 0;

        while (randomCharFinder) {
            randomChar = rand.nextInt(123);
            if((randomChar > 64 && randomChar < 91) || (randomChar > 96 && randomChar < 123)) {
                randomizedChar = (char) randomChar;
                randomCharFinder = false;
            }
        }
        return randomizedChar;
    }

    private static String randomStringGenerator() {
        Random rand2 = new Random();
        StringBuilder randomString = new StringBuilder();
        int randomStringLength = rand2.nextInt(50);
        for (int i = 0; i < randomStringLength; i++) {
            randomString.append(randomCharGenerator());
        }
        return randomString.toString();
    }
}
