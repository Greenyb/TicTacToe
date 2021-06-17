import java.util.StringJoiner;
import java.util.Scanner;

public class Main {

    public static void showBoard(String[][] gameBoard){

        for(int i = 0; i < 3; i++){
            System.out.println(String.join("|", gameBoard[i]));
            if(i < 2){
                System.out.println("-+-+-");
            }
        }
    }
    public static void playGame(String[][]  gameBoard) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Column");
        String column = userInput.nextLine();
        System.out.println("Enter Row");
        String row = userInput.nextLine();
        gameBoard[Integer.parseInt(column) - 1][Integer.parseInt(row) - 1] = "X";

    }

    public static void main(String[] args) {

        System.out.println("\n\n*****TIC-TAC-TOE*****");
        String[][] gameBoard = {{" ", " ", " "},
                                {" ", " ", " "}, {" ", " ", " "}};
        showBoard(gameBoard);
        playGame(gameBoard);
        System.out.println(gameBoard);
    }
}
