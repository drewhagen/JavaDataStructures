/**
 * An extension of Set, with the ability to store the results of a relationship between two sets.
 * @author Drew Hagen
 * (Lab 2 Exercise 4)
 * Data Structures, Shana Watters.
 */
public class NewBag extends Set implements Bag{


public NewBag(int maxObjects) {
	super(maxObjects);
}

/**
 * Method that takes the results of a union between two bags
 * @param the two bag object arrays: NewBag b1, NewBag b2
 * @return one bag that holds the result of the union and the maxObjects equal to the size (no nulls).
 */
public NewBag union(NewBag b1, NewBag b2) {
	int newCap = (b1.getMaxObjects() + b2.getMaxObjects());
	NewBag b3 = new NewBag(newCap);
	for(int i= 0; i < b1.getMaxObjects(); i++) {
		b3.add(b1.getNext());
		}
	for (int k= b1.getMaxObjects(); k < newCap; k++) {
		if (b3.contains(b2.getNext()) == false)
		b3.add(b2.getThis());
	}
	NewBag unionb = new NewBag(b3.size());
	for(int j= 0; j < b3.getMaxObjects(); j++)
		unionb.add(b3.getNext());
	return unionb;
}

/**
 * Method that takes the results of an intersection between two bags
 * @param the two bag object arrays: NewBag b1, NewBag b2
 * @return one bag that holds the result of the intersection and the maxObjects equal to the size (no nulls).
 */
public NewBag intersection(NewBag b1, NewBag b2) {
	int newCap = (b1.getMaxObjects() + b2.getMaxObjects());
	NewBag b3= new NewBag(newCap);
	for(int i= 0; i < b1.getMaxObjects(); i++) {
		if (b1.contains(b2.getNext()) == true) {
			b3.add(b2.getThis());
		}
	}
	NewBag interb = new NewBag(b3.size());
	for(int j= 0; j < b3.getMaxObjects(); j++)
		interb.add(b3.getNext());
	return interb;
	}

/**
 * Method that takes the results of a difference between two bags
 * @param the two bag object arrays: NewBag b1, NewBag b2
 * @return one bag that holds the result of the difference and the maxObjects equal to the size (no nulls).
 */
public NewBag difference(NewBag b1, NewBag b2) {
	int newCap = b1.getMaxObjects() + b2.getMaxObjects();
	NewBag b3 = new NewBag(newCap);
	for(int i= 0; i < b1.getMaxObjects(); i++) {
		b3.add(b1.getNext());
		}
	for(int i= 0; i < b1.getMaxObjects(); i++) {
		b3.remove(b2.getNext());
	}
	NewBag difb = new NewBag(b3.size());
	for(int j= 0; j < b3.getMaxObjects(); j++)
		difb.add(b3.getNext());
	return difb;
	}
}


