package basics;

class Person_4 {
	int age;
	String name;
	
	public Person_4(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void show() {
		System.out.println("name "+ this.name + "age" + this.age);
	}
}

class Developer extends Person_4 {
	int salary;
	
	public Developer(int age, String name, int salary) {
		super(age, name);
		this.salary = salary;
	}
}

public class ReleationSheepBetweenClass {

	public static void main(String[] args) {
		Developer d1 = new Developer(32, "rajan singh", 10000);
		d1.show();
	}
}
