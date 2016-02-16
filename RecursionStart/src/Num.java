import java.util.Arrays;

public class Num {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int adder(int[] a)
	{
		if(a.length==0)
			return 0;
		else {
			return a[0] + Num.adder(Arrays.copyOfRange(a, 1, a.length-1));
		}
	}
	
	public static int fact(int num1)
	{
		if (num1 == 1)
			return 1;
		else
			return num1 * fact(num1 - 1);
	}
	
	public static int fib(int num1)
	{
		if (num1 == 0)
			return 0;
		else if (num1 == 1)
			return 1;
		else
			return fib(num1-1)+fib(num1-2);
	}
}