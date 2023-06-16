package customException;

public class QueueEmptyException extends Throwable {
    public QueueEmptyException(String message) {
        super(message);
    }
}
