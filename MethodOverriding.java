class Bike {
	
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {				// re-usability 
	void color() {
		System.out.println("Gray");
	}
}
class Pulsar extends Bike {
	void speed() {					// override the code don't like 
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Black");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println("Red");
	}
	void speed() {
		super.speed();					// merge the code super class and its own code. 
		System.out.println("20km/hr");
	}
}
class MethodOverriding {
	public static void main(String args[]) {
	Honda hh = new Honda();		
	System.out.println("Honda bike details");
	hh.color();		
	hh.speed();
	Pulsar pu = new Pulsar();		
	System.out.println("Pulsar bike details");
	pu.color();		
	pu.speed();
	Tvs tv = new Tvs();
	System.out.println("Tvs bike details");
	tv.color();
	tv.speed();
	}
}
