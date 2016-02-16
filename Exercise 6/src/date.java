
public class date {
	private int month;
	private int day;
	private int year;
	
	public date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String getMonth() {
		if (month== 1){
			return "Janurary ";
		}
		else if (month== 2){
			return "Feburary ";
		}
		else if (month== 3){
			return "March ";
		}
		else if (month== 4){
			return "April ";
		}
		else if (month== 5){
			return "May ";
		}
		else if (month== 6){
			return "June ";
		}
		else if (month== 7){
			return "July ";
		}
		else if (month== 8){
			return "August ";
		}
		else if (month== 9){
			return "September ";
		}
		else if (month== 10){
			return "October ";
		}
		else if (month== 11){
			return "November ";
		}
		else if (month== 12){
			return "December ";
		}
		else
			return "Invalid Month! ";
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "This date is " + getMonth() + " " + getDay() + ", " + getYear() + ".";
	}
	
	
}
