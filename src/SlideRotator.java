
class Slide extends Thread {

	public  void run(){
		
			for(int i=1; i<=10; i++){
				
				System.out.println("Slide-" +i);
				
				try{Thread.sleep(1000);}catch(Exception e){}
			
			}
		
		}
	
}

public class SlideRotator{
	
	public static void main(String...args){
		
		Slide t = new Slide();
		t.start();
	}
	
}