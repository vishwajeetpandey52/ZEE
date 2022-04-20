package Study;
import java.util.*;
class Emp{
	int id,age,sal;
	String name,desig;
	public Emp() {
		// TODO Auto-generated constructor stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id ");
		id= s.nextInt();
		System.out.println("Enter Name ");
		name= s.next();
		System.out.println("Enter designation ");
		desig=s.next();
		System.out.println("Enter age ");
		age=s.nextInt();
		System.out.println("Enter sal ");
		sal=s.nextInt();

	}
	void display()
	{
		System.out.println(" ID : "+id);
		System.out.println("name : "+ name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+sal);
		System.out.println("Desig : "+desig);
	}

}

private class Clerk extends Employee
{
	Clerk()
	{
	}

}
class Dev extends Employee
{
	Dev()
	{

	}

}
class Tester extends Employee
{

	Tester()
	{
	}

}
class Demo3
{
	public static void main(String args[])
	{
//		Clerk c =new Clerk();
//		c.display();



		Dev d=new Dev();
		d.display();

		Tester t=new Tester();
		t.display();
	}
}














