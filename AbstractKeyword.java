abstract class Bike {
			abstract void speed();
}
abstract class Honda extends Bike{				
	void color() {
		System.out.println("Gray");
	}	
}
class Activa extends Honda {
	void speed() {
		System.out.println("70km/hr");
	}
}
class	Pulsar extends Bike {				
	void color() {
		System.out.println("Black");
	}
	void speed() {
		System.out.println("90km/hr");
	}
}
class AbstractKeyword {
	public static void main(String args[]) {
	Pulsar pu = new Pulsar();	
	pu.speed();
	//Honda hh = new Honda();	
	//hh.speed();	
	Activa ac =new Activa();
	ac.speed();
	}
}
