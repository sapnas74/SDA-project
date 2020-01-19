package object_oriented.exercise3;

import basics.exercise1.CheckForEnteredInt;
import java.util.Random;


public class TicTacToeMain {

    static int[] gameSquares = {0,0,0,0,0,0,0,0,0};

    //  0 1 2
    //  3 4 5
    //  6 7 8

    public static void main(String[] args) {
        TicTacToe_Graphics ticTacToe_graphics = new TicTacToe_Graphics();
        CheckForEnteredInt intCheck = new CheckForEnteredInt();
        boolean gameEnds = true;
        boolean isX;

        ticTacToe_graphics.constructGameSquares(gameSquares);

        isX = whoStarts();

        while(gameEnds) {
            while (isX) {
                checkIfFieldFree(gameSquares, getSquarePosition());

            }
        }
    }

    private static boolean whoStarts() {
        boolean userOrPC;
        Random whoStartsRandomizer = new Random();
        int whoStarts = whoStartsRandomizer.nextInt(1);
        if(whoStarts == 0) {
            userOrPC = true;
        } else {
            userOrPC = false;
        }
        // isX = true - pradeda zaidejas
        // isX = false - pradeda kompas
        return userOrPC;
    }

    private static int getSquarePosition() {
        CheckForEnteredInt intCheck = new CheckForEnteredInt();
        System.out.printf("%n");
        int getSquareNumber = intCheck.scanEnteredData("Iveskite laisvo lauko numeri : ");
        if (getSquareNumber > -1 && getSquareNumber < 9) {
        } else {
            getSquarePosition();
        }
        return getSquareNumber;
    }

    private static boolean checkIfFieldFree(int[] gameSquares, int position) {
        boolean fieldFreeChecker = true;
            if (gameSquares[position] != 0) {
                fieldFreeChecker = false;
            }
            if (gameSquares[position] == 0) {
                fieldFreeChecker = true;
            }
        return fieldFreeChecker;
    }
}
