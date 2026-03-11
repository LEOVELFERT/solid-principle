package creational.prototype.good;



public class Client {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("red", 1));
        gameBoard.addPiece(new GamePiece("oragne", 2));
        gameBoard.addPiece(new GamePiece("yellow", 3));
        gameBoard.addPiece(new GamePiece("green", 4));

        gameBoard.getBoardState();
        GameBoard cloneGamboard = gameBoard.clone();
        gameBoard.getBoardState();
    }
}
