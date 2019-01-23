// child thread waits until completing main thread.

class MyThread2 extends Thread
{
	 static Thread mt;
 public void run()
 {
	 try{
	 mt.join();    // when main thread completes then child thread join main thread
	 }catch(InterruptedException e){}
	 for(int i=0; i<10; i++){
		 System.out.println("Child Thread");
	 }
 }
}
public class ThreadJoinDemo1 {
	public static void main(String []args) throws InterruptedException{
		 MyThread2.mt = Thread.currentThread(); // main thread assign in MyThread2
		 MyThread2 t = new MyThread2();
		 t.start(); // Main thread start
		 for(int i=0; i<10; i++){
			 System.out.println("Main Thread");
			 Thread.sleep(2000);
	}

}
}