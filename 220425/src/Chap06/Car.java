package Chap06;

public class Car {
	String color;
	String gearType;
	int door;
	
	
	Car(){
		//color = "white";
		//gearType = "auto";
		//door = 4;
		this("white", "auto", 4);
	}
	Car(String color) {
		this(color, "auto", 4);
		
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
