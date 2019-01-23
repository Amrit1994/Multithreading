class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Sita Thread-");// this line executed by child thread
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}
	}
}
public class ThreadJoinDemo {
	public static void main(String [] args) throws InterruptedException{
		
		MyThread1 t = new MyThread1();
		t.start(); // always start child thread
		t.join(); // child thread join main thread
		for(int i=0; i<10; i++){
			System.out.println("Ram Thread-");   // this line executed by main thread
			Thread.sleep(2000);
		}
	}

}
