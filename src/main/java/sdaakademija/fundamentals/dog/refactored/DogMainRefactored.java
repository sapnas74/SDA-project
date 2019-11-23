package sdaakademija.fundamentals.dog.refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static sdaakademija.fundamentals.fileread.Util.FILE_LOCATION;

public class DogMainRefactored {

    private static final String FILE_LOCATION = "C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\sdaakademija\\fundamentals\\dog\\refactored\\DogData.txt";

    public static void main(String[] args) {
        List<Dog> dogList = getDogsFromFile();

        /*for (int i = 0; i < 2; i++) {
            dogList.add(buildDog());
        }*/

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));

    }
    // List<Dog> grazins visus inicializuotus sunis is failo
    private static List<Dog> getDogsFromFile() {

        List<Dog> dogList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {

            String line = "";

            while (line != null) {                  //iskaidem i masiva
                line = br.readLine();
                if (line == null) { break;}
                dogList.add(mapDataToObject(line.split(",")));
            }

        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
        return dogList;
    }


    /*private static Dog buildDog() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite šuns vardą");
        String name = inputScanner.nextLine();

        System.out.println("Įveskite šuns spalvą");
        String color = inputScanner.nextLine();

        System.out.println("Įveskite šuns amžių");
        int age = inputScanner.nextInt();

        return new Dog(name, age, color);
    }*/


    private static Dog mapDataToObject(String[] dogsData) {
        return new Dog(dogsData[0], Integer.parseInt(dogsData[1]), dogsData[2]);
    }

    private static String findOldestDog(List<Dog> dogList) {
       /*return dogList.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get()
                .getName();*/

        String oldestDogName = dogList.get(0).getName();

        int oldestDog = dogList.get(0).getAge();

        for (Dog dog : dogList) {
            if (oldestDog < dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
        }

        return oldestDogName;
    }

    private static double findAverageYearOfDogs(List<Dog> dogList) {
        double averageYear = 0;

        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }

        return averageYear / dogList.size();
    }
}
