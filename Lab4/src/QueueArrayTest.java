
public class QueueArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	QueueArray<String> sentence = new QueueArray<String>(11);
	System.out.println("capacity of this sentence: " + sentence.maxObjects + " words.");
	System.out.println("====== Testing Results ======");
	System.out.println();
	
	//Is our sentence empty?
	System.out.println("--- isEmpty() testing ---");
	System.out.println(sentence.isEmpty());
	
	//Let's enqueue some words into our sentence!
	System.out.println("--- Enqueue testing ---");
	
	sentence.enqueue("Hello! ");
	sentence.enqueue("My ");
	sentence.enqueue("name ");
	sentence.enqueue("is ");
	sentence.enqueue("Ralph. ");
	sentence.enqueue("I'm ");
	sentence.enqueue("going ");
	sentence.enqueue("to ");
	sentence.enqueue("Wreck ");
	sentence.enqueue("It!");
	sentence.enqueue("!!!");
	System.out.println();
	
	//Let's dequeue five values out of our sentence.
	System.out.println("--- Dequeue testing ---");
	System.out.print("The sentence:   ");
	for(int i = 1; i <= 10;)
	{
	System.out.print(sentence.dequeue());
	i++;
	}
	System.out.println();
	System.out.println();
	
	System.out.println("--- Clear() testing ---");
	//Let's remove the rest of the Strings
	System.out.println("Remaining strings: " + sentence.getFront());
	sentence.clear();
	System.out.println("clear() result-- " + sentence.getFront());

	}
}