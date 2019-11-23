package sdaakademija.fundamentalcoding.practilcalexercises.maxvalue;

import java.util.Scanner;

public class MaxValueMain {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("iveskite skaicius : ");
        String numbersInText = inputScanner.nextLine();
        String[] numberArr = numbersInText.split(",");  // cia sukuriam masiva

        // Integer.parse("") - tekstas verciamas skaiciumi
        // .split(",") - tekstas skaidomas per simboly ","
        // 1. Ivedami sveiki skaiciai , atsikirami kableliu
        // 2. Skaiciai atskiriami i tekstini masyva su funkcija .split(",")
        // 3. Tekstines reiksmes skaiciai paverciami int tiipo su Integer.parsel("skicius")
        // 4. Randama didziausia reiksme

        int max = Integer.parseInt(numberArr[0]);
        for (int i = 0; i < numberArr.length; i++) {
            int number = Integer.parseInt(numberArr[i]);
            if ( number > max) {
                max = number;
            }
        }

        System.out.println("Maksimalus skaicius - " + max);
    }
}

