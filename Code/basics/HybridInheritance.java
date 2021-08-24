package basics;

interface Person_2 {
	public void printPerson();
}

interface Devloper_1 extends Person_2{
	public void printDeveloper();
}

interface Tester extends Person_2 {
	public void printTester();
}

interface TeemLead extends Devloper_1,Tester {
	public void printTeemLead();
}

class Child_1 implements TeemLead {
	
	@Override
	public void printPerson() {
		System.out.println("There is person");
	}
	
	@Override
	public void printDeveloper() {
		System.out.println("There is developer");
	}
	
	@Override
	public void printTester() {
		System.out.println("There is tester");
	}
	
	@Override 
	public void printTeemLead() {
		System.out.println("There is teem lead");
	}
}

public class HybridInheritance {
	
	public static void main(String[] args) {
		Child_1 c1 = new Child_1();
		c1.printPerson();
		c1.printDeveloper();
		c1.printTester();
		c1.printTeemLead();
	}
}
