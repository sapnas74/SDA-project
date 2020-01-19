package sdaakademija.advancedfeatures.exceptions.exercises;

        import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu : ");
        String text = textScanner.nextLine();

        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (Exception e) {
            try {
                double number2 = Double.parseDouble(text);
                System.out.println(number2);
            } catch (Exception ee) {
                System.out.println("Ivestas blogas skaicius !!!");
            }
        }
    }
}
