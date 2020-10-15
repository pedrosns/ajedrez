package models.pieces;

import exceptions.GameException;
import models.Piece;
import models.Position;

public class Rey extends Piece {
    public Rey(int row, int colum, int user) {
        super(row, colum, user);
    }

    @Override
    public String toString() {
        return ("[K]");
    }

    @Override
    public Boolean canMove(Position destination) throws GameException  {
        if ((destination.row < 8 && destination.col < 8)
                && ((position.row == destination.row - 1) || (position.row == destination.row + 1)
                        || (position.col == destination.col - 1) || (position.col == destination.col + 1))) {
                            return super.canMove(position);

        } else {
            throw new GameException("El Rey no puede realizar este movimiento");
        }
        
    }
}
