package Study;


public class RunnableThread implements Runnable {
	
	
	public void run() {
		System.out.print("thraed started");
	}

	
	public static void main(String[] args)  {
		
		RunnableThread a = new RunnableThread();
		Thread t= new Thread(a);
		t.start();
		

		
	}

	

}
	