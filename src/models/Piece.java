package models;

public class Piece {
    private int row;
    private int colum;

    public Piece(int row, int colum) {
        this.row = row;
        this.colum = colum;
    }

    public String toString() {
        return "["+this.row+","+this.colum+"]";
    }
}