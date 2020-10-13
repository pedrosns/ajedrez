package models;

import exceptions.GameException;
import models.pieces.Alfil;
import models.pieces.Caballo;
import models.pieces.Peon;
import models.pieces.Reina;
import models.pieces.Rey;
import models.pieces.Torre;

public class Board {
    private Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
    }

    // solo se llama una vez
    public void fill() {
        // se inicializa todo el array
        for (int row = 0; row < 8; row++) {
            for (int colum = 0; colum < 8; colum++) {
                int user = 1;
                if (row>4) {
                    user=2;
                }
                this.board[row][colum] = new Piece(row, colum,0);

                // peon
                if (row == 1 || row == 6) {
                    this.board[row][colum] = new Peon(row, colum,user);
                }
                if ((row == 0 && colum == 1) || (row == 0 && colum == 6) || (row == 7 && colum == 1)
                        || (row == 7 && colum == 6)) {
                    this.board[row][colum] = new Caballo(row, colum,user);
                }
                if ((row == 0 && colum == 0) || (row == 0 && colum == 7) || (row == 7 && colum == 0)
                        || (row == 7 && colum == 7)) {
                    this.board[row][colum] = new Torre(row, colum,user);
                }
                if ((row == 0 && colum == 2) || (row == 0 && colum == 5) || (row == 7 && colum == 2)
                        || (row == 7 && colum == 5)) {
                    this.board[row][colum] = new Alfil(row, colum,user);
                }
                if ((row == 0 && colum == 3) || (row == 7 && colum == 4)) {
                    this.board[row][colum] = new Rey(row, colum,user);
                }
                if ((row == 0 && colum == 4) || (row == 7 && colum == 3)) {
                    this.board[row][colum] = new Reina(row, colum,user);
                }
            }
        }
    }

    public void print() {
        for (int row = 0; row < 8; row++) {
            for (int colum = 0; colum < 8; colum++) {
                System.out.print(this.board[row][colum]);
            }
            System.out.print("\n");
        }
    }
    // Validar que no existe una pieza del mismo jugador
    public Boolean canMove(Piece pieza, Position destination) throws GameException {
        Piece piezaDestino=this.board[destination.row][destination.col];
        if (piezaDestino.user!=pieza.user) {
            return true;
        } else {
            throw new GameException("No se puede mover, hay una pieza en ese lugar");
        }
    }

    // row1 and colum1 donde estoy
    // row2 and colum2 a donde voy
    public boolean swap(Position position1, Position position2) throws GameException {
        if ((position1.row < 8 && position1.row >= 0) && (position1.col < 8 && position1.col >= 0)
                && (position2.row < 8 && position2.row >= 0) && (position2.col < 8 && position2.col >= 0)) {
            if (this.board[position1.row][position1.col].canMove(position2) && this.canMove(this.board[position1.row][position1.col], position2)) {
                Piece tmp;
                tmp = this.board[position1.row][position1.col];
                this.board[position1.row][position1.col] = this.board[position2.row][position2.col];
                this.board[position2.row][position2.col] = tmp;
                this.board[position2.row][position2.col].changePosition(position2);
                this.board[position1.row][position1.col].changePosition(position1);
            }
        }
        return true;
    }

    /*
     * h2 = peon h4 = vacio tmp = vacio
     * 
     * tmp = h2 h2 = h4 h4 = tmp
     */
}