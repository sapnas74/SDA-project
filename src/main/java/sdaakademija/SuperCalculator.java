package sdaakademija;

import java.util.Scanner;
// import java.math.BigDecimal;
// mport java.math.RoundingMode;

public class SuperCalculator {
    /*
    Метод main() указывает интерпретатору класс, с которого нужно начать выполнение программы.
    Однако в языке Java разрешено использовать несколько методов с названием main() даже в одном классе.
     Поэтому по-настоящему главный метод содержит аргументы командной строки (String[] args).
     */
    public static void main(String[] args) {
        //Scanner numberScanner = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);

        //     Цикл для безостановочных рассчетов

        double result;

        boolean calculate = true;
        while (calculate) {

            //System.out.println("Ivesk pirma skaiciu : ");
            // double firstNum = numberScanner.nextDouble();
            double firstNum = getNum("Iveskite pirma skaiciu : ");

            // System.out.println("Ivesk antra skaiciu : ");
            double secondNum = getNum("Iveskite antra skaiciu : ");

            System.out.println("Koki veiksma norite atlikti ? : ");
            String action = actionScanner.nextLine();

            // BigDecimal result = BigDecimal.valueOf(0);

            result = getResult(action, firstNum, secondNum); // funkcijas
            System.out.println(result);

// https://javarush.ru/groups/posts/operator-switch-v-java

            System.out.println("Jei norite testi darba spauskite bet ka ");
            System.out.println("Jei norite baigti darba parasykite - taip : ");

            String answer = actionScanner.nextLine();

            if (answer.equals("TAIP") || answer.toLowerCase().equals("taip")) {

                calculate = false;

                //   System.out.println("Paskutine operacija : " + firstNum + action + secondNum + " = " + result);

            }

            // System.out.println("Paskutine operacija : " + firstNum + action + secondNum + " = " );

        }
    }

    // atskira funkcija
    private static double getResult(String action, double num1, double num2) {
        switch (action) {

            case ("+"): {
                return num1 + num2;
            }
            case (":"): {
                return num1 / num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("-"): {
                return num1 - num2;
            }
            default: {
                System.out.println("Veiksmas Nerastas !!!");
                return 0;
            }
        }
    }

    // dar  viena funkcija , kurios turi buti Klases ribose.
    private static double getNum(String message) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        return numberScanner.nextDouble();
    }
}