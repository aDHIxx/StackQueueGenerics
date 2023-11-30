import java.util.LinkedList;
/*
 * @name: Stack
 * @desc: stack implemented using a linked list.
 * @param: T generic type
 */
public class Stack<T> {
    private LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    /*
     * @name: push
     * @desc: Pushes an element onto the stack.
     * @param: T data
     * @return: void
     */
    public void push(T data) {
        linkedList.add(data);
    }

    /*
     * @name: pop
     * @desc: Pops the element from the top of the stack.
     * @return: T popped element
     */
    public T pop() {
        T poppedData = null;
        if (!isEmpty()) {
            poppedData = linkedList.getLast();
            linkedList.removeLast(); // Corrected line
        }
        return poppedData;
    }

    /*
     * @name: peek
     * @desc: Returns the element at the top of the stack without removing it.
     * @return: T element at the top of the stack
     */
    public T peek() {
        T topData = null;
        if (!isEmpty()) {
            topData = linkedList.getFirst();
        }
        return topData;
    }
    /*
     * @name: isEmpty
     * @desc: Checks if the stack is empty.
     * @return: boolean true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

}
