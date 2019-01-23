
public class LambdaExpressoinThreadDemo {
	public static void main(String[] args) throws Exception
	{
//		Runnable r1 = ()->
//					{
//						for(int i=0; i<5; i++)
//						{
//							System.out.println("Hi");
//							try{Thread.sleep(1000);}catch(Exception e){}
//						}
//						
//					}
//				;
		
//		Runnable r2 = ()->
//					{
//						for(int i=0; i<5; i++)
//						{
//							System.out.println("Hello");
//							try{Thread.sleep(1000);}catch(Exception e){}
//						}
//						
//					}
//				;
				
				Thread t1 = new Thread(()->
				{
					for(int i=0; i<5; i++)
					{
						System.out.println("Hi "+ Thread.currentThread().getPriority());
						try{Thread.sleep(1000);}catch(Exception e){}
					}
					
				}
			);
				Thread t2 = new Thread(()->
				{
					for(int i=0; i<5; i++)
					{
						System.out.println("Hello "+ Thread.currentThread().getPriority());
						try{Thread.sleep(1000);}catch(Exception e){}
					}
					
				}
			);
				
//				Setting and Getting Priority
				
//				t1.setPriority(1);
//				t2.setPriority(10);
//				OR
				t1.setPriority(Thread.MIN_PRIORITY);
				t2.setPriority(Thread.MAX_PRIORITY);
				
				System.out.println(t1.getPriority());
				System.out.println(t2.getPriority());
				
				
				
//			Setting and Getting name of thread	
				t1.setName("Hi Thread");
				t2.setName("Hello Thread");
				
				System.out.println(t1.getName());
				System.out.println(t2.getName());
				
				
				t1.start();
//				System.out.println(t1.isAlive());
				try{Thread.sleep(10);}catch(Exception e){}
				t2.start();
//				System.out.println(t2.isAlive());
				
				t1.join();
				t2.join();
				System.out.println(t1.isAlive());
				
				System.out.println("Bye");
//				System.out.println(t1.isAlive());
	}

}
