package basics;

public class MethodOverloading {
	
	void show(String s1, int data) {
		System.out.println("test");
	}
	
	void show(int data, String s1) {
		System.out.println("test"+ data);
	}
	
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.main(20);
	}

	public static void main(int a) {
		System.out.println("2");
	}
}
  