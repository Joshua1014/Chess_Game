package Pieces_Module;

public class Knight extends Piece {

    public Knight(int x, int y, boolean isWhite, String name) {
        super(x, y, isWhite, name);
    }

    @Override
    public boolean canMove(int destX, int destY, Piece[][] board) {

        //Check for destination square occupation and within bounds of board
        if(!validMove(destX, destY, board)) {
            return false;
        }

        if(destX == x + 2 && destY == y + 1) {
            x = destX;
            y = destY;
            return true;
        }else if(destX == x + 2 && destY == y - 1) {
            x = destX;
            y = destY;
            return true;
        }else if(destX == x - 2 && destY == y + 1) {
            x = destX;
            y = destY;
            return true;
        }else if(destX == x - 2 && destY == y - 1) {
            x = destX;
            y = destY;
            return true;
        }else if(destX == x + 1 && destY == y + 2) {
            x = destX;
            y = destY;
            return true;
        }else if(destX == x + 1 && destY == y - 2) {
            x = destX;
            y = destY;
            return true;
        }else if(destX == x - 1 && destY == y + 2) {
            x = destX;
            y = destY;
            return true;
        }else if(destX == x - 1 && destY == y - 2) {
            x = destX;
            y = destY;
            return true;
        }else {
            return false;
        }

        // //A valid Knight move should always equate to 2
        // int xDiff = Math.abs(destX - x);
        // int yDiff = Math.abs(destY - y);
        // return xDiff * yDiff == 2;
    }

    @Override
    public String getSymbol() {
        return name;
    }
}
