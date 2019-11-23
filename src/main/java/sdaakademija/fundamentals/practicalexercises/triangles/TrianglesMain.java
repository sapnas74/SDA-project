package sdaakademija.fundamentals.practicalexercises.triangles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrianglesMain {

    private static final String INPUT_FILE_LOCATION = "C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\main\\java\\sdaakademija\\fundamentals\\practicalexercises\\triangles\\trianglesData.txt";
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\main\\java\\sdaakademija\\fundamentals\\practicalexercises\\triangles\\trianglesOut.txt";

    public static void main(String[] args) {

        List<Triangle> triangles = getTrianglesFromFile();

        calculateTrianglesPerimeter(triangles);
        writeDataToFile(triangles);
    }

    private static List<Triangle> getTrianglesFromFile() {
        List<Triangle> triangles = new ArrayList<>();

        try (BufferedReader br= new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {

            String line = br.readLine();

            while (line != null) {

                triangles.add(mapInfoToModel(line));
                line = br.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas !");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila !");
        }
        return triangles;
    }

    private static void calculateTrianglesPerimeter(List<Triangle> triangles) {
        for (Triangle t: triangles) {
            int sum = t.getA() + t.getB() + t.getC();
            t.setPerimeter(sum);
        }
    }


    private static Triangle mapInfoToModel(String line) {
        String[] splittedLine = line.split(",");

        return new Triangle (
                Integer.parseInt(splittedLine[0]),
                Integer.parseInt(splittedLine[1]),
                Integer.parseInt(splittedLine[2]),
                TriangleType.valueOf(splittedLine[3])
        );
    }

    private static void writeDataToFile(List<Triangle> triangles) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangles) {
                bw.write("Trikampio tipas : " + t.getTriangleType().getTriangleDescription() + " Perimetras : " + t.getPerimeter() + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas !");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila !");
        }
    }
}
