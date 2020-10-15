package models.pieces;

import exceptions.GameException;
import models.Piece;
import models.Position;

public class Reina extends Piece {

    public Reina(int row, int colum, int user) {
        super(row, colum, user);
    }

    @Override
    public String toString() {
        return ("[Q]");
    }

    @Override
    public Boolean canMove(Position destination) throws GameException {
        if ((destination.row < 8 && destination.col < 8)
                && ((((destination.row - position.row) == (destination.col - position.col)))
                || ((this.position.row == destination.row && this.position.col != destination.col)
                        || (this.position.row != destination.row && this.position.col == destination.col)))) {
            return super.canMove(position);
        } else {
            throw new GameException("La Reina no puede realizar este movimiento");
        }

    }

}
