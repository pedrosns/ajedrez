package models.pieces;
import models.Piece;

public class Peon extends Piece{
    public Peon(int row, int colum){
        super(row, colum);
    }
    
    @Override
    public String toString() {
        return ("[P]");
    }

}
