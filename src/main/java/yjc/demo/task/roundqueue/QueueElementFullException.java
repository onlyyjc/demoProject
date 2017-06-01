package yjc.demo.task.roundqueue;

/**
 * Created by yangjiachang on 2017/3/13.
 */
public class QueueElementFullException  extends RuntimeException{
    private static final long serialVersionUID = -1242599979055870217L;

    public QueueElementFullException() {

    }

    public QueueElementFullException(String message) {
        super(message);
    }

    public QueueElementFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueElementFullException(Throwable cause) {
        super(cause);
    }
}
