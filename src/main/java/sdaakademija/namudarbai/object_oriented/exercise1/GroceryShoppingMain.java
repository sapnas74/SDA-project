package object_oriented.exercise1;

import basics.exercise1.CheckForEnteredInt;
import flow_control.exercise6.ShopPayment;
import flow_control.exercise6.ShoppingMessages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GroceryShoppingMain {
    private static final String FILE_LOCATION_PRODUCTS = "C:\\Users\\stkas\\IdeaProjects\\Sapnas-Basics\\src\\object_oriented\\exercise1\\ProductsList";
//    public static final String FILE_LOCATION_SHOPPING_RESULT = "C:\\Users\\stkas\\IdeaProjects\\Sapnas-Basics\\src\\object_oriented\\exercise1\\Shopping_Result";

    public static void main(String[] args) {

        boolean shoppingCicle = true;
        int index = 1;
        double orderedProductsPrice = 0;
        List<Product> wishedProductsList = new ArrayList();
        ShoppingMessages shoppingMessages = new ShoppingMessages();
        CheckForEnteredInt intCheck = new CheckForEnteredInt();
        ShopPayment shopPayment = new ShopPayment();

        shoppingMessages.welcomeMessage();
        while (shoppingCicle) {
            List<Product> productList = getProductsFromFile();
            productsMenu(productList);
            shoppingMessages.productMessage();
            int productPosition = intCheck.scanEnteredData("Iveskite produkto numeri <1-10> : ");
            checkForProductNumberEntered(productPosition, intCheck);
            wishedProductsList = wishedProductsSelected(productList, productPosition, wishedProductsList);
            index = index + 1;
            if (index == 6) {
                shoppingCicle = false;
            }
            shoppingMessages.buyingHistory();
            printSelectedProducts(wishedProductsList);
            System.out.printf("%n");
        }
        shoppingMessages.payMessage();
        shopPayment.payment(getOrderedProductsPrice(wishedProductsList, orderedProductsPrice));
    }

    private static List<Product> getProductsFromFile() {
        List<Product> productList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION_PRODUCTS))) {
            String line = "";
            while (line != null) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                productList.add(mapProductData(line.split(";")));
            }
        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
        return productList;
    }

    private static Product mapProductData(String[] productData) {
        return new Product(productData[0], Double.parseDouble(productData[1]));
    }

    private static void productsMenu(List<Product> productList) {
        int countMenu = 0;

        for (Product product : productList) {
            countMenu = countMenu + 1;
            System.out.print(countMenu + ". " + product.getProductName());
            System.out.print(" kaina : " + product.getProductPrice());
            System.out.printf("%n");
        }
    }

    private static List<Product> wishedProductsSelected(List<Product> productList, int productPosition, List<Product> wishedProductsList) {
            int countProductsFullList = 0;

            for (int i = 0; i < productList.size(); i++) {
            countProductsFullList = countProductsFullList + 1;
            if (countProductsFullList == productPosition) {
                wishedProductsList.add(productList.get(i));
            }
        }
        return wishedProductsList;
    }

    private static void printSelectedProducts(List<Product> wishedProductsList) {
        for (Product product : wishedProductsList) {
            System.out.print(product.getProductName() + " - kaina : " + product.getProductPrice());
            System.out.printf("%n");
        }
        System.out.println("*****************************************");
        System.out.printf("%n");
    }

    private static double getOrderedProductsPrice(List<Product> wishedProductsList, double orderedProductsPrice) {
        for (Product product : wishedProductsList) {
            orderedProductsPrice = orderedProductsPrice + product.getProductPrice();
        }
        return orderedProductsPrice;
    }

    private static void checkForProductNumberEntered(int productPosition, CheckForEnteredInt intCheck) {
        boolean correctNumberEntered = true;
        while (correctNumberEntered) {
            if (productPosition > 0 && productPosition < 11) {
                correctNumberEntered = false;
            } else {
                System.out.println("Klaida - tokio numerio/produkto nera !");
                productPosition = intCheck.scanEnteredData("Iveskite produkto numeri <1-10> : ");
            }
        }
    }
}
/*
    private static void writeShoppingResult(List<Product> wishedProductsList) {
        String resultLine = "";
        for (Product product : wishedProductsList) {
            resultLine = product.getProductName() + " - " + " kaina : " + product.getProductPrice();
            System.out.println(resultLine);

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_LOCATION_SHOPPING_RESULT)) {
                bw.write(resultLine);
            } catch (FileNotFoundException e) {
                System.out.println("Failas nerastas !");
            } catch (IOException e) {
                System.out.println("Ivyko klaida rasant duomenis i faila !");
            }
        }
    }
*/
