package object_oriented.exercise2;

import basics.exercise2.CheckForEnteredDouble;
import flow_control.exercise6.ShopPayment;
import flow_control.exercise6.ShoppingMessages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PetrolMain {
    public static void main(String[] args) {
        ShoppingMessages shoppingMessages = new ShoppingMessages();
        CheckForEnteredDouble checkForEnteredDouble = new CheckForEnteredDouble();
        ShopPayment shopPayment = new ShopPayment();

        boolean process = true;
        double finalPrice = 0;
        double payPrice = 0;
        List<Petrol> boughtPetrol = new ArrayList<>();

        shoppingMessages.welcomeMessage();
        while (process) {
            double petrolLiters = checkForEnteredDouble.scanEnteredData("Iveskite degalu kieki litrais : ");
            double priceEuro = checkForEnteredDouble.scanEnteredData("Iveskite degalu litro kaina : ");
            boughtPetrolList(boughtPetrol, petrolLiters, priceEuro);
            process = checkForAnswer(process);
        }
        shoppingMessages.shoppingHistory();
        printBoughtPetrolAndPrice(boughtPetrol);
        shoppingMessages.buyingHistory();
        payPrice = printFinalBoughtPetrolAndPrice(boughtPetrol, finalPrice);
        shopPayment.payment(payPrice);

    }

    private static Petrol mapData(double petrolLiters, double priceEuro) {
        return new Petrol(petrolLiters, priceEuro);
    }

    private static List<Petrol> boughtPetrolList(List<Petrol> boughtPetrol, double petrolLiters, double priceEuro) {
        boughtPetrol.add(mapData(petrolLiters, priceEuro));
        return boughtPetrol;
    }

    private static boolean checkForAnswer(boolean process) {

        System.out.printf("%n");
        System.out.println("Ar Jus noriite testi kuro pirkima ? ");
        System.out.println("Spauskite ENTER, jei norite testi pirkimus ");
        System.out.print("Spauskite ( ne ) , jei baigete : ");

        Scanner inputDataScan = new Scanner(System.in);
        String scannedAnswer = inputDataScan.nextLine();

        if (scannedAnswer.equals("ne")) {
            process = false;
        }
        return process;
    }

    private static void printBoughtPetrolAndPrice(List<Petrol> boughtPetrol) {
        int counting = 0;

        for (Petrol petrol : boughtPetrol) {
            counting = counting + 1;
            System.out.println(counting + ". " + petrol.getLitre() + " l. kuro, litro kaina : " + petrol.getPrice());
        }
        System.out.printf("%n");
    }

    private static double printFinalBoughtPetrolAndPrice(List<Petrol> boughtPetrol, double finalPrice) {
        double finalPetrol = 0;
        Date date = new Date();

        for (Petrol petrol : boughtPetrol) {
            finalPetrol = finalPetrol + petrol.getLitre();
            finalPrice = finalPrice + (petrol.getPrice() * petrol.getLitre());
        }
        System.out.println("Data : " + date);
        System.out.printf("%n");
        System.out.println("Viso - isipylta kuro : " + finalPetrol);
        System.out.printf("%n");
        System.out.println("Viso - moketi uz kura : : " + finalPrice);
        System.out.printf("%n");
        return finalPrice;
    }
}


