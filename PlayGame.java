
import java.io.*;
import java.util.*;

class PlayGame {
    private String player = "X";
    boolean quit = false;
    boolean startNew = true;
    boolean firstGame = true;
    int start;
    boolean winner = false;
    Scanner scan = new Scanner(System.in);
    
    
    public String getPlayer(){
        return player;
    }
    public int getMove(){
        System.out.print("Enter a location 1-9:  ");
        int loc = scan.nextInt() - 1;
        return loc;
    }
    
    public String changePlayer(){
        if (player.equals("X")){
            player = "O";

        }
        else if (player.equals("O")){
            player = "X";

        }
        return player;
    }
    public boolean checkNewGame(){
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
        return quit;   
    }

}