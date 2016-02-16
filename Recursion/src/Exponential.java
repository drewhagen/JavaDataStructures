/*
 * Drew Hagen
 * Lab 5
 * Exercise 3
 */
public class Exponential {

	/*
	 * Recursive Method
	 * base^(positive exponent)
	 * @param base and exponent.
	 * @return result.
	 */
	public static int exponent_recur (int base, int exponent)
	{
		if /* n or m are negative*/ (exponent < 0) {
			/*return exponent_recur(base, exponent + 1)/base;*/
			System.out.println("Exponent can't be negative!");
			return -1;
		}
		else if (exponent == 0)
			return 1;
		else
			return (int) (base*exponent_recur(base, exponent - 1));
	}
	
	/*
	 * Iterative Method
	 * base^(positive exponent)
	 * @param base and exponent.
	 * @return result.
	 */
	public static int exponent_iter (int base, int exponent)
	{
		int result = 1;
		if /* n or m are negative*/ (exponent < 0) {
			/*int count = 0;
			while (count>exponent) {
				result = result / base;
				count++;
			}*/
			System.out.println("Exponent can't be negative!");
			return -1;
		}
		else if (exponent == 0) {
			return result;
		}
		else {
			int count = 0;
			while (count<exponent) {
				result = result * base;
				count++;
			}
			return result;
		}
	}
	
	//Tester
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exponent_recur(10, 3));
		System.out.println(exponent_recur(10, 0));
		System.out.println(exponent_recur(10, 1));
		System.out.println(exponent_iter(10, 3));
		System.out.println(exponent_iter(10, 0));
		System.out.println(exponent_iter(10, 1));
		System.out.println(exponent_recur(10, -2));
		System.out.println(exponent_iter(10, -2));
		/*
		 ===Results===
		1000
		1
		10
		1000
		1
		10
		Exponent can't be negative!
		-1
		Exponent can't be negative!
		-1
		 */
	}
	
}
