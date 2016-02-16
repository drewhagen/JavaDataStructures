public class Test {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Let's create some grocery theme objects.
		String pasta = "Mac and Cheese";
		int soupcans = 9;
		int ramen = 20;
		char milk = 'c';
		Object cerealbox = 2;
		int eggs = 12;
		//
		
		//Let's make a NewBag called paper and set it to 4.
		NewBag paper = new NewBag(4);
		//
		
		//Let's make a NewBag called plastic and set it to 4.
		NewBag plastic = new NewBag(4);
		//
		
		//Let's print the capacities of our two bags
		System.out.println("--- Setting Max Objects (capacities) ---");
		System.out.println("The capacity of array 'paper' is " + paper.getMaxObjects());
		System.out.println("The capacity of array 'plastic' is " + plastic.getMaxObjects());
		System.out.println();
		
		//Now, let's add the objects we created earlier into our bags
		paper.add(pasta);
		paper.add(soupcans);
		paper.add(ramen);
		paper.add(milk);
		plastic.add(pasta);
		plastic.add(cerealbox);
		plastic.add(eggs);
		
		//Let's peek at the contents of both of our bags.
		System.out.println("--- Paper ---");
		System.out.println(paper);
		System.out.println("--- Plastic ---");
		System.out.println(plastic);
		System.out.println();
		
		//Let's make a NewBag to take in the union of neighborhood and block!
		System.out.println("--- Union Test ---");
		NewBag Union = new NewBag(10);
		Union = Union.union(paper, plastic);
		System.out.println(Union.toString());
		System.out.println();
		
		//Let's make a NewBag to take in the intersection of neighborhood and block!
		System.out.println("--- Intersection Test ---");
		NewBag Intersection = new NewBag(10);
		Intersection = Intersection.intersection(paper, plastic);
		System.out.println(Intersection.toString());
		System.out.println();
		
		//Let's make a NewBag to take in the difference of neighborhood and block!
		System.out.println("--- Difference Test ---");
		NewBag Difference = new NewBag(10);
		Difference = Difference.difference(paper, plastic);
		System.out.println(Difference.toString());
		System.out.println();
		
		}

}

/*
--- Setting Max Objects (capacities) ---
The capacity of array 'paper' is 4
The capacity of array 'plastic' is 4

--- Paper ---
Contents of Set [set=[Mac and Cheese, 9, 20, c]]
--- Plastic ---
Contents of Set [set=[Mac and Cheese, 2, 12, null]]

--- Union Test ---
Contents of Set [set=[20, c, Mac and Cheese, 2, 12, 9]]

--- Intersection Test ---
Contents of Set [set=[Mac and Cheese]]

--- Difference Test ---
Contents of Set [set=[20, c, 9]]


*/