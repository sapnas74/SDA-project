package sdaakademija.fundamentalcoding.practilcalexercises.reversetext;

import java.util.Scanner;

public class StringBuilderMain {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite teksta : ");
        stringBuilder.append(scanner.nextLine());

        // String reverseText = stringBuilder.reverse().toString();

        System.out.println(stringBuilder.reverse());
        // viena funkcija reversina teksta
        // paskaityk apie StringBuilderi - nealakuoja naujo objekto, kaip tai Daro String

        // Control flow vykdoma su if-else. - sarysis Nulis su Daug.
        // gali buti daug if ir nebuti else
        //


    }

    public static class ReverseText {

        public static void main(String[] args) {

            Scanner textScanner = new Scanner (System.in);
            String text;
            String reverseText = "";

            System.out.println("Iveskite teksta : ");
            text = textScanner.nextLine();

            for (int i = text.length()-1; i >= 0; i --) {
                // iteruojame nuo nulio todel -1.
                // i -- visiskai tas pats kaip ir  i=i-1

                reverseText += text.charAt(i);
                // += visikai lygu reverseText = reverseText + text.charAt(i);

            }

            System.out.println(reverseText);

            // Java String Builder

        }
    }
}
