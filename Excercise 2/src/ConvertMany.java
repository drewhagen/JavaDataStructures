public class ConvertMany {

	/**
	 * @param args
	 */
	
	//all variables into main will be integers. Converting from Strings would be redundant.
	public static void main(int[] args) {
		// TODO Auto-generated method stub
		double minimum = args[0];
		double maximum = args[1];
		int increment = args[2];
		
		double value = minimum;
		while (value < maximum){
			value = value + increment;
			
			Temperature temperature = new MyTemperature(value, 'C');
	        System.out.println(temperature);
		}
		if (args.length!=3) exit();
		if (increment < 1) exit();
		if (increment < (maximum - minimum)) highIncrement();
}
    private static void exit() {
    // prints usage message and then terminates the program:
    	System.out.println(
  	    "Usage: java  <min temperature> <max temperature> <scale of temperatures>"
          + "\nwhere:"
          + "\t<min temperature> is the minimum temperature in C that you want converted to F"
          + "\n\t<max temperature> is the maximum temperature in C you want converted to F."
          + "\n\t<scale of temperatures> is the increment of numbers between the minimum and maximum you want converted."
          + "\nExample: java 0 20 4"
        );
        System.exit(0);
    }
    private static void highIncrement() {
        // warns user that the increment exceeds the range of temperatures to be converted.
        	System.out.println("The increment value is too high!");
        	System.out.println("Please enter an increment that follows the rule:" +
        			"\n\t increment < max temperature - min temperature");
        	System.exit(0);
        }
}