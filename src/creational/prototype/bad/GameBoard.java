package creational.prototype.bad;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece gamePiece) {
        pieces.add(gamePiece);
    }

    public List<GamePiece> getPieces() {
        return this.pieces;
    }

    public void getBoardState() {
//        for(GamePiece gamePiece:pieces){
//            System.out.println(gamePiece.toString());
//        }
        System.out.println("the state"+pieces.toString());
    }
}
