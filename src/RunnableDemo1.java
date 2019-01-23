

class Hii implements Runnable{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hii");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}

class Helloo implements Runnable{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Helloo");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}



public class RunnableDemo1 {

	public static void main(String[] args)
	{
		Runnable obj1 = new Hii();
		Runnable obj2 = new Helloo();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try{Thread.sleep(1000);}catch(Exception e){}
		t2.start();
	}
}
