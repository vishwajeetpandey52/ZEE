package Study;
import java.util.*;

import javax.accessibility.AccessibleStreamable;
public class Array {
	int arrayinsert(int a[]) {
		//a[0]=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			a[i]=i*10;
			//System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	void stringArray() {
		String a[]= {"zee","hello","tech"};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	boolean search(int a[]) {
		boolean test=false;
		System.out.println("Enter array");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			System.out.println(a[i]);
		}
		System.out.println("Enter number you want to search");
		int b=s.nextInt();
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==b) {
//				test=true ;	
//				break;
//			}
//		}
		for (int element : a) {
            if (element == b) {
                test = true;
                break;
            }
        }
		return test;
	}
	void posofchar(String a) {
//			if(a.contains("c")) {
//				System.out.println( a.indexOf("c"));
//			}
		char z='c';
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==z)
				System.err.println(i);
		}
	}
	int nooftimes(String a) {
		int c=0;
		char z='e';
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==z)
				c++;
		}
		return c;
	}
	void alternate(String a) {
		char b[]=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			if(i%2==0)
				System.out.println(b[i]);
		}
	}
	void replaceVowels(String a) {
		//try {
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='0'||b[i]=='u')
				b[i]='a';
			System.out.println(b[i]);
		}
//		catch(Exception e) {
//			System.out.println("Exception found");
//		}
		
	}
	void even(int a[]) {
		//Scanner s=new Scanner(System.in);
		//int c=0;
		for(int i=0;i<a.length;i++) {
			a[i]=(int)Math.floor(Math.random() * 10);
			System.out.println(a[i]);
//			if(a[i]%2==0)
//				c++;
		}
		for(int i=0;i<a.length%2;i++) {
			int s=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=s;
		}
		//return c;
	}
	void reverse(int a[]) {
		for(int i=0;i<a.length%2;i++) {
			int s=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=s;
		}
	}
	int minmax(int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
//	boolean compare(String a,String b) {
//		
//	}
	public static void main(String[] args) {
		//int b[]= new int[10];
		int  b[]= {10,20,30,40,6,9,1};
		Array array=new Array();
		//array.arrayinsert(b);
		//array.stringArray();
//		String zString="Bangalore";
//		//System.out.println(array.nooftimes(zString));
//		array.replaceVowels(zString);
		System.out.println(array.minmax(b));

		//System.out.println(b[0]);

	}

}
