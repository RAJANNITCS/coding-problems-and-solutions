package basics;


interface one {
	public void print_geek();
}

interface two {
	public void print_for();
}

interface three extends one, two{
	public void print_geek();
}

class Child implements three {
	
	public void print_for() {
		System.out.println("For");
	}
	
	@Override
	public void print_geek() {
		System.out.println("geeks");
	}
}

public class MultipleInheritence {
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.print_geek();
		c1.print_for();
		c1.print_geek();
	}

}
