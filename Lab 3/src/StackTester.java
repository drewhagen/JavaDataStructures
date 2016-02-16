
public class StackTester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack<Integer> bookshelf = new Stack<Integer>();
	System.out.println("====== Testing Results ======");
	System.out.println("Note: Peek() is tested throughout.");
	System.out.println();
	
	//Is bookshelf empty?
	System.out.println("--- isEmpty() testing ---");
	System.out.println(bookshelf.isEmpty());
	
	//Let's add some integers onto our stack!
	System.out.println("--- Push testing ---");
	for(int i = 1; i <= 10; i++)
	{
	bookshelf.push(i);
	System.out.println(bookshelf.peek());
	}
	System.out.println();
	
	//Let's pop two values off our stack.
	System.out.println("--- Pop testing ---");
	for(int i = 1; i <= 2;)
	{
	bookshelf.pop();
	System.out.println(bookshelf.peek());
	i++;
	}
	System.out.println();
	
	//Let's pop three more values with our other pop method
	System.out.println("--- popTop testing ---");
	for(int i = 1; i <= 3;)
	{
	bookshelf.popTop();
	System.out.println(bookshelf.peek());
	i++;
	}
	System.out.println();
	
	System.out.println("--- Clear() + Exception testing ---");
	//Let's remove the rest of the values
	bookshelf.clear();
	
	//Finally, let's make sure the exception tosses with popTop()
	bookshelf.popTop();
	}
}

/**
 ====== Testing Results ======
Note: Peek() is tested throughout.

--- isEmpty() testing ---
true
--- Push testing ---
1
2
3
4
5
6
7
8
9
10

--- Pop testing ---
9
8

--- popTop testing ---
7
6
5

--- Clear() + Exception testing ---
Exception in thread "main" StackUnderflowException: Error: The stack is empty!
	at Stack.popTop(Stack.java:69)
	at StackTester.main(StackTester.java:50)
*/