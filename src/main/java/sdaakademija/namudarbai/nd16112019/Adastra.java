package sdaakademija.namudarbai.nd16112019;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Adastra {
    public static void main(String[] args) {

        String adAstra = "Ad Astra Per Aspera";

        System.out.println(adAstra.toUpperCase());

        System.out.println(adAstra.toLowerCase());

        System.out.println(adAstra.replace('A', 'X'));

        Pattern stringPattern = Pattern.compile("^Ad.+a$");
        Matcher stringMatcher = stringPattern.matcher(adAstra);
        System.out.println(stringMatcher.matches());

    }
}
