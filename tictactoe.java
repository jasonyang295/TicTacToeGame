import java.util.*;

class TicTacToe {
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
        } else {
            symbol = '0';
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
}