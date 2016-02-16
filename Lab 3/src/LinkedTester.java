
public class LinkedTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<Integer> tango = new LinkedList<Integer>();
	
	System.out.println("====== Test Results ======");
	
	//Let's add some integers into our linked list!
	System.out.println("--- Add Testing ---");
	for(int i = 1; i <= 5; i++)
		{
		tango.add(i);
		System.out.println(tango.getFirst());
		}
	System.out.println();
	
	//Let's clarify that our integers successfully made it in the list.
	System.out.println("--- Contains Testing ---");
	for(int i = 1; i <= 6; i++)
		{
		System.out.println(tango.contains(i));
		}
	System.out.println();
	
	//Let's use getNext() as a way to show the contents in the linked list.
	System.out.println("--- getFirst / getNext() Testing ---");
	System.out.println(tango.getFirst());
	for(int i = 1; i <= 4; i++)
		{
		System.out.println(tango.getNext());
		}
	System.out.println();
	
	//Let's remove the integers
	System.out.println("--- Remove Testing ---");
	for(int i = 1; i <= 6; i++)
		{
		System.out.println(tango.getFirst());
		tango.remove();
		}
	
	//Shana's requests]
	System.out.println();
	System.out.println("--- Shana's Requests ---");
	System.out.println("Testing to see if getNext() will properly return 'null' when at end of list.");
	tango.add(4);
	System.out.println(tango.getFirst());
	System.out.println(tango.getNext());
	System.out.println(tango.getNext());
	System.out.println();
	
	}
}

/**
====== Test Results ======
--- Add Testing ---
1
2
3
4
5

--- Contains Testing ---
true
true
true
true
true
false

--- getFirst / getNext() Testing ---
5
4
3
2
1

--- Remove Testing ---
5
4
3
2
1
null
*/
