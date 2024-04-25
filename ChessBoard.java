public class ChessBoard {
    // This represents the chess board
    private String[][] board = new String[8][8];

    //Constructor
    public ChessBoard() {
        //Initialize empty spaces
        for(int i = 2; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                board[i][j] = ".";
            }
        }

        //Black pieces
        board[0] = new String[]{"br", "bn", "bb", "bq", "bk", "bb", "bn", "br"};
        board[1] = new String[]{"bp", "bp", "bp", "bp", "bp", "bp", "bp", "bp"};

        //White pieces
        board[6] = new String[]{"wp", "wp", "wp", "wp", "wp", "wp", "wp", "wp"};
        board[7] = new String[]{"wr", "wn", "wb", "wq", "wk", "wb", "wn", "wr"};
    }

    //Prints out the board to the console
    public void printBoard() {
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.println(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
