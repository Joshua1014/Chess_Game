import java.util.Scanner;

public class Chess {
    public static void main(String[] args){
        Scanner user_input = new Scanner (System.in);
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.printBoard();
        System.out.println("Piece to move: ");
        String charString = user_input.nextLine();
        chessBoard.movePiece(charString, 2, 5, chessBoard.board);
        chessBoard.printBoard();
        user_input.close();
    }
}
