import java.util.LinkedList;
/*
 * @name: Queue
    * @desc: queue implemented using a linked list.
    * @param: T generic type
 */
public class Queue<T> {
    private LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    /*
     * @name: enqueue
     * @desc: Adds an element to the end of the queue.
     * @param: T data
     * @return: void
     */
    public void enqueue(T data) {
        linkedList.addLast(data);
    }

    /*
     * @name: dequeue
     * @desc: Removes and returns the element from the front of the queue.
     * @return: T dequeued element
     */
    public T dequeue() {
        return linkedList.poll();
    }

    /*
     * @name: front
     * @desc: Returns the element at the front of the queue without removing it.
     * @return: T element at the front of the queue
     */
    public T front() {
        return linkedList.peek();
    }

    /*
     * @name: isEmpty
     * @desc: Checks if the queue is empty.
     * @return: boolean true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
