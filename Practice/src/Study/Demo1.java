package Study;
class X{
	public int a=10;
	private int b=20;
	
	protected int c=30;
	int d= 40;
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class Y extends X{
	void disp() {
		System.out.println("B class");
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class Z{
	void disp() {
		X a1=new X();
		System.out.println("C class");
		
		System.out.println(a1.a);
		//System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Y y=new Y();
		y.disp();
	}
	
}
