import java.util.Scanner;

public class ConvertMany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minimum;
		double maximum;
		double increment;
		//Making the program more robust: working with an insufficient number of parameters
		if (args.length!= 3) {
				Scanner min = new Scanner(System.in);
			    System.out.println("What is your minimum temperature to convert?");
			    minimum = min.nextInt();
			    Scanner max = new Scanner(System.in);
			    System.out.println("What is your maximum temperature to convert?");
			    maximum = max.nextInt();
			    Scanner inc = new Scanner(System.in);
			    System.out.println("What is the increment the temperatures should convert?");
			    increment = inc.nextInt();
				}
		else{
		minimum = Double.parseDouble(args[0]); //convert arg parameters from Strings to doubles.
		maximum = Double.parseDouble(args[1]);
		increment = Double.parseDouble(args[2]);
		}
		
		if (increment <= 0) {
			invalidIncrement();
		}
		if (increment >= (maximum - minimum)) {
			invalidIncrement();
		}
		else {
			double value = minimum;
			while (value < maximum){
				value = value + increment;
				
				Temperature temperature = new MyTemperature(value, 'C');
		        System.out.println(temperature);
			}
		}
}

    
    private static void invalidIncrement() {
        // warns user that the increment exceeds the range of temperatures to be converted.
        	System.out.println("The increment value is invalid!");
        	System.out.println("Please enter an increment that follows the rule:" +
        			"\n increment is a positive value, and is < max temperature - min temperature");
        	System.exit(0);
        }
}