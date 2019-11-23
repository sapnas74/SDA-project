package sdaakademija.fundamentalcoding.practilcalexercises.circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {

        double radius = getCircleRadius("Iveskite apskritimo radiusa : ");
        String color = getCircleColor("Iveskite apskritimo spalva");

        System.out.println("Apskritimo plotas lygus : " + circleArea(radius));
        System.out.println("Apskritimo spalva : " + color);
        System.out.println("Apskritimo ilgis : " + circumFerence(radius));

        Circle circle = new Circle (radius, color);

        circle.getRadius();
        circle.getColor();
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
    }

    private static double circleArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;

    }

    private static double circumFerence(double radius) {

        return 2 * Math.PI * radius;
    }

    private static double getCircleRadius(String message) {
        Scanner radius = new Scanner(System.in);
        System.out.println(message);
        return radius.nextDouble();
    }

    private static String getCircleColor(String message) {
        Scanner color = new Scanner(System.in);
        System.out.println(message);
        return color.nextLine();
    }
}
