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
    public static void playGame(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Column");
        int column = userInput.nextLine;
        System.out.println("Enter Row");
        int row = userInput.nextLine;
        row = row -1;
        column = column -1;
    }

    public static void update(int column, int row) {
    gameBoard[column][row] = 'X';
        Random rand = new Random();
        while(gameboard[random.randint(0, 2)][random.randint(0,2 ) ] == "X" )  {

        }
    public static void main(String[] args) {

        System.out.println("\n\n*****TIC-TAC-TOE*****");
        String[][] gameBoard = {{" ", " ", " "},
                                {" ", " ", " "}, {" ", " ", " "}};
        showBoard(gameBoard);
    }
}

    public static void main(String[] args) {

    }