package Study2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
	public static void m1() {
		m2();
	}
	public static void m2() {
		try {
			File file=new File("Abc.text");
			FileReader fR=new FileReader(file);
		}
		catch(FileNotFoundException fnf){
			System.out.println("File not found "+fnf);
		}
	}

}
