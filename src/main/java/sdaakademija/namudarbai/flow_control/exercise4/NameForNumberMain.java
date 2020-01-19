package flow_control.exercise4;

        import basics.exercise1.CheckForEnteredInt;

public class NameForNumberMain {
    public static void main(String[] args) {
        CheckForEnteredInt intCheck = new CheckForEnteredInt();
        boolean process = true;
        int number = intCheck.scanEnteredData("Iveskite bet koki skaiciu nuo 0 iki 9 : ");

        while (process) {
            if (number > -1 && number < 10) {
                switchCase(number);
                process = false;
            } else {
                System.out.print("KLAIDA !!! Ivestas netesingas skaicius !!!");
                number = intCheck.scanEnteredData("Iveskite bet koki skaiciu nuo 0 iki 9 : ");
            }
        }
    }

    private static void switchCase(int number) {
        switch (number) {
            case (0): {
                System.out.println("Ivestas skaicius - Nulis");
                break;
            }
            case (1): {
                System.out.println("Ivestas skaicius - Vienas");
                break;
            }
            case (2): {
                System.out.println("Ivestas skaicius - Du");
                break;
            }
            case (3): {
                System.out.println("Ivestas skaicius - Trys");
                break;
            }
            case (4): {
                System.out.println("Ivestas skaicius - Keturi");
                break;
            }
            case (5): {
                System.out.println("Ivestas skaicius - Penki");
                break;
            }
            case (6): {
                System.out.println("Ivestas skaicius - Sesi");
                break;
            }
            case (7): {
                System.out.println("Ivestas skaicius - Septyni");
                break;
            }
            case (8): {
                System.out.println("Ivestas skaicius - Astuoni");
                break;
            }
            case (9): {
                System.out.println("Ivestas skaicius - Devyni");
                break;
            }
            default: {
                System.out.println("Neteisingai ivestas skaicius !!! ");
            }
        }
    }
}
