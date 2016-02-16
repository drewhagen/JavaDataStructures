
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point red = new Point(3,5);
		Point yellow = new Point (0,0);
		
		//Let's print an existing point
		System.out.println("--- Initial locations of points ---");
		System.out.println("Red " + red.toString());
		
		//Let's reset a location for a point.
		yellow.setX(4);
		yellow.setY(4);
		System.out.println("Yellow "+ yellow.toString());
		System.out.println();
		
		//Let's move yellow to meet up with red.
		yellow.moveTo(red.getX(), red.getY());
		System.out.println("--- When yellow went to meet red ---");
		System.out.println("Yellow's new " + yellow.toString());
	}
}

/*
--- Initial locations of points ---
Red Point is (3.0, 5.0)
Yellow Point is (4.0, 4.0)

--- When yellow went to meet red ---
Yellow's new Point is (3.0, 5.0)
 */
