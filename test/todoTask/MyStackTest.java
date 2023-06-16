package todoTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    private MyStack stack;

    @BeforeEach
    public void setup() {
        stack = new MyStack();

    }

    @Test
    public void testPush() {
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        stack.push("Element 4");
        stack.push("Element 5");

        assertFalse(stack.isEmpty());
        assertEquals(5, stack.getSize());
    }

    @Test
    public void testPop() {
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        stack.push("Element 4");
        stack.push("Element 5");

        Object poppedElement = stack.pop();

        assertEquals("Element 5", poppedElement);
        assertFalse(stack.isEmpty());
        assertEquals("Element 4", stack.peek());
        assertEquals(4, stack.getSize());
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void testPeek() {
        stack.push("Element 1");
        stack.push("Element 2");

        Object topElement = stack.peek();

        assertEquals("Element 2", topElement);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }

    @Test
    public void testSearch() {
        stack.push("Element 1");
        stack.push("Element 2");

        int index = stack.search("Element 1");

        assertEquals(2, index);
    }

    @Test
    public void testSearchNonExistingElement() {
        stack.push("Element 1");
        stack.push("Element 2");

        int index = stack.search("Element 3");

        assertEquals(-1, index);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());

        stack.push("Element 1");

        assertFalse(stack.isEmpty());
    }
}
