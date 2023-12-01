import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

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

        // Check dequeue
        assertEquals(56, queue.dequeue().intValue());
        assertEquals(30, queue.dequeue().intValue());
        assertEquals(70, queue.dequeue().intValue());

        // Check isEmpty after dequeuing all elements
        assertTrue(queue.isEmpty());
    }
    
}
