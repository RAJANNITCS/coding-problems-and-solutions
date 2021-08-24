package basics;

class Person {
	int age;
	String name;
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void personEat() {
		System.out.println(this.name + " is eating");
	}
	
	void personRun() {
		System.out.println(this.name + "is runing");
	}
}

class Devoloper extends Person {
	
	int id;
	
	Devoloper(int age, String name, int id) {
		super(age,name);
		this.id = id;
	}
	
	public void print() {
		System.out.println("id = " + this.id + " name " + this.name + "age" + this.age);
	}
}

class TeamLeader extends Devoloper {
	int id;
	
	TeamLeader(int age, String name, int id, int newId) {
		super(age, name, id);
		this.id = newId;
	}
	
	public void print() {
		System.out.println("id = " + this.id + " name " + this.name + "age" + this.age);
	}
}

public class LearnInheritance {
	
	public static void main(String [] args) {
		Devoloper d1 = new Devoloper(30, "rajan singh", 2019);
		d1.print();
		d1.personEat();
		TeamLeader t1 = new TeamLeader(31, "rajan singh", 2019, 2020);
		t1.print();
	}
}
