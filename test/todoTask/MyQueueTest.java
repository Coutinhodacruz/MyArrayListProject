package todoTask;

import customException.QueueEmptyException;
import customException.QueueFullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    private MyQueue queue;


    @BeforeEach
    public void setUp() {
        queue = new MyQueue();
    }

    @Test
    public void testEnqueue() {
        queue.enqueue("Element 1");
        queue.enqueue("Element 2");
        queue.enqueue("Element 3");
        queue.enqueue("Element 4");
        queue.enqueue("Element 5");
        queue.enqueue("Element 6");

        assertEquals(6, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue() throws QueueEmptyException {
        queue.enqueue("Element 1");
        queue.enqueue("Element 2");

        Object dequeuedElement = queue.dequeue();

        assertEquals("Element 1", dequeuedElement);
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testPeek() throws QueueFullException {
        queue.enqueue("Element 1");
        queue.enqueue("Element 2");

        Object peekedElement = queue.peek();

        assertEquals("Element 1", peekedElement);
        assertEquals(2, queue.size());
        assertFalse(queue.isEmpty());
    }


    @Test
    public void testEmptyQueueDequeue() {
        assertThrows(QueueEmptyException.class, () -> queue.dequeue());
    }

    @Test
    public void testEmptyQueuePeek() {
        assertThrows(QueueFullException.class, () -> queue.peek());
    }
}
