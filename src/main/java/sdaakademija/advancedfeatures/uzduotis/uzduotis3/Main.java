package sdaakademija.advancedfeatures.uzduotis.uzduotis3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StoreGenericValues values = new StoreGenericValues();

        values.storeValue("Mogikan");
        values.storeValue("100");
        values.storeValue("17.00");

        List items = values.getItems();

        for (Object item : items) {
            System.out.println("Item in list: " + item);
        }
    }
}
