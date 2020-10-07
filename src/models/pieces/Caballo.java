package models.pieces;
import models.Piece;

public class Caballo extends Piece {
    
    public Caballo(int row, int colum){
        super(row, colum);
    }

    @Override
    public String toString() {
        return ("[C]");
    }
}
