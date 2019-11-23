package sdaakademija.fundamentals.practicalexercises.workes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkersMain {

    private static final String FILE_LOCATION_WORKERS = "C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\main\\java\\sdaakademija\\fundamentals\\practicalexercises\\workes\\WorkersData.txt";

    public static void main(String[] args) {

        List<Workers> workersList = getWorkersFromFile();

        System.out.println("Vidutinis darbuotoju amzius yra : " + workersAverageAge(workersList));
        System.out.println("Vidutinis darbuotoju uzmokestis yra : " + workersAverageSalary(workersList));
        System.out.println("Daugiausiai uzdirba : " + workerBestSalary(workersList));
        System.out.println("Jauniausias darbuotojas : " + workerYoungest(workersList));
    }

    private static List<Workers> getWorkersFromFile() {

        List<Workers> workersList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION_WORKERS))) {

            String line = "";

            while (line != null) {
                line = br.readLine();
                if (line == null) { break;}
                workersList.add(mapDataToObject(line.split(",")));
            }

        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
        return workersList;
        }

    private static Workers mapDataToObject(String[] workersData) {
        return new Workers(workersData[0], Double.parseDouble(workersData[1]), Integer.parseInt(workersData[2]), workersData[3]);
    }

    private static double workersAverageAge(List<Workers> workersList) {
        int workersAgeSum = 0;

        for (Workers workers : workersList) {
            workersAgeSum += workers.getAge();
        }

        return (double) workersAgeSum / workersList.size();
    }

    private static double workersAverageSalary(List<Workers> workersList) {
        int workersSalarySum = 0;

        for (Workers workers : workersList) {
            workersSalarySum += workers.getSalary();
        }

        return (double) workersSalarySum / workersList.size();
    }

    private static double workerBestSalary(List<Workers> workersList) {
        double workerBest = 0;

        for (Workers workers : workersList) {
            if (workerBest < workers.getSalary()) {
                workerBest = workers.getSalary();
            }
        }
        return workerBest;
    }

    private static String workerYoungest(List<Workers> workersList) {
        String workerYoung = workersList.get(0).getName();
        int workersYoungestAge = workersList.get(0).getAge();

        for (Workers workers : workersList) {
            if (workers.getAge() < workersYoungestAge) {
                workerYoung = workers.getName();
            }
        }
        return workerYoung;
    }
}
