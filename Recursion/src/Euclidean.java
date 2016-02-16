/*
 * Drew Hagen
 * Lab 5
 * Exercise 5
 */
public class Euclidean {

/*
* Euclidean Algorithm
* GCD(m,n) = GCD(n, (divisor) d)
* @param m larger value, and n smaller value.
* @return result m after several iterations.
*/	
public static int euclidean_iter(int m, int n) {
		int result;
		
		if /* n or m are negative*/ (n<0 | m<0)
		{
			System.out.println("The divisors can't be negative!");
			return -1;
		}
		if (m==0)
		{
			System.out.println("The greater divisor can't be 0. Can't /0!");
			return -1;
		}
		while (n!=0) 
		{
		    result = m % n;
		    m = n;
		    n = result;
		}
		return m;
	}
	
/*
* Euclidean Algorithm
* GCD(m,n) = GCD(n, (divisor) d)
* @param m larger value, and n smaller value.
* @return result after several recursions
*/
public static int euclidean_recur(int m, int n) {
	    
		if (n==0) 
		{
	        return m;
	    }
		if (m==0)
		{
			System.out.println("The greater divisor can't be 0. Can't /0!");
			return -1;
		}
		else if /* n or m are negative*/ (n<0 | m<0)
		{
			System.out.println("The divisors can't be negative!");
			return -1;
		}
		else
			return euclidean_recur(n, (m % n));
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(euclidean_iter(206, 40));
	System.out.println(euclidean_iter(2, 0));
	System.out.println(euclidean_iter(0, 2));
	System.out.println(euclidean_iter(-30, -3));
	System.out.println(euclidean_recur(206, 40));
	System.out.println(euclidean_recur(0, 8));
	System.out.println(euclidean_recur(8, 0));
	System.out.println(euclidean_recur(-4, -2));
	/*
	 ===Results===
	2
	2
	The greater divisor can't be 0. Can't /0!
	-1
	The divisors can't be negative!
	-1
	2
	The greater divisor can't be 0. Can't /0!
	-1
	8
	The divisors can't be negative!
	-1

	 */
	}
}
