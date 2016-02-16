/**
 * Lab 4 exercise 1
 * A collection of objects in chronological order and having the same data type.
 * [Linked List Queue]
 * @author Drew Hagen
 * @param <T>		The data type the queue will take in.
 */
public class QueueLL<T> implements QueueInterface<T> {

private Node front; //the front of the Queue
private int sz; //size of the Queue
	
	
public QueueLL() {
front = null;
sz = 0;
}
	
/**
* Task: Adds a new entry to the back of the queue.
* @param integer newEntry
* @return none
*/
public void enqueue(T newEntry) {
	Node newNode = new Node(newEntry);
	if (front == null) {
		front = newNode;
		sz++;
	}
	else {
		Node pointer = front;
		while (pointer.next != null)
			pointer = pointer.next;
		if (pointer.next == null) {
			pointer.next = newNode;
			sz++;
			
		}
	}
}

/**
* Task: Removes and returns the entry at the front of the queue.
* @param none
* @return either the queue's front entry or, if the queue is empty before the operation, null.
*/
public T dequeue() {
	T result = null;
	if(front != null) {
		result = front.data;
		front = front.next;
		sz--;
	}
	return result;
}


/**
* Task: Retrieves the queue's front entry without changing the queue in any way.
* @param none
* @return either the queue's front entry or, if the queue is empty, null.
*/
public T getFront() {
	if (front==null)
		return null;
	else
		return front.data;
}

/**
* Task: Detects whether the queue is empty.
* @param none
* @return true if the queue is empty.
*/
public boolean isEmpty() {
	boolean result = false;
	if (front == null) {
		result = true;
	}
	return result;
	}

/**
* Task: removes all entries from the queue.
* @param none
* @return none
*/
public void clear() {
	while (isEmpty()!= true) {
		dequeue();
	}
}

/**
 * The class for the node: holder for data in any linked list.
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


}

