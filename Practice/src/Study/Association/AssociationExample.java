package Study.Association;

import java.util.List;



public class AssociationExample{
	public static void main(String[] args) {
		Developer developer=new Developer();
		developer.setName("Kumar");
ProgrammingLanguage pl=new ProgrammingLanguage();
		pl.SetLanguage("Java");
		System.out.println(pl.getLanguage());
		System.out.println(developer.getName());
	}
}