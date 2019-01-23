

class MyThreadDemo extends Thread{
	
	 static Thread mt; 
	public void run(){
//		/*try{
//		 mt.join();
//		*/}catch(InterruptedException e){e.printStackTrace();}
		
		for(int i=0; i<5; i++){
			
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println("Thread-T1");
		}
	}
}




public class Thread_Join_Demo {

	public static void main(String[] args)throws InterruptedException {
		MyThreadDemo t = new MyThreadDemo();
		t.start();

		Thread t2 = new Thread(){
		public void run(){
//		MyThreadDemo.mt = Thread.currentThread();
		try{
		t.join();
		
		}catch(InterruptedException e){}
		System.out.println("Thread-T1 joins Thread-T2");
		for(int i=0; i<5; i++){
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println("Thread-T2");
		}
		
		
	}
};

t2.start();
	

	t2.join();
	System.out.println("Thread-T2 joins Thread-T3");
	for(int i=0; i<5; i++){
		try{Thread.sleep(1000);}catch(Exception e){}
		System.out.println("Thread-T3");
	}

	}

}
