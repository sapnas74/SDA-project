package sdaakademija.namudarbai.nd16112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogMain {
    public  static void main(String[] args) {

        List<Dog> dogList = new ArrayList<>();
        for (int i=1; i<= 3; i++){
            String name = getDogName("Iveskite suns varda: ");
            int age = getDogAge("Iveskite suns metus: ");
            String color = getDogColor("Iveskite suns spalva");
            Dog dog = new Dog(name, age, color);
            dogList.add(dog);

            // galima tiesiog dogList.add(Dog dog = new Dog(name, age, color));
        }

        System.out.println("Vyriausio suns vardas: " + getMaxAgeName(dogList));
        System.out.printf("Vidutinis sunu amzius: %.2f ", getAgeAverage(dogList));
        System.out.println();

    }
    private static String getDogName (String message){
        Scanner dogName = new Scanner(System.in);
        System.out.println(message);
        return dogName.nextLine();
    }
    private static int getDogAge (String message){
        Scanner dogAge = new Scanner(System.in);
        System.out.println(message);
        return dogAge.nextInt();
    }
    private static String getDogColor (String message){
        Scanner dogColor = new Scanner(System.in);
        System.out.println(message);
        return dogColor.nextLine();
    }

    private  static String getMaxAgeName(List<Dog> dogList){
        int maxAge = 0;
        String maxAgeName = null;
        for (Dog i : dogList) {
            if (i.getAge() > maxAge) {
                maxAge = i.getAge();
                maxAgeName = i.getName();
            }
        }
        return maxAgeName;
    }
    private  static double getAgeAverage(List<Dog> dogList ){

        int sum=0;
        for (Dog i: dogList){
            sum+=i.getAge();
        }
        return (double) sum / dogList.size();
    }
}