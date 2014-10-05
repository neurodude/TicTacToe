import java.util.*;
class TicTacToe {

    static ArrayList<String> board = new ArrayList<String>();
    static Scanner scan = new Scanner(System.in);
    static int loc;
    
    static String player = "X";

    static boolean quit = false;
    static boolean startNew = true;
    static int start;
    static boolean winner = false;
    static int [][] win = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};  
    

    public static void main(String[] args){
        while (quit == false){
            if(startNew == true){
                setUpBoard();
                startNew = false;
            }
       
            printBoard();
            getMove();
            checkWinner();
            changePlayer();

            if (winner == true){
                checkNewGame();
        }
    }
    }
    
    public static void setUpBoard(){
       if (board.size()>=9){
        for (int i = 0; i<9;i++){
            board.set(i," ");
            }
       } 
       else {
            for (int i = 0; i<9;i++){
                board.add(" ");
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
    public static void getMove(){
        System.out.print("Enter a location 1-9:  ");
        loc = scan.nextInt() - 1;
        checkMove();
    }
    
    public static void checkMove(){
        if (board.get(loc).equals(" ")){
            placeMove();
        }
        else {
            getMove();
        }
    }
    
    public static void placeMove(){
        board.set(loc, player);
    }
    
    public static void changePlayer(){
        if (player.equals("X")){
            player = "O";

        }
        else if (player.equals("O")){
            player = "X";

        }
    }
    public static void checkNewGame(){
        System.out.println("Do you want to start a new game: (11 = Yes, 12 = No)");
        start = scan.nextInt();
        if ((start != 11) && (start != 12)){
            checkNewGame();
        }
        else if (start == 11){
            quit = false;
            startNew = true;
        }
        else if (start == 12){
            quit = true;
        }
            
    }
    public static void checkWinner(){
            for (int i = 0; i< win.length;i++){
                System.out.println(board.get(win[i][0]) +" " +board.get(win[i][1]) +" " +board.get(win[i][2]) +" ");
                if (board.get(win[i][0]).equals(player) && board.get(win[i][1]).equals(player) && board.get(win[i][2]).equals(player))     {
                    
                    winner = true;
                    quit = true;
                    System.out.println("Winner");
            }
    
        
    }
    }
    
}
    
