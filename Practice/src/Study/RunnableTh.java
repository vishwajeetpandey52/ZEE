package Study;
public class RunnableTh implements Runnable {
	public void run() {
		System.out.print("thraed started");
	}
	public static void main(String args[])  {
		Runnable a = new RunnableTh();
		Thread t= new Thread(a);
		t.start();		
	}
}

