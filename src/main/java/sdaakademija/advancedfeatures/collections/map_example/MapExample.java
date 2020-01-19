package java_advanced.collections.map_example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();
        countries.put("Poland","Warsaw");
        countries.put("Germany","Berlin");

        for (Map.Entry<String, String> dictionary : countries.entrySet()) {
            String country = dictionary.getKey();
            String capital = dictionary.getValue();
            System.out.printf("%s : %s\n", country, capital);

        }

        for (String myMap : countries.values()) {
            System.out.println(myMap);
        }
    }
}
