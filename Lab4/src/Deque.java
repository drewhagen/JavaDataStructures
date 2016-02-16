public class Deque<T> implements DequeInterface<T>{

	private Node front; //the top of the Queue
	private Node back; //the bottom of the Queue
	private int sz; //size of the Queue
			
	public Deque() {
		front = null;
		back = null;
		sz = 0;
	}
	
	 public void addToFront(T newEntry) {
		Node newNode = new Node(newEntry);
		if (isEmpty()) {
			back = newNode;
			front = newNode;
			sz++;
		}
		else {
			newNode.next = front;
			front = newNode;
			sz++;
		}
	 }
	 
	 public void addToBack(T newEntry) {
		 Node newNode = new Node(newEntry);
		if (isEmpty()) {
			front = newNode;
			back = newNode;
			sz++;
		}
		else {
			back.next = newNode;
			newNode.next = null;
			back = newNode;
			sz++;
		}
	}
	 
	 public T removeFront(){
		if (isEmpty()){
			return null;
		}
		else {
			T result = null;
			result = front.data;
			if (front.next == null) {
				front = null;
				back = null;
			}
			else {
				front = front.next;
			}
			sz--;
			return result;
		}
	}
	 
	 public T removeBack() {
		if (isEmpty()) {
			return null;
		}
		else {
			T result = back.data;
			Node pointer = front;
			while (pointer.next != back && pointer.next != null)
				pointer = pointer.next;
			if (pointer.next == back && pointer.next != null) {
				back = null;
				pointer.next = null;
				back = pointer;
				}
			else if (pointer.next == null && front != null) {
				back = null;
				front = null;
			}
			sz--;
			return result;
		}
	}
	 
	 public T getFront() {
		if (front==null)
			return null;
		else
		return front.data;
	 }
	 
	 public T getBack() {
		if (back==null)
			return null;
		else
			return back.data;
	 }
	 
	 public boolean isEmpty() {
		boolean result = false;
		if (front == null && back == null) {
			result = true;
		}
		return result;
		}
	 
	 public void clear() {
		while (isEmpty()!= true) {
			removeFront();
			removeBack();
			}
	 	}
	 
	 
	
	public void printList() {
	//modified to list all contents in the linked list! (Not just front and back)
		if (isEmpty()) {
			System.out.println("The list is empty!");
		}
		else {
		Node pointer = front;
		int index = 1;
		System.out.print("|Front [" + pointer.data + "]");
		while (pointer != back) {
			pointer = pointer.next;
			index++;
			if (pointer != back) {
			System.out.print(", " + pointer.data + ", ");
			}
		}
		if (front == back) {
			System.out.print(" Back|");
		}
		else if (pointer== back) {
			System.out.print("[" + pointer.data + "] Back|");
		}
		System.out.println(" list of " + index + " element(s).");
		}
	}




/**
 * The class for the node: holder for data in any linked list / stack.
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
