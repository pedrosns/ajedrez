import models.Board;
import models.Position;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Board board = new Board();
        Boolean endGame= false;
        Scanner scanner= new Scanner(System.in);


        board.fill();

        

        // board.swap(1, 7, 7, 7);
        while (!endGame) {

            board.print();
            
            System.out.println("Indique la fila y la columna en donde se encuentra");
            String from=scanner.next();
            System.out.println("Indique la fila y la columna a donde quiere ir");
            String to=scanner.next();
            Position positionA=Position.stringToPosition(from);
            Position positionB=Position.stringToPosition(to);

            board.swap(positionA ,positionB);

            

        }
        scanner.close();
    }

}
