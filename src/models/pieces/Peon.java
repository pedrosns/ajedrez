package models.pieces;
import exceptions.GameException;
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
    public Boolean canMove(Position destination) throws GameException {
        if (destination.row < this.position.row || destination.col < this.position.col) {
            throw new GameException("El peon no puede realizar este movimiento");
        }
        return super.canMove(destination);
    }

}
