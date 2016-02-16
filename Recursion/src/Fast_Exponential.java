
public class Fast_Exponential {

	/*
	 * Fast Exponential Method
	 * base^(positive exponent)
	 * uses b^n = (b^(n/2))^2 if n is even
	 * uses b^n = b * b^(n-1) if n is odd
	 * @param base and exponent.
	 * @return result.
	 */
	public static int fast_exp (int base, int exponent)
	{
		double result = base;
		if /* base or exponent are negative*/ (exponent < 0)
		{
			System.out.println("Exponent can't be negative!");
		}
		else if(exponent % 2 == 0)
		{
			result = Math.pow(base,exponent/2);
			result = Math.pow(result, 2);
		}
		else if(exponent % 2 != 0)
		{
			result = base * Math.pow(base,exponent-1);
		}
		return (int) result;
	}
	//Tester
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fast_exp(1, 1));
		System.out.println(fast_exp(2, 4));
		System.out.println(fast_exp(5, 2));
		System.out.println(fast_exp(10, 3));
		System.out.println(fast_exp(3, 10));
		System.out.println(fast_exp(-2, 8));
		System.out.println(fast_exp(8, -2));
		/*
		 ===Results===
		1
		16
		25
		1000
		59049
		256
		Exponent can't be negative!
		-1
		 */
	}
}
