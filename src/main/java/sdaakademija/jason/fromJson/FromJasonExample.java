package sdaakademija.jason.fromJson;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import sdaakademija.jason.utils.file1.Staff;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FromJasonExample {

    private static final Logger logger = Logger.getLogger(FromJasonExample.class);
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\main\\java\\sdaakademija\\jason\\utils\\file1\\file1.json";

    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(INPUT_FILE_LOCATION)) {
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);
            logger.info("Data was read successfully");
        } catch (IOException e) {
            logger.error("Error occured while reader file!");
        }
    }
}
