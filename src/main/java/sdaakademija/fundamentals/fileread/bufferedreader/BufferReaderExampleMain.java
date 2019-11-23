
package sdaakademija.fundamentals.fileread.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static sdaakademija.fundamentals.fileread.Util.FILE_LOCATION;

public class BufferReaderExampleMain {
    public static void main(String[] args) {

            try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
                StringBuilder stringBuilder = new StringBuilder();
                String line;

                // FileReader paima fila
                // BufferedReader igalioja keisti duomenis, skaityti is failo.

                // do {                                 Sitas variantas su klaida :)
                //    line = br.readLine();
                //    stringBuilder.append(line);
                //} while (line != null);

            while(true) {

                    line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    stringBuilder.append(line);
                }

            System.out.println(stringBuilder.toString());

            br.close();
            } catch(IOException e) {
                e.printStackTrace();

            }
        }
    }



