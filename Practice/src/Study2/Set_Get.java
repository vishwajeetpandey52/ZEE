package Study2;

class P{
	private int id;
	private String name;
	
	void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
}
public class Set_Get {
	public static void main(String[] args) {
		P p=new P();
		p.setId(100);
		System.out.println(p.getId());
		p.setName("Thanesh");
		System.out.println(p.getName());
	}	
}
