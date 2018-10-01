package javaapplication1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class JavaApplication1 {

    static String[][] ticTacToe = new String[3][3];
    static Scanner playerX = new Scanner(System.in);
<<<<<<< HEAD
    static boolean winner = false;
=======
>>>>>>> 8a37fc57f8cbd2f68a16f40da6e47988db8a724a
    static int playerXRow;
    static int playerXColomn;
    static Scanner playerO = new Scanner(System.in);
    static int playerORow;
    static int playerOColomn;
<<<<<<< HEAD
=======
    static boolean winner = false;
    static boolean isFull = false;
>>>>>>> 8a37fc57f8cbd2f68a16f40da6e47988db8a724a

    public static void initBoard() {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                ticTacToe[i][j] = " ";
            }
        }
    }

<<<<<<< HEAD
    public static boolean checkWinner(String[][] winner) {
        if(winner[0][0] == "x" && winner[0][1] == "x" && winner[0][2] == "x"){
            return true;
        }
        return false;
=======
    public static boolean isBoardFull() {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                if (ticTacToe[i][j] == " ") {
                    return isFull = false;
                }
            }
        }
        return isFull = true;
>>>>>>> 8a37fc57f8cbd2f68a16f40da6e47988db8a724a
    }

    public static void displayBoard() {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                if (j == 0) {
                    System.out.println("-------------");
                    System.out.println("| " + ticTacToe[i][0] + " | " + ticTacToe[i][1] + " | " + ticTacToe[i][2] + " |");
                }
            }
        }
        System.out.println("-------------");
    }

<<<<<<< HEAD
        initBoard();
        

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
            if (checkWinner(ticTacToe)) {
                System.out.print("Player X, please enter a row (0, 1 or 2): ");
                playerXRow = playerX.nextInt();
                System.out.print("Player X, please enter a column (0, 1 or 2):");
                playerXColomn = playerX.nextInt();
                ticTacToe[playerXRow][playerXColomn] = "X";
            } else {
                System.out.print("Player O, please enter a row (0, 1 or 2): ");
                playerORow = playerO.nextInt();
                System.out.print("Player O, please enter a column (0, 1 or 2):");
                playerOColomn = playerO.nextInt();
                ticTacToe[playerORow][playerOColomn] = "O";

            }
//          
=======
    public static boolean checkWinner(String[][] board) {
        if (board[2][0] == "X" && board[1][0] == "X" && board[0][0] == "X"
                || board[2][1] == "X" && board[1][1] == "X" && board[0][1] == "X"
                || board[2][2] == "X" && board[1][2] == "X" && board[0][2] == "X"
                || board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X"
                || board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X"
                || board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X"
                || board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X"
                || board[2][0] == "X" && board[1][1] == "X" && board[0][2] == "X") {
            displayBoard();
            System.out.println("Player X has won");
            return winner = true;
        } else if (board[2][0] == "O" && board[1][0] == "O" && board[0][0] == "O"
                || board[2][1] == "O" && board[1][1] == "O" && board[0][1] == "O"
                || board[2][2] == "O" && board[1][2] == "O" && board[0][2] == "O"
                || board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O"
                || board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O"
                || board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O"
                || board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O"
                || board[2][0] == "O" && board[1][1] == "O" && board[0][2] == "O") {
            displayBoard();
            System.out.println("Player O has won");
            return winner = true;
        }
        return false;
    }

    public static void playGame() {
        winner = false;
        if (isBoardFull() != true) {
            do {
                displayBoard();
                try {
                    System.out.print("Player X, please enter a row (0, 1 or 2): ");
                    playerXRow = playerO.nextInt();
                } catch (InputMismatchException e) {
                    System.out.print("Player X, please re-enter a row (0, 1 or 2): ");
                    playerO.nextLine();
                    playerXRow = playerO.nextInt();
                }
                try {
                    System.out.print("Player X, please enter a column (0, 1 or 2): ");
                    playerXColomn = playerO.nextInt();

                } catch (InputMismatchException exception) {
                    System.out.print("Player X, please re-enter a column (0, 1 or 2): ");
                    playerO.nextLine();
                    playerXColomn = playerO.nextInt();
                }

                ticTacToe[playerXRow][playerXColomn] = "X";
                if (checkWinner(ticTacToe)) {
                    break;
                }
                displayBoard();
                try {
                    System.out.print("Player O, please enter a row (0, 1 or 2): ");
                    playerORow = playerO.nextInt();
                } catch (InputMismatchException exception) {
                    System.out.print("Player O, please re-enter a row (0, 1 or 2): ");
                    playerX.nextLine();
                    playerORow = playerO.nextInt();
                }

                try {
                    System.out.print("Player O, please enter a column (0, 1 or 2): ");
                    playerOColomn = playerO.nextInt();
                } catch (InputMismatchException exception) {
                    System.out.print("Player O, please re-enter a column (0, 1 or 2): ");
                    playerX.nextLine();
                    playerOColomn = playerO.nextInt();
                }

                ticTacToe[playerORow][playerOColomn] = "O";
                if (checkWinner(ticTacToe)) {
                    break;
                }
            } while (winner != true);
        }
    }

    public static void main(String[] args) {
        initBoard();

        if (isBoardFull() && winner == false) {
           initBoard();
           playGame();
        } else if(isBoardFull() != true)
            playGame();
>>>>>>> 8a37fc57f8cbd2f68a16f40da6e47988db8a724a
        }
    }


// public boolean isFull() {
//        return numMoves == 9;
//    }
