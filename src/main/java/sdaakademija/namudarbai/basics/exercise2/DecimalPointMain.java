package basics.exercise2;

public class DecimalPointMain {
    public static void main(String[] args) {
        CheckForEnteredDouble doubleChecker = new CheckForEnteredDouble();
        System.out.printf("Result : %.2f", doubleChecker.scanEnteredData("Iveskite double tipo skaiciu (pvz: 9,182621) : "));
    }
}
