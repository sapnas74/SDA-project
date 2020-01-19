package sdaakademija.advancedfeatures.annotations.supresswarnings;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        addWordInToList(Arrays.asList());
    }

    // Compile class to see warning , paslepe kai kurias klaidas
    // @SuppressWarnings("unchecked")
    private static void addWordInToList(List inputList) {
        List<String> list = (List<String>) inputList;
    }

}
