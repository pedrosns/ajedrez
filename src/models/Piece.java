package models;

public class Piece {
    private int row;
    private int colum;
    private String identify;
    private int rowDestino;
    private int colDestino;

    public Piece(int row, int colum) {
        this.row = row;
        this.colum = colum;
    }

    public Piece(int row, int colum, int rowDestino, int colDestino){
        this.row = row;
        this.colum = colum;
        this.rowDestino = rowDestino;
        this.colDestino = colDestino;
    }
    public void setDestino(int rowDestino, int colDestino){
        this.rowDestino=rowDestino;
        this.colDestino=colDestino;
    }
    public int getDestino(){
        return this.rowDestino + this.colDestino;
    }
    public void setIdentify(String identify){
        this.identify=identify;
    }

    public String getIdentify(){
        return this.identify;
    }

    public String toString() {
        return "["+this.row+","+this.colum+"]";
    }
}


    class Peon extends Piece{
    
    public Peon(int row, int colum){
        super(row, colum);
    }

}

     class Alfil extends Piece{
    
    public Alfil(int row, int colum){
        super(row, colum);
    }
}

     class Torre extends Piece{
    
    public Torre(int row, int colum){
        super(row, colum);
    }
}

class Caballo extends Piece{
    
    public Caballo(int row, int colum){
        super(row, colum);
    }
}

class Reina extends Piece{
    
    public Reina(int row, int colum){
        super(row, colum);
    }
}

class Rey extends Piece{
    
    public Rey(int row, int colum){
        super(row, colum);
    }
}