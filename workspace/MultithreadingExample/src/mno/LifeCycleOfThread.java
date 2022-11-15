package mno;
class A implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		//System.out.println(t);
		String name = t.getName();
		System.out.println(name);
	}
}
class B implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		//System.out.println(t);
		System.out.println(name);
	}
}
public class LifeCycleOfThread {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		Thread t = Thread.currentThread();
		System.out.println(t);
		Thread t1 = new Thread(obj1);
		Thread t2 =  new Thread(obj2);
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t1.setName("Ravi thread");
		t2.setName("Raj thread");
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
