package abcd;
class Task implements Runnable {
	@Override
	public  synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(name+" "+i);
				if(i==5 && name.equals("Raj")) {
					wait();
				}
				if(i==4 && name.equals("Ramesh")) {
					//notify();
					wait();
				}
				if(i==8 && name.equals("Ravi")) {
					notifyAll();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class WaitAndNotifyExample {
	public static void main(String[] args) {
		Task tt = new Task();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		Thread t3 = new Thread(tt);
		t1.setName("Raj");
		t2.setName("Ravi");
		t3.setName("Ramesh");
		t1.start();
		t2.start();
		t3.start();
	}

}
