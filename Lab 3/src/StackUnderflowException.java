public class StackUnderflowException extends RuntimeException{

	public StackUnderflowException() {
		super("Error: The stack is empty!");
	}
	public StackUnderflowException(String message) {
		super(message);
	}	
}
