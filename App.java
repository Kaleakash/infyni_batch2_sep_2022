class App {
	public static void main(String args[]) {
	Car ertiga = new Car();
	//ertiga.wheel = 4;
	//ertiga.color = "Gray";
	//ertiga.price = 1400000;
	ertiga.setCarDetails(4,"Gray",1400000);
	ertiga.carDetails("Ertiga Car Details");
	
	Car innova = new Car();
	innova.wheel = 4;
	innova.color = "White";
	innova.price = 2200000;
	innova.carDetails("Innova Car Details");
	}
}
class Car {
	int wheel;
	double price;
	String color;
	/*void setCarDetails(int wheel1, String color1, float price1){
		wheel = wheel1;
		color = color1;
		price  = price1;
	}*/
	void setCarDetails(int wheel, String color, float price){
		this.wheel = wheel;
		this.color = color;
		this.price  = price;
	}
	void carDetails(String name) {
		System.out.println(name);
		System.out.println("Wheel "+wheel);
		System.out.println("Price "+price);
		System.out.println("Color "+color);	
	}	
	
}
