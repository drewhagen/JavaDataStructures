import java.util.Arrays;

/**
 * (Lab Exercise 4)
 * Creating a set of Objects
 * @author Drew Hagen
 */
public class Set {

/**
 * Soon to be the capacity parameter of Object array set[]
 */
private int maxObjects;

/**
 * The array set which holds unspecified Objects
 */
public Object[] set;

/**
 * Counter for use primarily with getNext(), but also, getFirst()
 */
int gNCount = 0;

/**
 * Obtains the private int maxObjects from above, while allowing the integer to remain secure to the Set class
 * @return capacity of the array, int maxObjects
 */
public int getMaxObjects() {
	return maxObjects;
}

/**
 * allows us to reset the maxObjects, capacity
 * @param new maxObjects / capacity
 */
public void setMaxObjects(int maxObjects) {
	this.maxObjects = maxObjects;
}

/**
 * The Constructor, allows us to create an object of this class and set the capacity of its array
 * @param maxObjects
 */
public Set(int maxObjects) {
	this.maxObjects = maxObjects;
	set = new Object[maxObjects];
}

/**
 * An alternate constructor with no parameters that defaults the capacity of the array to 4.
 */
public Set(){
	this(4);
}

/**
 * Adds an element to our array
 * @param an object we want to add to the array
 */
public void add(Object object){
for(int i= 0; i < maxObjects; i++)
	if (set[i]== null) {
		set[i]= object;
		break;
	}
}

/**
 * Method that tells us if an object exists as a element in the array
 * @param object we are trying to see if is contained
 * @return boolean, true if contained, false if not.
 */
boolean contains(Object object) {
	for(int i= 0; i < maxObjects; i++) {
		if (set[i]== object) {
			return true;
		}
	}
	return false;
}

/**
 * Method that tells us the first value of the array.
 * @return first element in the array: set[0]
 */
public Object getFirst(){
	if (gNCount < 1) {
	gNCount = gNCount + 1;
	}
	//checks to see if getNext() has been used.
	//if not, adds to getNext()'s counter.
	return set[0];
	}

/**
 * Method that tells us the next value in the array. We use a counter of times this method and getFirst()
 * ran to keep track of what's the "next" value.
 * @return next element in the array: set[gNCount]
 */
public Object getNext(){
	gNCount = gNCount + 1;
	//A counter for use of this method
	if (gNCount == maxObjects) {
		gNCount = 0;
	}
	//A reset once the count surpasses capacity
	//Making this method reusable after use in a loop.
	return set[gNCount];
}

public Object getThis(){
	return set[gNCount];
}

/**
 * Method that removes a given object in an array or tells us it ceases to exist within the array.
 * @param any one object
 * @return true, if the object was found and deleted, and false, if the object wasn't in the array.
 */
boolean remove(Object object) {
	for(int i= 0; i < maxObjects; i++)
		if (set[i]== object) {
			set[i]= null;
			return true;
		}
	return false;
}

/**
 * Method that returns the size of the array: how many objects there are in the array.
 * @return int value of how many (non-null) objects are in the array.
 */
public int size() {
	int sz=0;
	for(int i= 0; i < maxObjects; i++)
		if (set[i]!= null) {
			sz= sz + 1;
		}
	return sz;
}

/**
 * toString that helps us see what's in the array, and what's going on with it as we use
 * our methods.
 */
@Override
public String toString() {
	return "Contents of Set [set=" + Arrays.toString(set) + "]";
}

}
