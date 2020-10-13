package models.pieces;
import models.Piece;
import models.Position;

public class Alfil extends Piece{

    public Alfil(int row, int colum,int user){
        super(row,colum,user);
    }

    @Override
    public String toString() {    
        return ("[A]");
    }
    @Override
    public Boolean canMove(Position destination) {
        if (((destination.row-position.row) == (destination.col-position.col))){
            
            return  super.canMove(destination);
        }else{
            return false;
        }
        
    }
}
