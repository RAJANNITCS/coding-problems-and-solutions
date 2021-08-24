package basics;

interface PT1 {
	
	default void show() {
		System.out.println("Print pt1");
	}
}

interface PT2 {
	
	default void show() {
		System.out.println("Print pt2");
	}
}
  
public class DefaultMethod implements PT1, PT2{
	
	@Override
	public void show() {
		PT1.super.show();
		
		PT2.super.show();
	}
	
	public static void main(String[] args) {
		DefaultMethod d1 = new DefaultMethod();
		d1.show();
	}
}
