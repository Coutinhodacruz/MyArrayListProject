package queue;


import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setup() {
        queue = new Queue(3);
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);


       assertEquals(8, queue.size());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        Object item1 = queue.dequeue();
        assertEquals(1, item1);
        assertEquals(4, queue.size());

        Object item2 = queue.dequeue();
        assertEquals(2, item2);
        assertEquals(3, queue.size());
    }

    @Test
    public void testEmptyQueue() {
        assertTrue(queue.isEmpty());
       assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    public void testElementMovement(){
        assertTrue(queue.isEmpty());

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        assertEquals(3, queue.size());
        assertEquals(5, queue.dequeue());
        assertTrue(queue.checkElementMovement());

        queue.enqueue(4);
        assertEquals(4, queue.size());
        assertEquals(6, queue.dequeue());
        assertFalse(queue.checkElementMovement());

        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        assertEquals(6, queue.size());
        assertEquals(5, queue.dequeue());
        assertTrue(queue.checkElementMovement());

        queue.enqueue(0);
        assertEquals(6, queue.size());
        assertEquals(4, queue.dequeue());
        assertFalse(queue.checkElementMovement());
    }

    @Test
    public void testIncreaseCapacity() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        assertEquals(4, queue.size());

        Object item1 = queue.dequeue();
        assertEquals(1, item1);
        assertEquals(3, queue.size());

        Object item2 = queue.dequeue();
        assertEquals(2, item2);
        assertEquals(2, queue.size());
    }

//    @Test
//    @Ignore
//    public void testRemoveSpace() {
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(6);
//        queue.enqueue(7);
//
//        assertEquals(7, queue.size());
//
//        Object item1 = queue.dequeue();
//
//        assertEquals(1, item1);
//        assertEquals(6, queue.size());
//
//
//        Object item2 = queue.dequeue();
//        assertEquals(2, item2);
//        assertEquals(5, queue.size());
//
//        queue.enqueue(6);
//        queue.enqueue(7);
//
//        assertEquals(7, queue.size());
//
//        Object item3 = queue.dequeue();
//        assertEquals(3, item3);
//        assertEquals(6, queue.size());
//
//        Object item4 = queue.dequeue();
//        assertEquals(4, item4);
//        assertEquals(5, queue.size());
//    }

    @Test
    public void testCapacity() {

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        assertEquals(6, queue.size());

        queue.enqueue(1);
        assertEquals(7, queue.size());


        Object item1 = queue.dequeue();
        Object item2 = queue.dequeue();

        assertEquals(5, queue.size());

        queue.enqueue(6);
        queue.enqueue(7);
        assertEquals(7, queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(1, queue.size());

        queue.enqueue(8);
        assertEquals(2, queue.size());
    }

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class QueueTest {
//    private Queue<Integer> queue;
//
//    @BeforeEach
//    public void setup() {
//        queue = new Queue<>(6);
//    }
//
//    @Test
//    public void testElementMovement() {
//        Assertions.assertTrue(queue.isEmpty());
//
//        queue.enqueue(7);
//        queue.enqueue(6);
//        queue.enqueue(5);
//        Assertions.assertEquals(3, queue.size());
//        Assertions.assertEquals(7, queue.dequeue());
//        Assertions.assertTrue(queue.checkElementMovement());
//
//        queue.enqueue(4);
//        Assertions.assertEquals(4, queue.size());
//        Assertions.assertEquals(6, queue.dequeue());
//        Assertions.assertFalse(queue.checkElementMovement());
//
//        queue.enqueue(3);
//        queue.enqueue(2);
//        queue.enqueue(1);
//        Assertions.assertEquals(6, queue.size());
//        Assertions.assertEquals(5, queue.dequeue());
//        Assertions.assertTrue(queue.checkElementMovement());
//
//        queue.enqueue(0);
//        Assertions.assertEquals(6, queue.size());
//        Assertions.assertEquals(4, queue.dequeue());
//        Assertions.assertFalse(queue.checkElementMovement());
//    }
//}


}
