package sdaakademija.advancedfeatures.uzduotis.uzduotis4;

        import java.util.Arrays;
        import java.util.List;

public class ExampleMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","b","d");
        List<Integer> integers = Arrays.asList(6,9,11,3,5);

        System.out.println(GenericMethodMain.lastEntry(strings));
        System.out.println(GenericMethodMain.lastEntry(integers));

    }
}
