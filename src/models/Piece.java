package models;

import exceptions.GameException;

public class Piece {
    protected Position position;
    protected int user;

    public Piece(int row, int colum, int user) {
        this.position = new Position(row, colum);
        this.user = user;
    }

    public Piece(Position position, int user) {
        this.position = position;
        this.user = user;
    }

    public String toString() {
        return "[ ]";
    }

    // Valida el movimiento de la pieza
    public Boolean canMove(Position position) throws GameException {
        return true;
    }

    public void changePosition(Position destination) {
        this.position = destination;
    }
}
