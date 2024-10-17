package multiTheardEx;

//class Book extends Thread{
//class Book implements Runnable{
//	
//}
class num extends Thread{
	public void run() {
		for(int i = 1; i <= 5 ; i++) {
			System.out.println(i);
			try{Thread.sleep(4000);}
			catch(Exception e) {
				
			}
		}
	}
}
public class multithreadEx1 {

	public static void main(String[] args) throws Exception{
		Runnable ex1 = new Runnable() {
			public void run() {
				for(int i = 1 ; i <= 5 ; i++) {
					System.out.println("Updating in ");
					try{Thread.sleep(5000);}
					catch(Exception e) {
						
					}
				}
			}
		};
		num ex2 = new num();
		 Thread t1 = new Thread(ex1);
		t1.start();
		ex2.start();
		
		t1.setName("Book1");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		
		
		
		
		
		
		
		
		
		
//		 ex1.updatedp();
//		 ex2.printEx();
//		if(ex1.isAlive()) {
//			System.out.println("Still executing..");
//		}
//		
		t1.join();
//		ex2.join();
//		if(ex2.isAlive()) {
//			System.out.print("Still executing..");
//		}
		System.out.println("Bye");

	}

}
