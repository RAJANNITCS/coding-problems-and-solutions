package basics;

class Car {
	int number;
	int model;
	
	Car(int data, int model) {
		this.number = data;
		this.model = model;
	}
	
	void print() {
		System.out.println("number = " + this.number + "model = " + this.model);
	}
}

class CarWrapper {
	Car c;
	
	CarWrapper(Car c) {
		this.c = c;
	}
}

class SwapMembers {
	
	public static void swap(CarWrapper c1, CarWrapper c2) {
		Car temp;
		temp = c1.c;
		c1.c = c2.c;
		c2.c = temp;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(1,2020);
		Car c2 = new Car(2,2021);
		
		CarWrapper cw1 = new CarWrapper(c1);
		CarWrapper cw2 = new CarWrapper(c2);
		
		
		swap(cw1, cw2);
		
//		System.out.println("car c1 =  " + c1.number);
//		System.out.println("car c2 = " + c2.number);
		
		cw1.c.print();
		cw2.c.print();
		
	}
}