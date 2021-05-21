class TicTacToe {
    public static void main(String[] args) {
        char[][] gameboard = {{' ', '|', ' ', '|', ' '}, 
        {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, 
        {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
        printgameboard(gameboard);
    }
    public static void printgameboard(char[][] gameboard) {

        for(char[] row : gameboard) {
            for(char c: row) {
                System.out.println(c);
            }
            System.out.println();
        }
        //comment to make sure stuff is working
    }
}