import org.junit.Test;

import static junit.framework.TestCase.*;

public class QueueJunitTest {
    @Test
    public void testQueueOperations() {
        Queue<Integer> queue = new Queue<>();

        // Enqueue elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Check front
        assertEquals(56, queue.front().intValue());

        // Check isEmpty after dequeuing all elements
        assertFalse(queue.isEmpty());
    }
    @Test
    public void testDequeueOperations() {
        Queue<Integer> queue = new Queue<>();

        // Enqueue elements
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Check front
        assertEquals(56, queue.front().intValue());

        // Dequeue elements
        assertEquals(56, queue.dequeue().intValue());
        assertEquals(30, queue.dequeue().intValue());
        assertEquals(70, queue.dequeue().intValue());

        // Check isEmpty after dequeuing all elements
        assertTrue(queue.isEmpty());
    }
}