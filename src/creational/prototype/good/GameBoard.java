package creational.prototype.good;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard>{
    List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece gamePiece) {
        pieces.add(gamePiece);
    }

    public List<GamePiece> getPieces() {
        return this.pieces;
    }

    public void getBoardState() {
        System.out.println("the state"+pieces.toString());
    }

    @Override
    public GameBoard clone() {
        GameBoard copyGameBoard=new GameBoard();
        for(GamePiece gamePiece:this.pieces){
            copyGameBoard.addPiece(gamePiece.clone());
        }
        return copyGameBoard;
    }
}
