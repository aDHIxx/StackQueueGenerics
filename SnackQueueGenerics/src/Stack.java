import java.util.LinkedList;

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
            linkedList.pop();
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
        return linkedList.getFirst() == null;
    }
}
