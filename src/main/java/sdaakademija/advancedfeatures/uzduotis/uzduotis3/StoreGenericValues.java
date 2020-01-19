package sdaakademija.advancedfeatures.uzduotis.uzduotis3;

import java.util.ArrayList;
import java.util.List;

public class StoreGenericValues<T> {

    private List<T> items;

    public StoreGenericValues() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void storeValue(T value) {
        items.add(value);
    }
}
