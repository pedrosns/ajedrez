package models.pieces;
import models.Piece;

public class Alfil extends Piece{

    public Alfil(int row, int colum){
        super(row, colum);
    }

    @Override
    public String toString() {    
        return ("[A]");
    }
}
