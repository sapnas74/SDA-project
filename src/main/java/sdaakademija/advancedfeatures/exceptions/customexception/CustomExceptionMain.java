package sdaakademija.advancedfeatures.exceptions.customexception;

public class CustomExceptionMain {

    public static  final String TEXT = "tekstas";

    private static void main(String[] args) {
        try {
            if (!TEXT.equals("tekstas")) {
                throw new CustomException("Bad text found");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
