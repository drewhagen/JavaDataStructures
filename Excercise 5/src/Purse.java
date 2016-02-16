
public class Purse extends test{

// codes for user to select coin type
final int pen = 1;
final int nick = 2;
final int dim = 3;
final int quart = 4;

// quantity of each coin type
private int pennies;
private int nickles;
private int dimes;
private int quarters;

//constructor
public Purse(int pennies, int nickles, int dimes, int quarters) {
	super();
	this.pennies = pennies;
	this.nickles = nickles;
	this.dimes = dimes;
	this.quarters = quarters;
}

//setters and getters
public int getPennies() {
	return pennies;
}

public void setPennies(int pennies) {
	this.pennies = pennies;
}

public int getNickles() {
	return nickles;
}

public void setNickles(int nickles) {
	this.nickles = nickles;
}

public int getDimes() {
	return dimes;
}

public void setDimes(int dimes) {
	this.dimes = dimes;
}

public int getQuarters() {
	return quarters;
}

public void setQuarters(int quarters) {
	this.quarters = quarters;
}

//methods
public int getNumCoinsOf(int code) {
	if (code == pen) {
		return getPennies();
	}
	if (code == nick) {
		return getNickles();
	}
	if (code == dim) {
		return getDimes();
	}
	if (code == quart) {
		return getQuarters();
	}
	else {
		return 0;
	}
}

public void adNumCoinsOf(int code, int quantity){
	if (code == pen) {
		pennies = (pennies + quantity);
	}
	if (code == nick) {
	}
		nickles = (nickles + quantity);
	if (code == dim) {
	}
		dimes = (dimes + quantity);
	if (code == quart) {
		quarters = (quarters + quantity);
	}
	else {
	}
	}

public int totaNumCoins() {
	return (getPennies() + getNickles() + getDimes() + getQuarters());
}

public double totalValue(){
	int penval = 1;
	int nickval = 5;
	int dimval = 10;
	int quartval = 25;
	return ((getPennies() * penval) + (getNickles() * nickval) + (getDimes() * dimval) + (getQuarters() * quartval))/100;
}

@Override
public String toString() {
	return "Purse holds [pennies=" + pennies + ", nickles=" + nickles + ", dimes="
			+ dimes + ", quarters=" + quarters + "] adding to [coins=" + totaNumCoins() +
			"] worth [$" + totalValue() + "]";
}
}


