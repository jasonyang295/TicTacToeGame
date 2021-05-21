import java.util.*;
import java.util.Arrays;
import java.util.List;

class TicTacToe {

    static ArrayList<Integer> playerpositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpupositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        char[][] gameboard = {{' ', '|', ' ', '|', ' '}, 
        {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, 
        {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
        printgameboard(gameboard);

        

        while (true) {
            Scanner scaninput = new Scanner(System.in);
            System.out.println("Enter your placement (1-9):");
            int playerpos = scaninput.nextInt();
            System.out.println(playerpos);
        
            placePiece(gameboard, "player", playerpos);
        

            Random rand = new Random();
            int cpuPosition = rand.nextInt(9) + 1; //establishes almost AI feeling
            placePiece(gameboard, "cpu", cpuPosition);


            printgameboard(gameboard);

            String result = checkwin();
            System.out.println(result);
        }
        
        //scaninput.close();
    }
    public static void printgameboard(char[][] gameboard) {

        for(char[] row : gameboard) {
            for(char c: row) {
                System.out.print(c);
            }
            System.out.println();
        }
        //comment to make sure stuff is working
    }
    public static void placePiece(char[][] gameboard, String user, int pos) {
        
        char symbol = 'X';

        if (user.equals("player")) {
            symbol = 'X';
            playerpositions.add(pos);
        } else {
            symbol = '0';
            cpupositions.add(pos);
        }
        
        switch(pos) {
            case 1: 
                gameboard[0][0] = symbol ;
                break;
            case 2: 
                gameboard[0][2] = symbol ;
                break;
            case 3: 
                gameboard[0][4] = symbol ;
                break;
            case 4: 
                gameboard[2][0] = symbol ;
                break;
            case 5: 
                gameboard[2][2] = symbol ;
                break;
            case 6: 
                gameboard[2][4] = symbol ;
                break;
            case 7: 
                gameboard[4][0] = symbol ;
                break;
            case 8: 
                gameboard[4][2] = symbol ;
                break;
            case 9: 
                gameboard[4][4] = symbol ;
                break;
            default:
                break;
        }
    }

    public static String checkwin() {
        List toprow = Arrays.asList(1,2,3);
        List midrow = Arrays.asList(4,5,6);
        List botrow = Arrays.asList(7,8,9);
        List leftcol = Arrays.asList(1,4,7);
        List midcol = Arrays.asList(2,5,8);
        List rightcol = Arrays.asList(3,6,9);
        List leftdiag = Arrays.asList(1,5,9);
        List rightdiag = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<List>();
        winning.add(toprow);
        winning.add(midrow);
        winning.add(botrow);
        winning.add(leftcol);
        winning.add(midcol);
        winning.add(rightcol);
        winning.add(leftdiag);
        winning.add(rightdiag);

        for (List l: winning) {
            if (playerpositions.containsAll(l)) {
                return "Congrats you won!";
            }
            else if (cpupositions.containsAll(l)) {
                return "Sorry, you lost!";
            } else if (playerpositions.size() + cpupositions.size() == 9) {
                return "tie";
            }
        }
        return "";
    }
}