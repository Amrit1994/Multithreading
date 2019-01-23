//import java.util.*; 

class ThreadTest {
	private Thread t;
	private String threadName;


	ThreadTest(String name){
	 threadName = name;
	 System.out.println("Creating ......" +threadName);
 }
 
 public void run(){
	 
	 System.out.println("Running......." +threadName);
	 try{
		 
		 for(int i=4; i>0; i--){
			 
			 System.out.println("Thread:" + threadName + "," + i);
			 Thread.sleep(50);
		 }
	 }catch(InterruptedException e){
		 System.out.println("Thread: "+ threadName+ " interrupted");
	 }
	 System.out.println("Thread: " + threadName+ "exiting");
	 }
 
	
	public void start(){
		
		System.out.println("Thread: " + threadName+ "starting");
		if(t == null){
			t = new Thread (threadName);
			t.start();
		}
	}
 
}

public class RunnableDemo{
	public  static void  main(String args[]){
		ThreadTest t1 =new ThreadTest("Thread-1");
		t1.start();
		ThreadTest t2 = new ThreadTest("Thread-2");
		t2.start();
				
		
		
	}
	
	
}