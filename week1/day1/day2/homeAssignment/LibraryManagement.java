package week1.homeAssignment;

public class LibraryManagement {

	public static void main(String[] args) {

		Library lm = new Library();
		
		System.out.println(lm.addBook("Java Selenium Book"));
		lm.issueBook();

	}

}
