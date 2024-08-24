package week2.homeAssignment;

import java.time.Duration;

import org.apache.commons.math3.geometry.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Leafground {

	public static void main(String[] args) throws InterruptedException {

           ChromeDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
           driver.get("https://leafground.com/button.xhtml");
           
           //Click on the button with the text ‘Click and Confirm title.
           driver.findElement(By.xpath("//span[text()='Click']")).click();
           //Verify that the title of the page is ‘dashboard.’
       String title = driver.getTitle();
       if(title.equals("Dashboard")) {
    	   System.out.println("Title is displying correct");
       }
       else {
    	   System.out.println("Title is displying not correct");
	}
       Thread.sleep(2000);
       //Navigate back
       driver.navigate().back();
       Thread.sleep(2000);
       //Check if the button with the text ‘Confirm if the button is disabled’ is disabled
WebElement disable = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/parent::div"));
     boolean flag = disable.isEnabled();
     System.out.println("Button is disabled :"+flag);
     Thread.sleep(2000);
     
//Find and print the position of the button with the text ‘Submit.
   System.out.println("The position of the button is :"+driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation()); 
//  WebElement submit =  driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
//  Point position = (Point) submit.getLocation();
//    System.out.println("The Position of the button is :"+position);
//    
    //Find and print the background color of the button with the text ‘Find the Save button color.’
   //System.out.println("The backgroud color of the button is :"+driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
  WebElement buttonColor = driver.findElement(By.xpath("//span[text()='Save']"));
  String clr = buttonColor.getCssValue("background-color");
  System.out.println("The button color is :"+clr);
   
  //Find and print the height and width of the button with the text ‘Find the height and width of this button.
  WebElement submit1 = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
  Dimension size = submit1.getSize();
  System.out.println("The height and width of the button is :"+size);
  Thread.sleep(2000);
       driver.close();
	}

}
