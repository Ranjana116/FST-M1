package Activities;

public class Car {
String color;
String transmission;
int makeyear;
int tyres=4;
int doors=4;
	
	public Car(String color, String transmission, int makeyear) {
		// TODO Auto-generated constructor stub
		this.makeyear=makeyear;
		this.color=color;
		this.transmission=transmission;
	}
	public void displayCharacteristics() {
		System.out.println("Doors" + doors);
		System.out.println("Tyres" + tyres);
		System.out.println("Color of car is " + color);
		System.out.println("Car's Transmission is " + transmission);
	}
	public void accelarate() {
		System.out.println("Car is moving forward." );
	
	}
	public void brake()  {
		System.out.println("Car has stopped." );
	
	}
	
}

