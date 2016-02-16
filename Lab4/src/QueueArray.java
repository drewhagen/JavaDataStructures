import java.util.*;
/** Lab 4 exercise 2
 * A collection of objects in chronological order and having the same data type.
 * [Array Queue]
 * @author Drew Hagen
 * @param <T>		The data type the queue will take in.
 */
public class QueueArray<T> implements QueueInterface<T> {
	
/*
 * any code that is commented out was disabled due to stumping errors.
 * 
 * note to self for later: next time you get a similar prompt with arrays, try extending
 * base code to a new class (analogous to base code of set extended to newBag) so you can
 * create multiple sets for manipulating, such as extended sets and sets without nulls.
 */

/**
* Soon to be the capacity parameter of T data array set[]
*/
public int maxObjects;

/**
* The array set which holds unspecified elements.
*/
public T[] set;	

/**
 * The Constructor, allows us to create an object of this class and set the capacity of its array
 * @param maxObjects
 */
public QueueArray(int maxObjects) {
	this.maxObjects = maxObjects;
	set = (T[])new Object[maxObjects];
}

/**
 * An alternate constructor with no parameters that defaults the capacity of the array to 4.
 */
public QueueArray(){
	this(4);
}
	
/**
* Task: Adds a new entry to the back of the queue.
* @param integer newEntry
* @return none
*/
public void enqueue(T newEntry){
	for(int i= 0; i < maxObjects; i++)
		if (set[i]== null) {
			set[i]= newEntry;
			break;
		}
/*	if (size() == maxObjects) {
		expandSet();
	}
*/
}

/**
* Task: Removes and returns the entry at the front of the queue.
* @param none
* @return either the queue's front entry or, if the queue is empty before the operation, null.
*/
public T dequeue() {
	if (set[0]== null) {
/*		noNullSet();      */
/*		nullTrade();      */
		nullRipple();
	}
	T result = set[0];
	set[0] = null;
	nullRipple();
	return result;
}


/**
* Task: Retrieves the queue's front entry without changing the queue in any way.
* @param none
* @return either the queue's front entry or, if the queue is empty, null.
*/
public T getFront() {
	if (set[0]==null)
		return null;
	else
		return set[0];
}

/**
* Task: Detects whether the queue is empty.
* @param none
* @return true if the queue is empty.
*/
public boolean isEmpty() {
	boolean result = false;
	if (set[0] == null) {
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

/*public int size() {
	int sz=0;
	for(int i= 0; i < maxObjects; i++)
		if (set[i]!= null) {
			sz= sz + 1;
		}
	return sz;
}
*/

/* private void expandSet() {
	int newCap = maxObjects+4;
	T[] set2 = (T[])new Object[newCap];
	for(int i=0; i<maxObjects;) {
		for(int k= 0; k < newCap; k++)
			if (set2[k]== null) {
				set2[k]= set[i];
				break;
		}
		i++;
	}
	set = set2;
}
*/

//disabled code-- was intended to create a cloned set with no nulls.
/* private void noNullSet() {
	int newCap = size();
	T[] set2 = (T[])new Object[newCap];
	for(int i=0; i<maxObjects; i++)
		if (set[i] != null) {
			for(int k= 0; k < newCap; k++)
				if (set2[k]== null) {
					set2[k]= set[i];
					break;
				}
		}
	set = set2;
}
*/

/* private void nullTrade() {
	for(int i=0; i<maxObjects; i++)
		if (set[i] == null) {
			for (int k=i; k<maxObjects; k++)
				if (set[k] != null) {
					set[i] = set[k];
					set[k] = null;
				}
				else
					set[k] = null;
		}
}
*/

/**
 * Private operation for use inside Dequeue.
 * It pushes nulls from the front to the back of the set, exchanging them with legitimate values.
 */
private void nullRipple() {
	for(int i=0; i<maxObjects;) {
		if (set[i] == null && (i+1)!=maxObjects) {
			set[i] = set[i+1];
			set[i+1] = null;
		}
	i++;
	}
}
	
}
