package Study2;
import java.util.*;

//import java.awt.desktop.AboutHandler;
//import java.nio.channels.NonWritableChannelException;
import java.util.*;
//class A extends Thread{
//	public void run() {
//		try {
//			int i,j=1,k=1;;
//			for( i=0;i<=10000;i++) {
//				if(i==60) j++;
//				for(j=1;j<=60;j++)
//					k++;
//				//System.out.println("I : "+i);
//				Thread.sleep(1000);
//			}
//		}
//		catch(Exception e) {
//			
//		}
//	}
//
//}
//class B extends Thread{
//	public void run() {
//		try {
//			for( j=0;j<=10000;j++) {
//				if(j==60) 
//			}
//		}
//		catch(Exception e) {
//			
//		}
//	}
//
//}
class A extends Thread{
	public synchronized void run() {
		for(int i=0;i<=30;i++) {
			try {
				System.out.println(Thread.currentThread().getName()+": "+i);
				Thread.sleep(500);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class A_Threading {
	public static void main(String[] args)  {
	      A a =new A();
	      Thread t1=new Thread(a);
	      Thread t2=new Thread(a);
	      t1.start();
	      t2.start();
	      t1.setName("Rama");
	      t2.setName("Sita");
	      
	      Stack<Integer> mona =new Stack<>();
	      mona.push(16); 
	     
	      for(int k=0;k<=30;k++) {
	    	  try {
	    		  if(k==5)
	    			  t1.suspend();
	    		  if(k==10)
	    			  t1.resume();
	    		  if(k==15)
	    			  System.out.println(t1.isAlive());
	    		  if(k==20)
	    			  t1.stop();
	    		  if(k==25)
	    			  System.out.println(t1.isAlive());
	    		  System.out.println("  k: "+k);
	    		  Thread.sleep(1000);
	    		  
	    	  }
	    	  catch (Exception e) {
				// TODO: handle exception
			}
	}
	    }	
}
