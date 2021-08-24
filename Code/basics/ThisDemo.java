package basics;

public class ThisDemo {
	
	ThisDemo show() {
		return this;
	}

	public static void main(String[] args) {
		ThisDemo d1 = new ThisDemo();
		d1.show();
	}
}
