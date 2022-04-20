package Study;

class Parent
{
int sum(int a ,int b) {
	return a+b;
}
	
}
class Child extends Parent{
	void returnSum() {
System.out.println(sum(5,6));
}
}
public class Employee
{
public static void main(String args[])
{	Child c=new Child();
	//Employee employee=new Employee();
	c.returnSum();
	

}
}

