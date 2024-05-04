import Pieces_Module.*;

public class ChessBoard {
    /*
     * Creates a 2D array of Piece objects, this we
     * represent the board and allow Piece objects to
     * be placed within it
     */
    public Piece[][] board;

    // Constructor
    public ChessBoard() {
        // Creates a 8x8 2D array of Piece objects
        this.board = new Piece[9][9];
        placePieces();
    }

    private void placePieces() {
        // Placing pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(1, i, false); // Black pawns
            board[6][i] = new Pawn(6, i, true); // White pawns
        }

        // Placing rooks
        board[0][0] = new Rook(0, 0, false, "r1"); // Black Rook
        board[0][7] = new Rook(0, 7, false, "r2"); // Black Rook
        board[7][0] = new Rook(7, 0, true, "R1"); // White Rook
        board[7][7] = new Rook(7, 7, true, "R2"); // White Rook

        // Placing knights
        board[0][1] = new Pieces_Module.Knight(0, 1, false, "n1");
        board[0][6] = new Pieces_Module.Knight(0, 6, false, "n2");
        board[7][1] = new Pieces_Module.Knight(7, 1, true, "N1");
        board[7][6] = new Pieces_Module.Knight(7, 6, true, "N2");

        // Placing bishops
        board[0][2] = new Pieces_Module.Bishop(0, 2, false, "b1");
        board[0][5] = new Pieces_Module.Bishop(0, 5, false, "b2");
        board[7][2] = new Pieces_Module.Bishop(7, 2, true, "B1");
        board[7][5] = new Pieces_Module.Bishop(7, 5, true, "B2");

        // Placing queens
        board[0][3] = new Pieces_Module.Queen(0, 3, false, "q");
        board[7][3] = new Pieces_Module.Queen(7, 3, true, "Q");

        // Placing kings
        board[0][4] = new Pieces_Module.King(0, 4, false, "k");
        board[7][4] = new Pieces_Module.King(7, 4, true, "K");
    }

    // Prints out the board to the console
    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    public void movePiece(String piece, int destX, int destY, Piece[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    if (piece.equals(board[i][j].getSymbol())) {
                        if (board[i][j].canMove(destX, destY, board)) {
                            board[destX][destY] = board[i][j];
                            board[i][j] = null;
                            break;
                        } else {
                            System.out.print("This is not a valid move");
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            System.out.println();
        }
    }
}
