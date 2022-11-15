package abc;
class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name +" "+i);
			try {
			Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
	}
}
public class TaskInfo {

	public static void main(String[] args) {
		Task tt = new Task();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		Thread t3 = new Thread(tt);
		Thread t4 = new Thread(tt);
		t1.setName("Ravi");
		t2.setName("Ajay");
		t3.setName("Lokesh");
		t4.setName("Seeta");
		t1.start();t2.start();t3.start();t4.start();
	}

}
