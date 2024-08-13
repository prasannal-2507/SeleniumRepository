package week1.day2;

public class LearnIfCondition {

	public static void main(String[] args) {
		
		int marks = 45;
		
		if(marks<20) {
			System.out.println("The Student Grade is : C");
		}
		else if (marks<40) {
			System.out.println("The Student Grade is : B");
			
		}
		else if(marks<50){
			System.out.println("The Student Grade is : A");
		}
		else {
			System.out.println("The Student Grade is : O");
		}

	}

}
