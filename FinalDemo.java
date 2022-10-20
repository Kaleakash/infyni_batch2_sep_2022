final class Bike {
	final void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	/*void speed() {
		System.out.println("50km/hr");
	}*/
}
class FinalDemo {
	public static void main(String args[]) {
	int a=10;
	a=20;
	final int B=20;
	//B =30;
	System.out.println(a);
	System.out.println(B);
	Honda hh = new Honda();
	hh.speed();
	}
}