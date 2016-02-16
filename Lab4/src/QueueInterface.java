/**
 * Interface and ADT Representative
 * Lab 4 Exercise 1
 * @author Drew Hagen
 *
 * @param <T>, any object
 */
public interface QueueInterface<T> {

/**
 * Task: Adds a new entry to the back of the queue.
 * @param integer newEntry
 * @return none
 */
public void enqueue(T newEntry);

/**
 * Task: Removes and returns the entry at the front of the queue.
 * @param none
 * @return either the queue's front entry or, if the queue is empty before the operation, null.
 */
public T dequeue();

/**
 * Task: Retrieves the queue's front entry without changing the queue in any way.
 * @param none
 * @return either the queue's front entry or, if the queue is empty, null.
 */
public T getFront();

/**
 * Task: Detects whether the queue is empty.
 * @param none
 * @return true if the queue is empty.
 */
public boolean isEmpty();

/**
 * Task: removes all entries from the queue.
 * @param none
 * @return none
 */
public void clear();
}
