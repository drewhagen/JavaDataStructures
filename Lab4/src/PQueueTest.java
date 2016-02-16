import java.util.*;
import java.text.RuleBasedCollator;
import java.text.ParseException;
public class PQueueTest{

	public static void main(String[] args) throws ParseException {
		
	//--- Constructor Tests ---//
	PriorityQueue<String> q1 = new PriorityQueue<String>();
	Collection<String> q2 = new PriorityQueue<String>();
	PriorityQueue<String> q2Copy = new PriorityQueue<String>(q2);
	PriorityQueue<String> q3 = new PriorityQueue<String>(4);
	PriorityQueue<String> q3Copy = new PriorityQueue<String>(q3);
		String  s4 = "< x< y< z";
		Comparator c4 = new RuleBasedCollator(s4);
	PriorityQueue<String> q4 = new PriorityQueue<String>(4, c4);
	
	PriorityQueue<String> q5 = new PriorityQueue<String>();
	System.out.println("=== Method Tests ===");
	System.out.println("-add--");
	q5.add("hello");
	q5.add("world");
	System.out.println(q5.toString());
	System.out.println("-clear--");
	q5.clear();
	System.out.println(q5.toString());
	System.out.println("-comparator---");
	System.out.println(q4.comparator());
	System.out.println("-iterator---");
	System.out.println(q4.iterator());
	System.out.println("-offer--");
	q5.offer("hello");
	q5.offer("world");
	System.out.println(q5.toString());
	System.out.println("-offer--");
	q5.peek();
	System.out.println("-poll--");
	q5.poll();
	System.out.println("-remove--");
	q5.remove();
	System.out.println("-size--");
	System.out.println(q5.size());
	
	
	
	
	}
}

