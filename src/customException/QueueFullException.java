package customException;

public class QueueFullException extends Throwable {
    public QueueFullException(String message) {
        super(message);
    }
}
