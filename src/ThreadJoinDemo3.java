/*if thread calls join() method on the same thread itself then the program will be 
 * stuck this is something like deadlock. In this case thread has to wait infinite 
 * amount of time.*/

public class ThreadJoinDemo3 {

	public static void main(String args[])throws InterruptedException{
		
		Thread.currentThread().join(); // Thread.currentThread() is main thread and 
		//main thread join itself it is deadlock like condition
	}
}
