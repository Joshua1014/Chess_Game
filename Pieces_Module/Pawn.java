package Pieces_Module;

public class Pawn extends Piece {
    public Pawn(int x, int y, boolean isWhite, String name) {
        super(x, y, isWhite, name);
    }

    @Override
    public boolean canMove(int destX, int destY, Piece[][] board) {
        int forwardDirection = isWhite ? -1 : 1; // Determines the direction the pawn moves; 1 for white (up), -1 for black (down)
        int startRow = isWhite ? 6 : 1;  // Starting row depends on the color

        // Simple one square forward move
        if (destX == x + forwardDirection && destY == y && board[destX][destY] == null) {
            return true;
        }

        // Initial two-square forward move
        if (x == startRow && destX == x + 2 * forwardDirection && destY == y &&
            board[x + forwardDirection][y] == null && board[destX][destY] == null) {
            return true;
        }

        // Diagonal capture
        if (destX == x + forwardDirection && (destY == y + 1 || destY == y - 1) &&
            board[destX][destY] != null && board[destX][destY].isWhite != this.isWhite) {
            return true;
        }

        // Optionally, implement 'en passant' capture logic here
        
        return false;
    }

    @Override
    public String getSymbol() {
        return name;
    }
}
