/* Exercise 4
 * Drew Hagen
 */
public class Stack<T> implements StackInterface<T>{
	private Node top; //the top of the stack
	private int sz; //size of the stack
	
	/**
	 * getter for the size of the stack
	 * @return size of stack, sz
	 */
	public int getSz() {
		return sz;
	}
	
	/**
	 * The constructor. Creates a new stack, initially with no values yet.
	 */
public Stack() {
		top = null;
		sz = 0;
	}
	
/**
 * Adds new entry to the top of the stack
 * @param newEntry	the element you are adding to the stack, T
 */
public void push(T newEntry) {
	Node newNode = new Node(newEntry);
	newNode.next = top;
	top = newNode;
	sz++;
}

/**
 * The remove method for stack, "pops" off the top value.
 * @return T, the item that is being deleted: the first element on the stack before it was deleted.
 */
public T pop() {
	T result = null;
	if(top != null) {
		result = top.data;
		top = top.next;
		sz--;
	}
	return result;
}

/**
 * The peek() method will return the first element on the stack.
 * This is done by simply by pulling the 'data' of Node top.
 * @return the top element on the stack.
 */
public T peek() {
	return top.data;
}

/**
 * This method tells us if the stack is empty or not.
 * @return boolean, true if empty and top is null, false if objects are in the stack.
 */
public boolean isEmpty() {
	boolean result = false;
	if (top == null) {
		result = true;
	}
	return result;
	}

/**
 * Removes all elements in the stack using a loop.
 */
public void clear() {
	while (isEmpty()!= true) {
		pop();
	}
}

/**
 * The class for the node: holder for data in a linked list.
 * @author Drew
 *
 */
private class Node {
	
	private T data;
	private Node next;
	
	private Node(T data) {
		this(data, null);
	}
	
	private Node(T newData, Node nextNode) {
		data = newData;
		next = nextNode;
	}
}

/**
 * Another remove method for stack, "pops" off the top value, but also gives an exception if stack is empty.
 * @return T, the item that is being deleted: the first element on the stack before it was deleted, or
 * StackUnderFlow Exception.
 */
public T popTop() throws StackUnderflowException{
	if(isEmpty()==true)
		throw new StackUnderflowException();
	else
		return pop();
}

}

