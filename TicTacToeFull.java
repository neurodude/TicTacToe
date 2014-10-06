import java.util.*;
class TicTacToeFull {
    
    
    
    static Scanner scan = new Scanner(System.in);
    static Board board = new Board();
    static PlayGame game = new PlayGame();
    
    
    
    
    public static void main(String[] args) {
        int move;
        boolean place;
        boolean winner;
        while (!quit) {
            if (startNew) {
                board.setUpBoard(false);
                startNew = false;
            }
            
            board.printBoard();
            
            move = game.getMove();  //Get User Move
            while (!board.placeMove(move, game.getPlayer())){
                move = game.getMove();
            }
            
            boolean winner = board.checkWinner();
            
            if (winner) {
                game.checkNewGame();
            }
            else {
                game.changePlayer();
            }
        }
    }
}

