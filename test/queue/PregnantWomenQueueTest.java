package queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PregnantWomenQueueTest {
    @Test
    void queueIsZeroAtCreation() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        assertEquals(0, myQueue.size());
    }

    @Test
    void addOne() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        myQueue.addOnePregnantWoman(1);
        myQueue.addOnePregnantWoman(2);
        myQueue.addOnePregnantWoman(3);

        assertEquals(3, myQueue.size());
    }

    @Test
    void addManyAtOnce() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        myQueue.addMultiplePregnantWomenAtOnce(1, 2, 3, 4, 5);
        assertEquals(5, myQueue.size());
    }

    @Test
    void capacityIncreasesIfLimitExceeds() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        myQueue.addOnePregnantWoman(1);
        myQueue.addOnePregnantWoman(2);
        myQueue.addOnePregnantWoman(3);
        myQueue.addOnePregnantWoman(4);
        myQueue.addOnePregnantWoman(5);
        myQueue.addOnePregnantWoman(6);

        assertEquals(6, myQueue.size());
        assertEquals(10, myQueue.getCapacity());
    }

    @Test
    void capacityIncreasesIfLimitExceedsByMultipleAdditions() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        myQueue.addMultiplePregnantWomenAtOnce(1, 2, 3, 4, 5, 6, 7);
        assertEquals(7, myQueue.size());
        assertEquals(10, myQueue.getCapacity());
    }

    @Test
    void removeFromQueue() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        myQueue.addOnePregnantWoman(1);
        myQueue.addOnePregnantWoman(2);
        myQueue.addOnePregnantWoman(3);
        myQueue.addOnePregnantWoman(4);
        myQueue.addOnePregnantWoman(5);

        assertEquals(5, myQueue.size());

        myQueue.remove();
        myQueue.remove();
        assertEquals(3, myQueue.size());
    }

    @Test
    void remove() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        myQueue.addOnePregnantWoman(1);
        myQueue.addOnePregnantWoman(2);
        myQueue.addOnePregnantWoman(3);

        myQueue.remove();
        assertNull(myQueue.getIndex(0));
        assertNull(myQueue.peek());
        System.out.println(myQueue);
    }

    @Test
    void reshuffleWhenCapacityReached() {
        PregnantWomenQueue<Integer> myQueue = new PregnantWomenQueue<>();
        myQueue.addOnePregnantWoman(2);
        myQueue.addOnePregnantWoman(3);
        myQueue.addOnePregnantWoman(5);
        myQueue.addOnePregnantWoman(2);
        System.out.println(myQueue);

        myQueue.remove();
        myQueue.remove();
        System.out.println(myQueue);

        myQueue.addOnePregnantWoman(6);
        System.out.println(myQueue);
    }
}
