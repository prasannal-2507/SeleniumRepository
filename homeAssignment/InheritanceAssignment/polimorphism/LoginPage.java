package week2.polimorphism;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Perform the common tasks is overrided from Base class");
	}

	public static void main(String[] args) {
		 
		LoginPage lp = new LoginPage();
		lp.clickElement();
		lp.enterText();
		lp.findElement();
		System.out.println();
		//From Login class
		lp.performCommonTasks();

	}

}
