import java.util.*;


public class Main {

    static String[][] gameBoard = {{" ", " ", " "},
            {" ", " ", " "}, {" ", " ", " "}};
    static Scanner userInput = new Scanner(System.in);
    static Random random = new Random();
    static Map<String, Integer> xs = new HashMap<>();
    static Map<String, Integer> os = new HashMap<>();
    static String[] keys = { "v1", "v2", "v3", "h1","h2","h3", "d1", "d2"};

    public static void makeKeys(String[] keynames){
        for(int i = 0; i < keynames.length; i++){
            xs.put(keynames[i], 0);
            os.put(keynames[i], 0);
        }
    }

    public static void showBoard(String[][] gameBoard) {

        for (int i = 0; i < 3; i++) {
            System.out.println(String.join("|", gameBoard[i]));
            if (i < 2) {
                System.out.println("-+-+-");
            }
        }
    }
    public static void countingUp(int column, int row, boolean isX){
        Map<String,Integer> mapToUpdate = isX ? xs : os;

    }
    public static String playGame(String[][] gameBoard, String state) {
        String column;
        String row;
        do {
            System.out.println("Enter Column");
            column = userInput.nextLine();
            System.out.println("Enter Row");
            row = userInput.nextLine();
        }
        while(state.contains(column + row));
        gameBoard[Integer.parseInt(column) - 1][Integer.parseInt(row) - 1] = "X";
        int compColumn;
        int compRow;
        String square;
        do{
            compColumn = random.nextInt(2) + 1;
            compRow = random.nextInt(2) + 1;
            square = (compColumn) + String.valueOf(compRow);
            System.out.print("");
        }
        while(state.contains(square)
                || (Integer.parseInt(column) +Integer.parseInt(row)) == compColumn + compRow );
        gameBoard[compColumn - 1][compRow - 1] = "O";
        return column + row + " / " + compColumn + compRow + " / ";

    }

    public static void main(String[] args) {
        makeKeys(keys);

        System.out.println("\n\n*****TIC-TAC-TOE*****");
        String state = "";
        int i = 0;

        showBoard(gameBoard);
        while(true){
            state += playGame(gameBoard, state);
            System.out.println(state);
            showBoard(gameBoard);
        }

    }
}