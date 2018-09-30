package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    static String[][] ticTacToe = new String[3][3];
    Scanner playerX = new Scanner(System.in);
        static int playerXRow;
        static int playerXColomn;
        static Scanner playerO = new Scanner(System.in);
        static int playerORow;
        static int playerOColomn;

    public static void initBoard() {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                ticTacToe[i][j] = "  ";
            }
        }

    }

    public static void main(String[] args) {

        
        initBoard();
        boolean winner = false;

        while (winner != true) {
            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < ticTacToe.length; j++) {
                    if (j == 0) {
                        System.out.println("--------------");
                        System.out.println("| " + ticTacToe[i][0] + " | " + ticTacToe[i][1] + " | " + ticTacToe[i][2] + " |");
                    }

                }
            }
            System.out.println("--------------");
            System.out.print("Player X, please enter a row (0, 1 or 2): ");
            playerXRow = playerX.nextInt();
            System.out.println("Player X, please enter a column (0, 1 or 2): ");
            playerXColomn = playerX.nextInt();
            ticTacToe[playerXRow][playerXColomn] = "X";
        }
    }

}
