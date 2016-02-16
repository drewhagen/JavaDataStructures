/* Drew Hagen
 * 
 * Exercise 4
 * 
 */
public class MyTemperature implements Temperature {
  private double celsius;  // stores temperature as a Celsius value

  public MyTemperature(double value, char scale) {
    if (scale=='C') setCelsius(value);
    if (scale== 'F') setFahrenheit(value);
    if (scale== 'K') setKelvin(value);
    else setCelsius(value); //We can set Celsius as the default input this once.
  }

  public double getCelsius() {
    return celsius;
  }

  public double getFahrenheit() {
    return 9*celsius/5 + 32.0;
  }
  
  public double getKelvin(){
	 return celsius + 273.15;
  }
  
  public void setCelsius(double celsius) {
    this.celsius = celsius;
  }

  public void setFahrenheit(double fahrenheit) {
    this.celsius = 5*(fahrenheit - 32)/9;
  }
  
  public void setKelvin(double kelvin) {
	this.celsius = kelvin - 273.15;
  }

  public String toString() {
    // Example: "25.0 C = 77.0 F = 298.15 K"
    return round(getCelsius())+ " C = " + round(getFahrenheit())+ " F = " + round(getKelvin()) + " K"; 
  }

  private static double round(double x) {
    // returns x, rounded to one digit on the right of the decimal:
    return Math.round(10*x)/10.0;
  }
}
