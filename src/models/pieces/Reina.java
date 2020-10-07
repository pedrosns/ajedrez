package models.pieces;
import models.Piece;

public class Reina extends Piece {

    public Reina(int row, int colum){
        super(row, colum);
        
    }

    @Override
    public String toString() {
        return ("[Q]");
    }
    
}
