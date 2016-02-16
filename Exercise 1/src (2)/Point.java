/**
 * A point on an two dimensional field.
 * (Lab 2, Exercise 1)
 * @author Drew Hagen
 */
public class Point {
/**
 * X-axis coordinate
 */
private double x;
/**
 * Y-axis coordinate
 */
private double y;

/**
 * The constructor to point which takes in the coordinates that specify its location on the graph / 2D field.
 * @param x coordinate / position in relation to x axis
 * @param y coordinate / position in relation to y axis
 */
public Point(double x, double y) {
	this.x = x;
	this.y = y;
}

/**
 * Method that gives you the x coordinate of your point
 * @return x coordinate
 */
public double getX() {
	return x;
}

/**
 * Method that lets you reset / move the x coordinate of your point
 * @param new x coordinate for Point.
 */
public void setX(double x) {
	this.x = x;
}

/**
 * Method that gives you the y coordinate of your point
 * @return y coordinate
 */
public double getY() {
	return y;
}

/**
 * Method that lets you reset / move the y coordinate of your point
 * @param new y coordinate for Point.
 */
public void setY(double y) {
	this.y = y;
}

/**
 * Method that lets you reset both coordinates of your point / reposition the point freely.
 * @param new x coordinate
 * @param new y coordinate
 */
public void moveTo(double x, double y) {
	this.x = x;
	this.y = y;
}

/**
 * toString Method that allows display of our Point's location.
 */
@Override
public String toString() {
	return "Point is ("+ x + ", "+ y + ")";
}

}
