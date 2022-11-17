package book;

class TicketBook implements Runnable{
	int avl=1;
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name +" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name +"sorry no ticket");
		}
	}
}
public class BookingApp {

	public static void main(String[] args) {
		TicketBook tb1 = new TicketBook();			// avl = 1
		//TicketBook tb2 = new TicketBook();			// avl = 1
		//TicketBook tb3 = new TicketBook();			// avl = 1
		Thread t1 = new Thread(tb1);
		Thread t2 = new Thread(tb1);
		Thread t3 = new Thread(tb1);
		t1.setName("ajay");
		t2.setName("vijay");
		t3.setName("raj");
		t1.start();
		t2.start();
		t3.start();
	}

}
