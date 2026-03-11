package creational.prototype.bad;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("red", 1));
        gameBoard.addPiece(new GamePiece("oragne", 2));
        gameBoard.addPiece(new GamePiece("yellow", 3));
        gameBoard.addPiece(new GamePiece("green", 4));

        gameBoard.getBoardState();


        GameBoard copyGameBoard = new GameBoard();
        List<GamePiece> gamePieces = gameBoard.getPieces();
        for (GamePiece gamePiece : gamePieces) {
            copyGameBoard.addPiece(gamePiece);
        }
        gameBoard.getBoardState();
    }
}
