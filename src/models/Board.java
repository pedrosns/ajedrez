package models;

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
    public boolean swap(int row1, int colum1, int row2, int colum2)  {
        if((row1 < 8 && row1 >= 0) && (colum1 < 8 && colum1 >= 0) && (row2 < 8 && row2 >= 0) && (colum2 < 8 && colum2 >= 0)) {
            Piece tmp;
            tmp = this.board[row1][colum1];
            this.board[row1][colum1] = this.board[row2][colum2];
            this.board[row2][colum2] = tmp;
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