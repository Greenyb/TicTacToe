import java.util.Random;
import java.util.StringJoiner;
import java.util.Scanner;

public class Main {

    static String[][] gameBoard = {{" ", " ", " "},
            {" ", " ", " "}, {" ", " ", " "}};

    public static void showBoard(String[][] gameBoard) {

        for (int i = 0; i < 3; i++) {
            System.out.println(String.join("|", gameBoard[i]));
            if (i < 2) {
                System.out.println("-+-+-");
            }
        }
    }

    public static void playGame(String[][] gameBoard) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Column");
        String column = userInput.nextLine();
        System.out.println("Enter Row");
        String row = userInput.nextLine();
        gameBoard[Integer.parseInt(column) - 1][Integer.parseInt(row) - 1] = "X";
        gameBoard[Integer.parseInt(column) - 1][Integer.parseInt(row) - 1] = "O";

    }

    public static void update(int column, int row) {
        gameBoard[column][row] = "X";
        Random random = new Random();
        gameBoard[random.nextInt(3)][random.nextInt(3)] = "X";
    }

    public static void main(String[] args) {
        System.out.println("\n\n*****TIC-TAC-TOE*****");

        showBoard(gameBoard);
        playGame(gameBoard);
        showBoard(gameBoard);
    }
}