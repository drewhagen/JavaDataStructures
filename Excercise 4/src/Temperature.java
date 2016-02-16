/** Drew Hagen
 * 
 * Exercise 4
 * 
 *  An interface for representing temperatures, with functionality
 *  for converting their values between Celsius and Fahrenheit.
 *  @author  John R. Hubbard
 *  @see     MyTemperature
 */

public interface Temperature {
    /**    @return    the Celsius value for this temperature.    */ 
    public double getCelsius();

    /**    @return    the Fahrenheit value for this temperature.    */ 
    public double getFahrenheit();

    /**    @return    the Kelvin value for this temperature.    */ 
    public double getKelvin();

    /**    @param    celsius    the Celsius value for this temperature.    */
    public void setCelsius(double celsius);
    
    /**    @param    fahrenheit    the Fahrenheit value for this temperature.*/
    public void setFahrenheit(double fahrenheit);
    
    /**    @param    kelvin    the Kelvin value for this temperature.*/
    public void setKelvin(double kelvin);
}
