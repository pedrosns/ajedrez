package models;

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
        for(int row = 0; row<8; row++) {
            for(int colum = 0; colum < 8; colum++)  {
                this.board[row][colum] = new Piece(row, colum);
                    //peon
                    if ( row==1 ||  row==6) {
                        this.board[row][colum] = new Peon(row, colum);
                    }
                    if ((row==0 && colum==1)|| (row==0 && colum==6)|| (row==7 && colum==1)||(row==7 && colum==6)) {
                        this.board[row][colum] = new Caballo(row, colum);
                    }
                    if ((row==0 && colum==0)|| (row==0 && colum==7)|| (row==7 && colum==0)||(row==7 && colum==7)) {
                        this.board[row][colum] = new Torre(row, colum);
                    }
                    if ((row==0 && colum==2)|| (row==0 && colum==5)|| (row==7 && colum==2)||(row==7 && colum==5)) {
                        this.board[row][colum] = new Alfil(row, colum);
                    }
                    if ((row==0 && colum==3)||  (row==7 && colum==4)) {
                        this.board[row][colum] = new Rey(row, colum);
                    }
                    if ((row==0 && colum==4)||  (row==7 && colum==3)) {
                        this.board[row][colum] = new Reina(row, colum);
                    }
            }
        }
    }

    public void print() {
        for(int row = 0; row<8; row++) {
            for(int colum = 0; colum < 8; colum++)  {
                System.out.print(this.board[row][colum]);
            }
            System.out.print("\n");
        }
    }

    // row1 and colum1 donde estoy
    // row2 and colum2 a donde voy
    public boolean swap(Position position1, Position position2 )  {
        if((position1.row < 8 && position1.row >= 0) && (position1.col < 8 && position1.col >= 0) && (position2.row < 8 && position2.row >= 0) && (position2.col < 8 && position2.col>= 0)) {
            Piece tmp;
            tmp = this.board[position1.row][position1.col];
            this.board[position1.row][position1.col] = this.board[position2.row][position2.col];
            this.board[position2.row][position2.col] = tmp;
            System.out.println(tmp);
            System.out.println(this.board[position2.row][position2.col]);
            System.out.println(this.board[position1.row][position1.col]);
        }
        return true;
    }

    
    /*
    h2 = peon
    h4 = vacio
    tmp = vacio

    tmp = h2
    h2 = h4
    h4 = tmp
    */
}