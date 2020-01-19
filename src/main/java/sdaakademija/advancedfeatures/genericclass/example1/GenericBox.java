package sdaakademija.advancedfeatures.genericclass.example1;

public class GenericBox<T> {

    private T item;             // reiskias kad paduodamas bus objektas - T

    public GenericBox(T item) {

        this.item = item;
    }

    public GenericBox() {

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
