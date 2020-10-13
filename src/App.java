import models.Board;
import models.Position;

import java.util.*;

import exceptions.GameException;

public class App {
    public static void main(String[] args) throws Exception {
        Board board = new Board();
        Boolean endGame = false;
        Scanner scanner = new Scanner(System.in);

        board.fill();

        while (!endGame) {
            try {
                board.print();

                System.out.println("Indique la fila y la columna en donde se encuentra");
                String from = scanner.next();
                System.out.println("Indique la fila y la columna a donde quiere ir");
                String to = scanner.next();
                Position positionA = Position.stringToPosition(from);
                Position positionB = Position.stringToPosition(to);

                board.swap(positionA, positionB);

            } catch (GameException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error interno: " + e.getMessage());
            }
        }
        scanner.close();
    }

}
