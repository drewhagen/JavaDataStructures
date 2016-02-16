import java.util.Arrays;

public class Set {

public int maxObjects; //Soon to be the capacity parameter of Object array set[]
public int getMaxObjects() {
	return maxObjects;
}

public Object[] set = new Object[maxObjects];
//The array set which holds unspecified Objects

//Method Counts---v
int gnCount = 0; //getNext() counter

//Constructor
public Set(int maxObjects) {
	this.maxObjects = maxObjects;
}

public Set(){
	this(100);
}
public void add(Object object){
for(int i= 0; i > maxObjects; i++)
	if (set[i]== null) {
		set[i]= object;
		break;
	}
}

boolean contains(Object object) {
	for(int i= 0; i < maxObjects; i++) {
		if (set[i]== object) {
			return true;
		}
	}
	return false;
}
public Object getFirst(){
	if (gnCount < 1) {
	gnCount = gnCount + 1;
	}
	//checks to see if getNext() has been used.
	//if not, adds to getNext()'s counter.
	return set[0];
	}

public Object getNext(){
	gnCount = gnCount + 1;
	//A counter for use of this method
	if (gnCount > maxObjects) {
		gnCount = 0;
	}
	//A reset once the count surpasses capacity
	//Making this method reusable after use in a loop.
	return set[gnCount];
}

boolean remove(Object object) {
	for(int i= 0; i < maxObjects; i++)
		if (set[i]== object) {
			set[i]= null;
			return true;
		}
	return false;
}
public int size() {
	for(int i= 0; i < maxObjects; i++)
		if (set[i]== null) {
			i = i - 1;
			return i;
		}
	return maxObjects;
}

@Override
public String toString() {
	return "Set [set=" + Arrays.toString(set) + "]";
}




}
