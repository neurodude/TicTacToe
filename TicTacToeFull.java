import java.util.*;
class TicTacToeFull {
    
    
    
    static Scanner scan = new Scanner(System.in);
    static Board board = new Board();
    static PlayGame game = new PlayGame();
    
    
    
    
    public static void main(String[] args) {
        while (!quit) {
            if (startNew) {
                board.setUpBoard(false);
                startNew = false;
            }
            board.printBoard();
            game.getMove();
            board.checkWinner();
            game.changePlayer();
            if (winner == true) {
                game.checkNewGame();
            }
        }
    }
}

