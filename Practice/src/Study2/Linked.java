package Study2;
import java.util.*;
public class Linked {
	public static void main(String[] args) {
		LinkedHashMap al = new LinkedHashMap();
		al.put(1,"Thanesh");
		al.put(2,"Rajesh");
		al.put(3,"Ramesh");
		
		Set set =al.entrySet();
		
		Iterator i=set.iterator();
		while(i.hasNext()) {
			
		
		System.out.println(i.next());
		}
	}
}