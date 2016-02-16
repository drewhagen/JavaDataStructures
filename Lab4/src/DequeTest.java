
public class DequeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Deque<Integer> trainCarts = new Deque<Integer>();
	System.out.println("====== Testing Results ======");
	System.out.println();
	
	//Is our track empty?
	System.out.println("--- isEmpty() testing ---");
	System.out.println(trainCarts.isEmpty());
	
	//Let's connect some trains to the front!
	System.out.println("--- addToFront() testing ---");
	
	trainCarts.addToFront(5);
	trainCarts.printList();
	trainCarts.addToFront(4);
	trainCarts.printList();
	trainCarts.addToFront(3);
	trainCarts.printList();
	trainCarts.addToFront(2);
	trainCarts.printList();
	System.out.println();
	
	//Let's remove 4 trains from the front!
	System.out.println("--- removeFront() testing ---");
	trainCarts.printList();
	for(int i = 1; i <= 4;)
	{
	trainCarts.removeFront();
	trainCarts.printList();
	i++;
	}
	System.out.println();
	System.out.println();
	
	//Let's connect some trains to the back!
	System.out.println("--- addToBack() testing ---");
	
	trainCarts.printList();
	trainCarts.addToBack(6);
	trainCarts.printList();
	trainCarts.addToBack(7);
	trainCarts.printList();
	trainCarts.addToBack(8);
	trainCarts.printList();
	trainCarts.addToBack(9);
	trainCarts.printList();
	System.out.println();
	
	//Let's remove 4 trains from the back!
	System.out.println("--- removeBack() testing ---");
	trainCarts.printList();
	for(int i = 1; i <= 4;)
	{
	trainCarts.removeBack();
	trainCarts.printList();
	i++;
	}
	System.out.println();
	System.out.println();
	
	System.out.println("--- Clear() testing ---");
	//Let's remove the rest of the Strings
	trainCarts.addToFront(5);
	trainCarts.printList();
	trainCarts.addToBack(8);
	trainCarts.printList();
	trainCarts.addToBack(3);
	trainCarts.printList();
	trainCarts.addToFront(0);
	trainCarts.printList();
	trainCarts.clear();
	System.out.println("clear() result-- ");
	trainCarts.printList();

	}
}

/*
====== Testing Results ======

--- isEmpty() testing ---
true
--- addToFront() testing ---
|Front [5] Back| list of 1 element(s).
|Front [4][5] Back| list of 2 element(s).
|Front [3], 4, [5] Back| list of 3 element(s).
|Front [2], 3, , 4, [5] Back| list of 4 element(s).

--- removeFront() testing ---
|Front [2], 3, , 4, [5] Back| list of 4 element(s).
|Front [3], 4, [5] Back| list of 3 element(s).
|Front [4][5] Back| list of 2 element(s).
|Front [5] Back| list of 1 element(s).
The list is empty!


--- addToBack() testing ---
The list is empty!
|Front [6] Back| list of 1 element(s).
|Front [6][7] Back| list of 2 element(s).
|Front [6], 7, [8] Back| list of 3 element(s).
|Front [6], 7, , 8, [9] Back| list of 4 element(s).

--- removeBack() testing ---
|Front [6], 7, , 8, [9] Back| list of 4 element(s).
|Front [6], 7, [8] Back| list of 3 element(s).
|Front [6][7] Back| list of 2 element(s).
|Front [6] Back| list of 1 element(s).
The list is empty!


--- Clear() testing ---
|Front [5] Back| list of 1 element(s).
|Front [5][8] Back| list of 2 element(s).
|Front [5], 8, [3] Back| list of 3 element(s).
|Front [0], 5, , 8, [3] Back| list of 4 element(s).
clear() result-- 
The list is empty!
 */
