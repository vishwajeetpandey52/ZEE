package Study;

public class ThreadExample extends Thread {
	
	public void run() {
		System.out.println("New Thread is started");
	}
	
	public static void main(String[] args) {
		
		System.out.println("welcome");
		
		ThreadExample  tt = new ThreadExample();
		tt.start();
		
	}

}
