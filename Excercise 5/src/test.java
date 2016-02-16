
public class test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purse blackbag = new Purse(20, 30, 40, 50);
		System.out.println("Blackbag Analysis: " + blackbag.toString());
		//New purse arrived from Amazon.com today! Cheetahs are cool.
		Purse cheetahbag = new Purse(0, 0, 0, 0);
		cheetahbag.setPennies(20);
		cheetahbag.setNickles(30);
		cheetahbag.setDimes(40);
		cheetahbag.setQuarters(50);
		System.out.println("Cheetahbag Analysis: " + cheetahbag.toString());
		//Allowance obtained!
		cheetahbag.adNumCoinsOf(1, 10);
		cheetahbag.adNumCoinsOf(2, 15);
		cheetahbag.adNumCoinsOf(3, 20);
		cheetahbag.adNumCoinsOf(4, 20);
		System.out.println("Cheetahbag Analysis: " + cheetahbag.toString());
		
		
		
		
}
}