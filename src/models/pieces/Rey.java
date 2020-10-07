package models.pieces;
import models.Piece;


public class Rey extends Piece {
    public Rey(int row, int colum){
        super(row, colum);
    }

    @Override
    public String toString() {
        return ("[K]");
    }
}
