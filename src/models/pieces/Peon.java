package models.pieces;
import models.Piece;
import models.Position;

public class Peon extends Piece{
    public Peon(int row, int colum,int user){
        super(row,colum,user);
    }
    
    @Override
    public String toString() {
        return ("[P]");
    }
    @Override
    public Boolean canMove(Position destination) {
        if (destination.row < this.position.row || destination.col < this.position.col) {
            return false;
            
        }

        return super.canMove(destination);
    }

}
