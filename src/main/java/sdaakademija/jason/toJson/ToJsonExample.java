package sdaakademija.jason.toJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import sdaakademija.jason.utils.file1.Staff;

import java.io.FileWriter;
import java.io.IOException;

public class ToJsonExample {

    private static final Logger logger = Logger.getLogger(ToJsonExample.class);
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\main\\java\\sdaakademija\\jason\\utils\\file1\\file1.json";

    public static void main(String[] args) {
        Gson gson = new Gson();

        Staff staff = Staff.buildStaff();

        String staffInJson = gson.toJson(staff);
        logger.info(staffInJson);

        try (FileWriter writer = new FileWriter(INPUT_FILE_LOCATION)) {
            gson.toJson(staffInJson, writer);
            logger.info("Information was successufully wrote into file.");
        } catch (IOException e) {
            logger.error("File not fouund");
        }

    }
}
