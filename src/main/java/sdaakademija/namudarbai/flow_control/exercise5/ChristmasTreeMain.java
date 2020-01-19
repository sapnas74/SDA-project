package flow_control.exercise5;

import basics.exercise1.CheckForEnteredInt;

public class ChristmasTreeMain {
    public static void main(String[] args) {
        CheckForEnteredInt intCheck = new CheckForEnteredInt();

        int triangleHeight = intCheck.scanEnteredData("Iveskite trikampio auksti : ");
        int rectangleHeight = intCheck.scanEnteredData("Iveskite staciakampio auksti : ");
        int rectangleWidth = intCheck.scanEnteredData("Iveskite staciakampio ploti : ");
        int triangleHeightMinusOne = triangleHeight - 1;

        printingTriangle(triangleHeight, triangleHeightMinusOne);
        System.out.printf("%n");
        printingRectangular(rectangleHeight, rectangleWidth);
        merryChristmasSong();
        printingTriangle(triangleHeight, triangleHeightMinusOne);
        printingTrunk(triangleHeight);
        System.out.printf("%n");
    }

    private static int triangleWidthCalc(int triangleStage) {
        int stageWidth = 1;
        for (int i = 1; i < triangleStage; i++) {
            stageWidth = stageWidth + 2;
        }
        return stageWidth;
    }

    private static void printingSpace(int triangleHeightMinusOne) {
        for (int i = triangleHeightMinusOne; i > 0; i--) {
            System.out.print(" ");
        }
    }

    private static void printingTriangle(int triangleHeight, int triangleHeightMinusOne) {
        for (int i = 1; i < triangleHeight + 1; i++) {
            printingSpace(triangleHeightMinusOne--);
            for (int y = 0; y < triangleWidthCalc(i); y++) {
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }

    private static void printingRectangular(int rectangleHeight, int rectangleWidth) {
        for (int i = 0; i < rectangleHeight; i++) {
            for (int ii = 0; ii < rectangleWidth; ii++) {
                System.out.print("* ");
            }
            System.out.printf("%n");
        }
    }

    private static void printingTrunk(int triangleHeight) {
        int treeCenter = triangleWidthCalc(triangleHeight) / 2;
        int trunkHeight = triangleHeight / 2;
        for (int i = 0; i < trunkHeight; i++) {
            printingSpace(treeCenter);
            System.out.println("*");
        }
    }

    private static void pause() {
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < 3000) {
        }
    }

    private static void merryChristmasSong() {
        System.out.printf("%n");
        System.out.println("I wish you a Merry Christmas");
        pause();
        System.out.println("I wish you a Merry Christmas");
        pause();
        System.out.println("I wish you a Merry Christmas and Happy New Year");
        pause();
        System.out.printf("%n");
    }
}
