
class ThreadDemo extends Thread{
	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		System.out.println("Name "+Thread.currentThread());
		mytask(name);
		
	}
	
	
	
	public void mytask(String nm){
		System.out.println(" Welcome in Thread ::"+nm);
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		ThreadDemo thread1=new ThreadDemo();
		thread1.start();
		thread1.setName("Bhushan");
		
		ThreadDemo thread2=new ThreadDemo();
		thread2.start();
		thread2.setName("Amol");
	}

}
