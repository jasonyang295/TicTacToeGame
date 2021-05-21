import java.util.*;

class TicTacToe {
    public static void main(String[] args) {
        char[][] gameboard = {{' ', '|', ' ', '|', ' '}, 
        {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, 
        {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
        printgameboard(gameboard);

        Scanner scaninput = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scaninput.nextInt();
        System.out.println(pos);


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
}