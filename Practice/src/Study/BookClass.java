package Study;

public class BookClass implements Book {
	public void chapter() {
		System.out.println("This is chapter1");
	}
	public static void main(String[] args) {
		BookClass bookClass= new BookClass();
		bookClass.chapter();
	}

}
