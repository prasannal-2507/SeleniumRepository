//Overloading Concept

package week2.polimorphism;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("The endpoint is :"+endpoint);
		System.out.println("Request sent successfully.");
	}
	
public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
	System.out.println("The endpoint is :"+endpoint);
	System.out.println("The request is :"+requestBody);
	System.out.println("The Status is :"+requestStatus);
	}


	public static void main(String[] args) {
		APIClient ac = new APIClient();
		System.out.println("Calling with one argument");
		ac.sendRequest("http://api.ex.com/endpoint");
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("Calling with three arguments");
		ac.sendRequest("http://api.ex.com/endpoint", "Key", false);
		
           

	}

}
