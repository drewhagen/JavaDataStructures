/* Drew Hagen
 * 
 * Excercise 4
 *
 */
public class Convert {
    public static void main(String[] args) {
        if (args.length!=2) exit();
        double value = Double.parseDouble(args[0]);  // convert string
        char scale = Character.toUpperCase(args[1].charAt(0));
        if (scale!='C' && scale!='F' && scale!= 'K') exit();
        Temperature temperature = new MyTemperature(value,scale);
        System.out.println(temperature);
    }

    private static void exit() {
    // prints usage message and then terminates the program:
        System.out.println(
  	    "Usage: java Convert <temperature> <scale>"
          + "\nwhere:"
          + "\t<temperature> is the temperature that you want to convert"
          + "\n\t<scale> is either \"C\", \"F\" or \"K\"."
          + "\nExample: java Convert 267 K"
        );
        System.exit(0);
    }
}