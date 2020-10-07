package models.pieces;
import models.Piece;

public class Torre extends Piece{

    public Torre(int row, int colum){
        super(row, colum);
    }

    @Override
    public String toString() {
        return ("[T]");
    }
    
}
