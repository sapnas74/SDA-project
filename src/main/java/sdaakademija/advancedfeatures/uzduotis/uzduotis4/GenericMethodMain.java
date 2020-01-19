package sdaakademija.advancedfeatures.uzduotis.uzduotis4;

import java.util.List;

public class GenericMethodMain {
    public static <T> T lastEntry(List<T> list) {       // kaip stirng kaip Int  :) Rasom <T> T
        return list.get(list.size() -1);
    }
}
