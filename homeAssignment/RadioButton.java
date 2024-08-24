package week2.homeAssignment;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.leafground.com/radio.xhtml");
        
        //Select 'Your most favourite browser' from the radio buttons
    WebElement edge =  driver.findElement(By.xpath("//label[text()='Edge']"));
    edge.click();
    Thread.sleep(2000);
        //Click on a radio button, then click on the same radio button again
        edge.click();
        Thread.sleep(3000);
        //verify that it becomes ‘unselected’.

//System.out.println(driver.findElement(By.xpath("//label[text()='Edge']")).isSelected());
     WebElement checkEdge = driver.findElement(By.xpath("//label[text()='Edge']"));
     boolean flag = checkEdge.isSelected();
     System.out.println("Button becomes unselected :"+flag);

//Identify the radio button that is initially selected by default.
      WebElement option = driver.findElement(By.xpath("(//label[text()='Safari'])[1]"));
     String verify = "Default";
     if(verify.equals(option)) {
    	 System.out.println("Radio button is intially selected");
     }
     else {
    	 System.out.println("Radio button is not intially selected"); 
     }
     Thread.sleep(2000);
     //Check and select the age group (21-40 Years) if not already selected.
  System.out.println(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected());  


        driver.close();
	}

}
