/**
 * Lab 3.Exercise1
 * Linked List-- a class that takes in data into nodes, that link together into a list.
 * @author Drew Hagen
 * @param <T> Some data / Object
 */
public class LinkedList<T> {

	private Node front; //front (or first) node of the linked list
	private int sz; //size of the linked list
	private int count; //for the getNext()
	
	//getter for the size of the linked list
	public int getSz() {
		return sz;
	}
	
	/**
	 * The constructor. Creates a new link list, initially with no values yet.
	 */
	public LinkedList() {
		front = null;
		sz = 0;
	}
	
	/**
	 * Adds new entry to the linked list
	 * @param newEntry	the element you are adding to the linked list, T
	 */
	public void add(T newEntry) {
		Node newNode = new Node(newEntry);
		newNode.next = front;
		front = newNode;
		sz++;
	}
	
	/**
	 * Tells us if the linked list contains an element.
	 * @param anEntry	the element we want to know is in the list, T
	 * @return	boolean found-- true if found, false if not.
	 */
	public boolean contains(T anEntry) {
		boolean found = false;
		Node currentNode = front;
		while (!found && (currentNode != null)) {
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		}
		return found;
	}
	

	/**
	 * Similar to the contains method, but additionally, tells us which node the data is in
	 * @param anEntry	the elements we want to know is in the list, T
	 * @return	the node where the data is being held
	 */
	private Node getReferenceTo(T anEntry) {
		boolean found = false;
		Node currentNode = front;
		while(!found && (currentNode != null)) {
			if(anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		}
		return currentNode;
	}
	
	/**
	 * The remove method when a parameter doesn't exist, to make our code more robust.
	 * @return the item that is being deleted: the first element in the list before it was deleted.
	 */
	public T remove() {
		T result = null;
		if(front != null) {
			result = front.data;
			front = front.next;
			sz--;
		}
		return result;
	}
	/**
	 * The remove() method will delete the entry that you place in the parameter
	 * @param anEntry	element that you would like to remove from the linked list
	 * @return boolean, true if entry existed and was deleted, false if entry does not exist.
	 */
	public boolean remove(T anEntry) {
		boolean result = false;
		Node nodeN = getReferenceTo(anEntry);
		if (nodeN != null) {
			nodeN.data = front.data;
			remove();
			result = true;
		}
		return result;
	}
	/**
	 * The getFirst() method will return the first element in the linked list.
	 * This is done by simply by pulling the 'data' of Node front.
	 * @return the first element in the linked list
	 */
	public T getFirst() {
	if (count== 0) {
		count++;
	}
	if (front==null)
	return null;
	else
	return front.data;
	}
	
	/**
	 * The getNext() method will return the next method in the linked list.
	 * This is done by creating a clone of the front of the list and using a 'for loop' through a simple
	 * algorithm designed to yield the next element, as many times as the method counter suggests.
	 * We do this since the position of the nodes can change.
	 * @return the next element in the linked list.
	 */
	public T getNext() {
		Node currentNode = front; //creates a clone of the front to manipulate without changing the front.
		for(int i=1; i<=count; i++) {
			currentNode = currentNode.next;
			if(currentNode == null)
			{
				return null;
			}
			else
				currentNode = currentNode.next;
			count++;
			if (count>sz) { //resets the counter if it exceeds the size of the linked list.
				count=0;
			}
		}
		return currentNode.data;
	}
	
	//Integrated Node Class -- Private as only used inside LinkedList
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
}
