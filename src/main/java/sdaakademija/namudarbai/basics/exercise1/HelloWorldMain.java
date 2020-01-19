package basics.exercise1;

public class HelloWorldMain {
    public static void main(String[] args) {
        CheckForEnteredInt intChecker = new CheckForEnteredInt();
        printHello(intChecker.scanEnteredData("Kiek kartu pakartoti pasisveikinyma ? :"));
    }

    private static void printHello(int scannedRepeatNumber) {
        for (int i = 0; i < scannedRepeatNumber; i++) {
            System.out.println("Hello World !!!");
        }
    }
}
