package models.pieces;
import models.Piece;

public class Caballo extends Piece {
    
    public Caballo(int row, int colum,int user){
        super(row,colum,user);
    }

    @Override
    public String toString() {
        return ("[C]");
    }
}
