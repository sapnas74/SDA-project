package flow_control.exercise6;

import basics.exercise1.CheckForEnteredInt;

public class ShoppingMain {

    private static final double MILK_PRICE = 2.45;
    private static final double WINE_PRICE = 7.82;
    private static final double ALCO_AGE = 21;

    public static void main(String[] args) {
        ShoppingMessages shoppingMessages = new ShoppingMessages();
        CheckForEnteredInt intCheck = new CheckForEnteredInt();
        ShopPayment payingProcess = new ShopPayment();

        shoppingMessages.welcomeMessage();
        int productSelection = productSelection(shoppingMessages, intCheck);

        if (productSelection == 1) {
            productList(productSelection, shoppingMessages);
            payingProcess.payment(MILK_PRICE);
        }
        if (productSelection == 2) {
            int scannedAge = intCheck.scanEnteredData("Iveskite savo amziu : ");
            if (scannedAge < ALCO_AGE) {
                System.out.printf("%n");
                System.out.println("KLAIDA !!! Alkogolis ne parduodamas asmenim jaunesnem nei 21 metai !!!");
                shoppingMessages.thanksForBuying();
            } else {
                productList(productSelection, shoppingMessages);
                payingProcess.payment(WINE_PRICE);
            }
        }
    }

    public static int productSelection(ShoppingMessages shoppingMessages, CheckForEnteredInt intCheck) {
        boolean process = true;
        System.out.println("1. Pienas : kaina - " + MILK_PRICE + " Eu.");
        System.out.printf("%n");
        System.out.println("2. Vynas : kaina - " + WINE_PRICE + " Eu.");
        System.out.printf("%n");
        shoppingMessages.productMessage();
        int productSelection = intCheck.scanEnteredData("Iveskite norimo produkta - 1 arba 2 : ");
        while (process) {
            if (productSelection == 1 || productSelection == 2) {
                process = false;
            } else {
                System.out.println("KLAIDA !!! Tokio produkto parduotuveje nera !!!");
                productSelection = intCheck.scanEnteredData("Iveskite norimo produkto pozicija - 1 arba 2 : ");
            }
        }
        return productSelection;
    }

    private static void productList(int productSelection, ShoppingMessages shoppingMessages) {

        if (productSelection == 1) {
            shoppingMessages.shoppingHistory();
            System.out.println("1. Jus pasirinkote piena, kaina : " + MILK_PRICE + " Eu.");
            shoppingMessages.payMessage();
        }
        if (productSelection == 2) {
            shoppingMessages.shoppingHistory();
            System.out.println("2. Jus pasirinkote vyna, kaina : " + WINE_PRICE + " Eu.");
            shoppingMessages.payMessage();
        }
    }
}



