package basics;

class Person_1 {
	int age;
	String name;
	
	Person_1(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class FrontendDev extends Person_1{
	String typeOfDev;
	
	FrontendDev(int age, String name, String typeOfDev) {
		super(age, name);
		this.typeOfDev = typeOfDev;
	}
	
	public void print() {
		System.out.println(" name " + this.name + " age " + this.age + " type " + this.typeOfDev);
	}
}

class BackendDev extends Person_1 {
	String typeOfDev;
	
	BackendDev(int age, String name, String typeOfDev) {
		super(age, name);
		this.typeOfDev = typeOfDev;
	}
	
	public void print() {
		System.out.println(" name " + this.name + " age " + this.age + " type " + this.typeOfDev);
	}
	
}

public class HierarchicalInheritance {
	
	public static void main(String[] args) { 
		FrontendDev f1 = new FrontendDev(24, "rohan", "Frontend developer");
		BackendDev b1 = new BackendDev(30, "rajan singh", "backend developer");
		f1.print();
		b1.print();
	}
}
