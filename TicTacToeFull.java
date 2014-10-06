import java.util.*;
class TicTacToeFull {
    
    
    
    static Scanner scan = new Scanner(System.in);
    static Board board = new Board();
    static PlayGame game = new PlayGame();
    
    
    
    
    public static void main(String[] args) {
        int move;
        boolean place;
        boolean winner;
        boolean quit = false;
        boolean firstGame = true;
        boolean startNew = true;
        String player = game.getPlayer();
        
        
        while (!quit) {
            if (startNew) {
                board.setUpBoard(firstGame);
                firstGame = false;
                startNew = false;
            }
            
            board.printBoard();
            
            move = game.getMove();  //Get User Move
            while (!board.placeMove(move, game.getPlayer())){
                move = game.getMove();
            }
            
            winner = board.checkWinner(game.getPlayer());
            
            if (winner) {
                board.printBoard();
                quit = game.checkNewGame();
            }
            else {
                player = game.changePlayer();
            }
        }
    }
}

