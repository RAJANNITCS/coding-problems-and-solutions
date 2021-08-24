package basics;

abstract class Vehicle {
	int numberOfTyres;
	
	abstract void start();
}

class Car_1 extends Vehicle {
	private int numberOfTyres;
	
	public void start() {
		System.out.println("Car is start with " + this.numberOfTyres);
	}
	
	public void setNumberOfTyres(int data) {
		this.numberOfTyres = data;
	}
}

class Schooter extends Vehicle {
	private int numberOfTyres;
	
	public void start() {
		System.out.println("Schooter is start with " + this.numberOfTyres);
	}
	
	public void setNumberOfTyres(int data) {
		this.numberOfTyres = data;
	}
}

public class AbstractionLearning {
	
	public static void main(String[] args) {
		Schooter s1 = new Schooter();
		s1.setNumberOfTyres(2);
		s1.start();
	}
}
 