public interface StackInterface<T> {

public void push(T newEntry);

public T pop();

public T peek();

public boolean isEmpty();

public void clear();

public T popTop() throws StackUnderflowException;
//Throws StackUnderflowException if this stack is empty
//otherwise removes and returns top element from this stack.

	
}
