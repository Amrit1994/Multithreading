 

class printMethod implements Runnable{
	
	public void run(){
		
		printM();
			
		
	}

	private void printM() {
		System.out.println("I am in print method");
		
	}
	
}


public class methodinThread {
	public static void main(String...args){
	
	Runnable rnt = new printMethod();
	Thread t = new Thread(rnt);
	t.start();
	
	
	}
	   
	
	

}
