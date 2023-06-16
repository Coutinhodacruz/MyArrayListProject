package todoTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MyLinkedListTest {

    MyLinkedList linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new MyLinkedList();

    }
    @Test
    public void testListIsEmpty(){

        assertTrue(linkedList.isEmpty());
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        assertFalse(linkedList.isEmpty());
        assertEquals(3, linkedList.size());

    }
    @Test
    public void testAdd(){

        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        assertFalse(linkedList.isEmpty());
        assertEquals(3, linkedList.size());
    }

    @Test
    public void testRetrievingElement(){
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        assertEquals("Element 1", linkedList.get(0));
        assertEquals("Element 2", linkedList.get(1));
        assertEquals("Element 3", linkedList.get(2));

    }

    @Test
    public void testRemovingElement(){
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.remove("Element 2");

        assertEquals(2, linkedList.size());
        assertEquals("Element 1", linkedList.get(0));
        assertEquals("Element 3", linkedList.get(1));

        linkedList.remove("Element 1");

        assertEquals(1, linkedList.size());
        assertEquals("Element 3", linkedList.get(0));

        linkedList.remove("Element 3");

        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());

    }




}
