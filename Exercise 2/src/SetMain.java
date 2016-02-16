/*
 * Drew Hagen
 * Lab 2 Exercise 2
 */
public class SetMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Let's create some objects.
		String sign = "No Silicitors!";
		int pets = 7;
		int recycle = 18;
		char suburban = 's';
		boolean nearCity = true;
		Object fireHydrant = 2;
		int population = 30;
		//
		
		//Let's make a set called neighborhood and set it to 4.
		Set neighborhood = new Set(2);
		//
		
		//Let's make a set called block, and see what happens by default, when we don't provide an argument.
		Set block = new Set();
		//
		
		//Let's print the results of our last two tasks.
		System.out.println("--- Setting Max Objects (capacities) ---");
		System.out.println("The capacity of array 'neighborhood' is " + neighborhood.getMaxObjects());
		System.out.println("The capacity of array 'block' is " + block.getMaxObjects());
		
		//
		
		//Now, let's add the objects we created earlier to neighborhood.
		neighborhood.add(sign);
		neighborhood.add(pets);
		neighborhood.add(recycle);
		neighborhood.add(suburban);
		neighborhood.add(nearCity);
		neighborhood.add(fireHydrant);
		neighborhood.add(population);
		// (Yes, since the capacity is 4, some won't make it in)
		
		//Let's check to see what's in our array! We have 3 ways to do this--
			//We use the 'contains' method.
		System.out.println();
		System.out.println("---Test Results for contains() method---");
		System.out.println("sign: " + neighborhood.contains(sign));
		System.out.println("pets: " + neighborhood.contains(pets));
		System.out.println("recycle: " + neighborhood.contains(recycle));
		System.out.println("suburban: " + neighborhood.contains(suburban));
		System.out.println("nearCity: " + neighborhood.contains(nearCity));
		System.out.println("fireHydrant: " + neighborhood.contains(fireHydrant));
		System.out.println("population: " + neighborhood.contains(population));
		System.out.println();
			//We use the getFirst() and getNext() methods.
		for(int i = 0; i > neighborhood.getMaxObjects(); i++) {
			if (i == 0) {
				System.out.println(neighborhood.getFirst());
				}
			else
				System.out.println(neighborhood.getNext());
			}
			//Finally, we can print off the toString
		System.out.println(neighborhood);
		System.out.println();
		//

		//Okay, so now let's remove our objects. And while we are at it, check how many objects are in the array.
		System.out.println("--- Test on recalling array's size ---");
		neighborhood.remove(population); //even when population should not be in array, I'll test this.
		System.out.println(neighborhood + " With a size of " + neighborhood.size());
		neighborhood.remove(suburban);
		System.out.println(neighborhood + " With a size of " + neighborhood.size());
		neighborhood.remove(recycle);
		System.out.println(neighborhood + " With a size of " + neighborhood.size());
		neighborhood.remove(pets);
		System.out.println(neighborhood + " With a size of " + neighborhood.size());
		neighborhood.remove(sign);
		System.out.println(neighborhood + " With a size of " + neighborhood.size());
		//
		
		//Let's do another test on our Size() method to confirm that it works regardless of where nulls are in set[].
		neighborhood.add(suburban);
		neighborhood.add(nearCity);
		neighborhood.add(fireHydrant);
		neighborhood.add(fireHydrant);
		neighborhood.add(population);
		neighborhood.remove(suburban);
		neighborhood.remove(fireHydrant);
		System.out.println(neighborhood + " With a size of " + neighborhood.size());
		
		}

	}

/* ========= TEST RESULTS =========
--- Setting Max Objects (capacities) ---
The capacity of array 'neighborhood' is 4
The capacity of array 'block' is 4

---Test Results for contains() method---
sign: true
pets: true
recycle: true
suburban: true
nearCity: false
fireHydrant: false
population: false

Contents of Set [set=[No Silicitors!, 7, 18, s]]

--- Test on recalling array's size ---
Contents of Set [set=[No Silicitors!, 7, 18, s]] With a size of 4
Contents of Set [set=[No Silicitors!, 7, 18, null]] With a size of 3
Contents of Set [set=[No Silicitors!, 7, null, null]] With a size of 2
Contents of Set [set=[No Silicitors!, null, null, null]] With a size of 1
Contents of Set [set=[null, null, null, null]] With a size of 0
Contents of Set [set=[null, true, null, 30]] With a size of 2
 */
