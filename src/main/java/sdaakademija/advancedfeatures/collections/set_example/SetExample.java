package java_advanced.collections.set_example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");

        for (String country : travelRoute ) {
            System.out.println(country + " ");
        }
    }
}
