
class MyThread extends Thread{
	@Override
	public void run() {
		mytask();
		
	}
	
	
	
	public void mytask(){
		System.out.println(" Welcome in Thread");
	}
}



public class ThreadFirstDemo {

	public static void main(String[] args) {
		MyThread thread1=new MyThread();
		thread1.start();

	}

}
