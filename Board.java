
import java.util.*;
class Board {
    
    private ArrayList<String> board = new ArrayList<String>();
    private int [][] win = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    
    
    public void setUpBoard(boolean firstGame) {
        if (!firstGame) {
            for (int i = 0; i < 9; i++) {
                board.set(i, " ");
            }
        }
        else {
            for (int i = 0; i < 9; i++) {
                this.board.add(" ");
            }
        }
    }
    
    public static void printBoard(){
        System.out.println("         |          |           ");
        System.out.println("    "+board.get(0)+"    |   "+board.get(1)+"      |    "+board.get(2)+"       ");
        System.out.println("--------------------------------");
        System.out.println("         |          |           ");
        System.out.println("    "+board.get(3)+"    |   "+board.get(4)+"      |    "+board.get(5)+"       ");
        System.out.println("--------------------------------");
        System.out.println("    "+board.get(6)+"    |   "+board.get(7)+"      |    "+board.get(8)+"       ");
        System.out.println("         |          |           ");
    }
    
    
    public static void placeMove(){
        board.set(loc, player);
    }
    
    public static void checkWinner(){
        for (int i = 0; i< win.length;i++){
            System.out.println(board.get(win[i][0]) +" " +board.get(win[i][1]) +" " +board.get(win[i][2]) +" ");
            if (board.get(win[i][0]).equals(player) && board.get(win[i][1]).equals(player) && board.get(win[i][2]).equals(player))     {
                
                winner = true;
                quit = true;
                System.out.println("Winner");
        }
        
    public static void checkMove(){
        if (board.get(loc).equals(" ")){
            placeMove();
        }
        else {
            getMove();
        }
    }

            
            
            
            
            
            
            
        }
