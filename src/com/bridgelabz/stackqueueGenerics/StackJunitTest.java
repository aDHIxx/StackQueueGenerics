import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class StackJunitTest {
    @Test
    public void testStackOperations() {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Check pop
        assertEquals(56, stack.pop().intValue());
        assertEquals(30, stack.pop().intValue());
        assertEquals(70, stack.pop().intValue());

        // Check isEmpty after popping all elements
        assertTrue(stack.isEmpty());

    }

    @Test
    public void testPeekAndPopTillEmpty() {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Peek and pop until the stack is empty
        assertEquals(56, stack.peek().intValue());
        assertEquals(56, stack.pop().intValue());

        assertEquals(30, stack.peek().intValue());
        assertEquals(30, stack.pop().intValue());

        assertEquals(70, stack.peek().intValue());
        assertEquals(70, stack.pop().intValue());

        // Check isEmpty after popping all elements
        assertTrue(stack.isEmpty());
    }
}
