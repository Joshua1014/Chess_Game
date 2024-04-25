package Pieces_Module;
public abstract class Piece {
    protected int x;
    protected int y;
    protected boolean isWhite;

    //Default constructor for Piece class
    public Piece(int x, int y, boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    public boolean validMove(int destX, int destY, Piece[][] board) {

        //Checks move is within bounds of the board
        if (destX < 0 || destX >= board.length || destY < 0 || destY >= board[0].length) {
            return false;
        }

        //Checks if the destination square is occupied
        Piece occupyingPiece = board[destX][destY];
        if(occupyingPiece != null) {

            //Checks if the occupying piece is of the same colour
            if (occupyingPiece.isWhite == this.isWhite) {
                //Cannot move to square occupied by own piece
                return false;
            }
        }

        //It's a valid move
        return true;
    }

    // Abstract method for specific movement rules
    public abstract boolean canMove(int destX, int destY, Piece[][] board);
}
