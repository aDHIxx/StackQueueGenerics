import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class StackJunitTest {
    @Test
    void testStackOperations() {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Check isEmpty after popping all elements
        assertTrue(stack.pop().equals(56));
        assertTrue(stack.pop().equals(30));
        assertTrue(stack.pop().equals(70));
    }
}
