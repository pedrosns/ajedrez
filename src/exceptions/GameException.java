package exceptions;

public class GameException extends Exception {
    public GameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        StringBuilder str = new StringBuilder();
        str.append("\n***************************\n");
        str.append(super.getMessage() + "\n");
        str.append("***************************\n");
        return str.toString();
    }
}