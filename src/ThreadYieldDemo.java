 class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++){
			System.out.println("child thread");
			Thread.yield(); // child thread yield, get chance to main thread is high. if
			// we are commenting yield() method both thread execute simultaneously
		}
	}
	
}
public class ThreadYieldDemo {
	
	public static void main(String []args){
		
		MyThread t = new MyThread();
		t.start();
		for(int i=0; i<10; i++){
			System.out.println("Main thread-");
		}
	}

}
