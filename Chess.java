import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.printBoard();
        int count = 0;
        while (count < 100) {
            System.out.println("Piece to move: ");
            String charString = user_input.nextLine();
            System.out.println("Destination X 0-7: ");
            int destX = user_input.nextInt();
            System.out.println("Destination Y 0-7: ");
            int destY = user_input.nextInt();
            user_input.nextLine();
            chessBoard.movePiece(charString, destX, destY, chessBoard.board);
            chessBoard.printBoard();
            count++;
        }

        user_input.close();
    }
}
