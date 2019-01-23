/* If main thread calls join() method on child thread object and child thread calls
 *  join() methods on main thread object then both threads will wait forever and the
 *   program will be stuck(this is something like deadlock).*/


class MyThread3 extends Thread{
	
	static Thread mt;
	public void run(){
		try{
			mt.join();
		}catch(InterruptedException e){}
		for(int i=0; i<10; i++){
			System.out.println("Child Thread--");
			
		}
	}
}
public class ThreadJoinDemo2 {
	public static void main(String []args)throws InterruptedException{
		MyThread3.mt = Thread.currentThread();
		MyThread3 t = new MyThread3();
		t.start();
		t.join();
		for(int i=0; i<10; i++){
			System.out.println("Main Thread--");
		
		}
	}

}

