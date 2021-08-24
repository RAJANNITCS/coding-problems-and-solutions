package basics;

class Test {
	public int show() {
		System.out.println("Test method call");
		return 0;
	}
}

class Child_2 extends Test {
	 
	public int show() {
		System.out.println("clild class call");
		return 0;
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		Child_2 c1 = new Child_2();
		c1.show(); 
	}
	
}
 