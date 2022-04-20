package Study2;
import Study.*;

class D{
	void disp() {
		Demo1 d=new Demo1();
		System.out.println("B class");
		System.out.println(d.a);
	//	System.out.println(d.b);
		//System.out.println(d.c);
		//System.out.println(d);
	}
}
class E extends Demo1{
	void disp() {
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}
}
class F{
	
}
public class Demo2 {
	public static void main(String[] args) {
		D d=new D();
		d.disp();
	}

}
