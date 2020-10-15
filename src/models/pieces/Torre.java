package models.pieces;

import exceptions.GameException;
import models.Piece;
import models.Position;

public class Torre extends Piece{

    public Torre(int row, int colum,int user){
        super(row,colum,user);
    }

    @Override
    public String toString() {
        return ("[T]");
    } 

    @Override
    public Boolean canMove(Position destination) throws GameException  {
        if ((this.position.row==destination.row && this.position.col!=destination.col) ||(this.position.row!=destination.row && this.position.col==destination.col)){
        return super.canMove(destination);
        }else{
            throw new GameException("La torre no puede realizar este movimiento");
        }
        
    }
    
}
