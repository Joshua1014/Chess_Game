package Pieces_Module;

public class King extends Piece {
    public King(int x, int y, boolean isWhite){
        super(x, y, isWhite);
    }

    @Override
    public boolean canMove(int destX, int destY, Piece[][] board) {
        if (!validMove(destX, destY, board)) {
            return false;
        }

        //King specific movement validation
        int xDiff = Math.abs(destX - x);
        int yDiff = Math.abs(destY - y);

        //Check if the King moves only one square in any direction
        return xDiff <= 1 && yDiff <= 1;
    }

    @Override
    public String getSymbol() {
        return isWhite ? "K" : "k"; // Example for the Queen
    }
}
