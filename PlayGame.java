
import java.io.*;
import java.util.*;

class PlayGame {
    private String player = "X";
    boolean quit = false;
    boolean startNew = true;
    boolean firstGame = true;
    int start;
    boolean winner = false;
    
    
    public String getPlayer(){
        return player;
    }
    public static void getMove(){
        System.out.print("Enter a location 1-9:  ");
        loc = scan.nextInt() - 1;
        checkMove();
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

}