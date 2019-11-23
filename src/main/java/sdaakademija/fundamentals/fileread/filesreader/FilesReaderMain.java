package sdaakademija.fundamentals.fileread.filesreader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static sdaakademija.fundamentals.fileread.Util.FILE_LOCATION;

public class FilesReaderMain {
    public static void main(String[] args) {

        try {
            String text = Files.readString(Paths.get(FILE_LOCATION));
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
    }
}
