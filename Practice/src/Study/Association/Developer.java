package Study.Association;

import java.util.List;

public class Developer{
	private String name;
	List<ProgrammingLanguage> languageList;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public List<ProgrammingLanguage> getLanguage(){
		return languageList;
	}
	public void setLanguage(List<ProgrammingLanguage> languageList) {
		this.languageList=languageList;
	}
}