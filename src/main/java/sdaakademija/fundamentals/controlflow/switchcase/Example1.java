package sdaakademija.fundamentals.controlflow.switchcase;

public class Example1 {
    public static void main(String[] args) {

        char direction = 'w';

        switch (direction) {
            case 'n':
                System.out.println("Keliaujame i siaure ");
                break;
            case 's':
                System.out.println("Keliaujame i pietus ");
                break;
            case 'e':
                System.out.println("Keliaujame i rytus");
                break;
            case 'w':
                System.out.println("Keliaujame i vakarus ");
                break;
            default:
                System.out.println("Esame Kosmose");
                break;

        }
    }
}
