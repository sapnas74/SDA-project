package sdaakademija.namudarbai.nd16112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            carList.add(buildCar());
        }

        System.out.println("Naujausia masina yra : " + findNewestCar(carList) + " metu gamybos");
        System.out.println("Vidutinis masinu amzius yra : " + findAverageCarsYear(carList));
        System.out.println("Brangiausios masinos kaina yra : " + findExpensiveCar(carList));
        System.out.println();

    }

    private static Car buildCar() {

        Scanner inputScanner = new Scanner(System.in);
        Scanner inputListScanner = new Scanner(System.in);

        System.out.println("Įveskite masinos modeli : ");
        String model = inputListScanner.nextLine();

        System.out.println("Įveskite masinos variklio turi : ");
        int engine = inputScanner.nextInt();

        System.out.println("Įveskite masinos metus : ");
        int year = inputScanner.nextInt();

        System.out.println("Įveskite masinos kaina : ");
        int price = inputScanner.nextInt();

        System.out.println("Įveskite masinos tipa : ");
        String type = inputListScanner.nextLine();

        System.out.println("------------------------------");

        return new Car(model, engine, year, price, type);
    }

    private static int findNewestCar(List<Car> carList) {
        int newestCar = carList.get(0).getYear();
        for (Car car : carList) {
            if (car.getYear() > newestCar) {
                newestCar = car.getYear();

             // arba    newestCar = Math.max(ewestCar, car.getYear());
            }
        }
        return newestCar;
    }

    private static double findAverageCarsYear(List<Car> carList) {
        double averageYear = 0;
        for (Car car : carList) {
            averageYear += car.getYear();
        }
        return averageYear / carList.size();
    }

    private static double findExpensiveCar(List<Car> carList) {
        double expensiveCar = carList.get(0).getPrice();
        for (Car car : carList) {
            if (expensiveCar < car.getPrice()) {
                expensiveCar = car.getPrice();
            }
        }
        return expensiveCar;
    }

}
