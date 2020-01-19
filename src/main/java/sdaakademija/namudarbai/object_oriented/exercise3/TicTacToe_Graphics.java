package object_oriented.exercise3;

public class TicTacToe_Graphics {
    public void constructGameSquares(int[] gameSquares) {
        System.out.println("     |     |     ");
        for (int i = 0; i < gameSquares.length; i++) {
            if (i != 0) {
                if (i % 3 == 0) {
                    System.out.println();
                    System.out.println("_____|_____|_____");
                    System.out.println("     |     |     ");
                }
             else {
                    System.out.print("|");
                }
            }
            if (gameSquares[i] == 0) {
                System.out.print("  " + i + "  ");
            }
            if (gameSquares[i] == 1) {
                System.out.print("  X  ");
            }
            if (gameSquares[i] == 2) {
                System.out.print("  O  ");
            }
        }
        System.out.println();
        System.out.println("     |     |     ");
    }
}
