package models;

public class Position {
    public int row;
    public int col;
    public Position(int row, int col){
        this.row=row;
        this.col=col;
    }

    public static Position stringToPosition(String value){
        String[] values=value.split(",");
        int row=Integer.parseInt(values[0]);
        int col=Integer.parseInt(values[1]);

        
        return new Position(row,col);
        
    }
    
}
