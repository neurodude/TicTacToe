import java.util.*;
class Board {

    private ArrayList < String > board = new ArrayList < String > ();
    private int[][] win = {
        {
            0, 1, 2
        }, {
            3, 4, 5
        }, {
            6, 7, 8
        }, {
            0, 3, 6
        }, {
            1, 4, 7
        }, {
            2, 5, 8
        }, {
            0, 4, 8
        }, {
            2, 4, 6
        }
    };

    public Board() {
        setUpBoard(true);
    }
    public Board(Integer tempBoard) {
        boardTranslate(tempBoard);
    }

    public void setUpBoard(boolean firstGame) {
        if (firstGame) {
            for (int i = 0; i < 9; i++) {
                this.board.add(" ");
            }

        }
        else {
            if (board.size() == 9) {
                for (int i = 0; i < 9; i++) {
                    this.board.set(i, " ");
                }
            }
        }

    }


    public void printBoard() {
        System.out.println("         |          |           ");
        System.out.println("    " + board.get(0) + "    |   " + board.get(1) + "      |    " + board.get(2) + "       ");
        System.out.println("--------------------------------");
        System.out.println("         |          |           ");
        System.out.println("    " + board.get(3) + "    |   " + board.get(4) + "      |    " + board.get(5) + "       ");
        System.out.println("--------------------------------");
        System.out.println("    " + board.get(6) + "    |   " + board.get(7) + "      |    " + board.get(8) + "       ");
        System.out.println("         |          |           ");
    }


    public boolean placeMove(int loc, String player) {
        if (checkMove(loc)) {
            board.set(loc, player);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkWinner(String player) {
        boolean winner = false;
        for (int i = 0; i < win.length; i++) {
            if (board.get(win[i][0]).equals(player) && board.get(win[i][1]).equals(player) && board.get(win[i][2]).equals(player)) {

                winner = true;
            }
        }
        return winner;
    }

    private void boardTranslate(Integer boardSetup) {
        String tempBoard = boardSetup.toString();
        for (int i = 0; i < tempBoard.length(); i++) {
            if (tempBoard.substring(i,i+1).equals("0")) {
                board.set(i, " ");
            }
            else if (tempBoard.substring(i,i+1).equals("1")) {
                board.set(i, "X");
            }
            else if (tempBoard.substring(i,i+1).equals("2")) {
                board.set(i, "O");
            }
            else {
                System.out.print("Board is wrong");
            }

        }
    }

    public boolean checkMove(int loc) {
        if (board.get(loc).equals(" ")) {
            return true;
        }
        else {
            return false;
        }

    }








}
