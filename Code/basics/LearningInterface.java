package basics;

interface Vehicle_1 {
	
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes();
	default void show(int speed, int gear) {
		System.out.println("speed"+ speed + "gear" + gear);
	}
	
	static void show_1(int speed, int gear) {
		System.out.println("speed"+ speed + "gear" + gear);
	}
	
}

public class LearningInterface implements Vehicle_1 {
	
	int speed;
	int gear;
	
	@Override
	public void changeGear(int a) {
		this.gear = a;
	}
	
	@Override
	public void speedUp(int a) {
		this.speed = a;
	}
	
	@Override
	public void applyBrakes() {
		System.out.println("Your bicycle are stop a speed"+ this.speed + "and gear"+ this.gear);
	}
	public static void main(String[] args) {
		LearningInterface b1 = new LearningInterface();
		b1.changeGear(4);
		b1.speedUp(5);
//		b1.applyBrakes();
//		b1.show(b1.speed, b1.gear);
		Vehicle_1.show_1(b1.speed, b1.gear);
		
	}
}
