package tictactoe;

// Importing java packages required to run the program 
import java.util.Scanner;
import java.util.InputMismatchException;

//  Declaring the TicTacToe Class
public class TicTacToe {

//  Delcaring variables required to run the program  
    static String[][] ticTacToe = new String[3][3];
    static Scanner playerX = new Scanner(System.in);
    static int playerXRow;
    static int playerXColomn;
    static Scanner playerO = new Scanner(System.in);
    static int playerORow;
    static int playerOColomn;
    static boolean winner = false;
    static int numMoves = 0;

//  This method will initialize the board  
    public static void initBoard() {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                ticTacToe[i][j] = " ";
            }
        }
    }

//  This method will check to see if the board is full. 
    public static boolean isBoardFull() {
        boolean isFull = true;
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                if (ticTacToe[i][j].equals(" ")) {
                    return isFull = false;
                } else {
                }
            }
        }
        return isFull;
    }

//  This method will display the board will all the tokens already on. 
    public static void displayBoard() {
        System.out.println("");
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                if (j == 0) {
                    System.out.println("-------------");
                    System.out.println("| " + ticTacToe[i][0] + " | " + ticTacToe[i][1] + " | " + ticTacToe[i][2] + " |");
                }
            }
        }
        System.out.println("-------------");
        System.out.println("");
    }

//  This method will check if their is a winner either Player X or Player O.
    public static boolean checkWinner(String[][] board) {
        if (board[2][0] == "X" && board[1][0] == "X" && board[0][0] == "X"
//  Checking all the combinations to see if Player X won the game              
                || board[2][1] == "X" && board[1][1] == "X" && board[0][1] == "X"
                || board[2][2] == "X" && board[1][2] == "X" && board[0][2] == "X"
                || board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X"
                || board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X"
                || board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X"
                || board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X"
                || board[2][0] == "X" && board[1][1] == "X" && board[0][2] == "X") {
            displayBoard();
            System.out.println("Player X has won!");
            return winner = true;
//  Checking all the combinations to see if Player O won the game
        } else if (board[2][0] == "O" && board[1][0] == "O" && board[0][0] == "O"
                || board[2][1] == "O" && board[1][1] == "O" && board[0][1] == "O"
                || board[2][2] == "O" && board[1][2] == "O" && board[0][2] == "O"
                || board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O"
                || board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O"
                || board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O"
                || board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O"
                || board[2][0] == "O" && board[1][1] == "O" && board[0][2] == "O") {
            displayBoard();
            System.out.println("Player O has won!");
            return winner = true;
        }
        return false;
    }

//  This method initiate the game for the players to play  
    public static void playGame() {
        initBoard();
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
            numMoves++;
            if (checkWinner(ticTacToe)) {
                break;
            }
            if (isBoardFull()) {
                displayBoard();
                System.out.println("Sorry this game was a Draw");
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
            numMoves++;
            if (checkWinner(ticTacToe)) {
                break;
            }
            if (isBoardFull()) {
                displayBoard();
                System.out.println("Sorry this game was a Draw");
                break;
            }

        } while (winner
                != true && isBoardFull()
                != true);
    }
    
// Delcaring the main method
    public static void main(String[] args) {
        playGame();
    }
}
