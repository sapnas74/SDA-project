package java_advanced.uzduotis5;

public class Main {
    public static void main(String[] args) {

        TwoItems<String> twoNames = new TwoItems<>("Jonas","Petras");

        String name1 = twoNames.getEntry1();
        String name2 = twoNames.getEntry2();

        System.out.printf("First item : %s,%n", name1);
        System.out.printf("Seconditem : %s,%n", name2);
        System.out.println(twoNames.toString());

        TwoItems<Integer> twoNums = new TwoItems<>(6,9);

        int num1 = twoNums.getEntry1();
        int num2 = twoNums.getEntry2();

        System.out.printf("First item : %s,%n", num1);
        System.out.printf("Seconditem : %s,%n", num2);
        System.out.println(twoNums.toString());
    }
}
