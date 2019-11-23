package sdaakademija.fundamentals.varargs;

public class Example1 {

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1));
        System.out.println(sum());
    }

    /// ... reiskia kad gali ateiti daug tokio tipo elementu
    private static int sum(int... elements) {
        int result = 0;

        for (int i : elements) {
            result += i;
        }
        return result;
    }

}
