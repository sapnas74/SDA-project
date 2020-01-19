package flow_control.exercise6;

import basics.exercise2.CheckForEnteredDouble;

public class ShopPayment {
    public void payment(double needToPayAmmount) {
        CheckForEnteredDouble doubleCheck = new CheckForEnteredDouble();
        ShoppingMessages shoppingMessages = new ShoppingMessages();

        double paymentAmmount;
        boolean payProcess = true;

        while (payProcess) {
            paymentAmmount = doubleCheck.scanEnteredData("Iveskite mokama suma : ");
            System.out.printf("%n");
            System.out.println("*****************************************");
            System.out.printf("%n");
            System.out.printf("Reikia moketi : %.2f", needToPayAmmount);
            System.out.print(" Eu.");
            System.out.printf("%n");
            System.out.printf("Mokama : %.2f", paymentAmmount);
            System.out.print(" Eu.");
            System.out.printf("%n");


            if (paymentAmmount == needToPayAmmount) {
                shoppingMessages.thanksForBuying();
                payProcess = false;
            } else if (paymentAmmount > needToPayAmmount) {
                shoppingMessages.thanksForBuying();
                System.out.printf("Jusu graza yra : %.2f", (paymentAmmount - needToPayAmmount));
                System.out.print(" Eu.");
                System.out.printf("%n");
                payProcess = false;
            } else if (paymentAmmount < needToPayAmmount) {
                System.out.printf("Jus mokate per mazai , truksta %.2f", (paymentAmmount - needToPayAmmount));
                System.out.print(" Eu.");
                System.out.printf("%n");
                System.out.println("***************************************");
                needToPayAmmount = needToPayAmmount - paymentAmmount;
            }
        }
    }
}

