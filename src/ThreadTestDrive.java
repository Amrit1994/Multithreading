class MyRunnable implements Runnable{
	
	public void run(){
		go();
	}
	public void go(){
		
		doMore();
	}
	
	public void doMore(){
		
		System.out.println("top o' the stack");
	}

}

public class ThreadTestDrive {
public static void main(String [] args){
		
		Runnable threadjob = new MyRunnable();
		Thread myThread  = new Thread(threadjob);
		myThread.start();
		System.out.println(" back in main");
	}
}



