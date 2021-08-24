package basics;

class Test_1 {
	int number1;
	int number2;
	
	Test_1(){
		this(10, 20);
		System.out.println("Test default constructer");
	}
	
	Test_1(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
		System.out.println("Test parametraezed constructer");
	}
}

public class InvokeCurrentClass {
	public static void main(String[] args) {
		Test_1 t1 = new Test_1();
		System.out.println(t1.number1);
	}
}
