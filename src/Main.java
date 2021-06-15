import java.util.StringJoiner;

public class Main {

    public static void showBoard(String[][] gameBoard){
        for(int i = 0; i < 3; i++){
            System.out.println(String.join("|", gameBoard[i]));
            if(i < 2){
                System.out.println("-+-+-");
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("\n\n*****TIC-TAC-TOE*****");
        String[][] gameBoard = {{" ", " ", " "},
                                {" ", " ", " "}, {" ", " ", " "}};
        showBoard(gameBoard);


    }
}
