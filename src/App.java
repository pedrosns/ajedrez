import models.Board;

public class App {
    public static void main(String[] args) throws Exception {
        Board board = new Board();

        board.fill();

        board.print();

        // board.swap(1, 7, 7, 7);
    }
}
