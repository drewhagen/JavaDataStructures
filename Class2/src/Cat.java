
public class Cat {
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void hello(String a){
		a = "flappy";
		System.out.print(a);
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int add_age(Cat cat1)
	{
		return (this.age + cat1.age);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nick = "fatcat";
		Cat kitty = new Cat("Garfield", 10);
		Cat kitty2 = new Cat("Goobie", 5);
		System.out.println(kitty);
		System.out.println(kitty2);
		System.out.println(nick);
		kitty.hello(nick);
		System.out.println(nick);
		System.out.println(kitty2.add_age(kitty));
	}

}
