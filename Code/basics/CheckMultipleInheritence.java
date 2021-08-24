package basics;

class one_1 {
	
	public void fun() {
		System.out.println("print one");
	}
	
}

class two_2 {
	
	public void fun() {
		System.out.println("print two");
	}
}

class CheckMultipleInheritence extends one_1{
	 public static void main(String[] args) {
		 CheckMultipleInheritence c1 = new CheckMultipleInheritence();
		 c1.fun();
	 }
}
