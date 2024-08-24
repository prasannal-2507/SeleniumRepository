package week2.homeAssignment;

import java.awt.Checkbox;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {

            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            //URL
            driver.get("https://leafground.com/checkbox.xhtml");
            
            //Basic CheckBox
            driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
            //Notifications CheckBox
            driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
           
            //Verify that the expected message is displayed.
          
            String text = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
            
            String expectedMessage = "Checked";
            if(text.contains(expectedMessage)) {
            	System.out.println("Expected message is displayed.");
            }
            else {
            	System.out.println("Expected message is NOT displayed.");
            }
           
            // Click on your favorite language check box
            driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
            Thread.sleep(3000);
            // // Click on the "Tri-State Check box"
            driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
            Thread.sleep(3000);
            //Verify which tri-state option has been chosen.
            //String state = driver.findElement(By.xpath("//div[@class='ui-growl-message']//p[1]")).getText();
            String state = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
            
           String triStateOption = "state = 1";
          // System.out.println(state);
           if(state.equalsIgnoreCase(triStateOption)) {
        	   System.out.println("Expected State is displyed");
           }
           else {
        	   System.out.println("Expected State is not displyed");
           }
           Thread.sleep(3000);
           //Click on the "Toggle Switch."
           driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
          
           //Verify that the expected message is displayed.
           String checked = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
           String toggleMessage = "Checked";
           if(checked.equalsIgnoreCase(toggleMessage)) {
        	   System.out.println("Toggle switch message is displayed.");
           }
           else {
        	   System.out.println("Toggle switch message is not displayed.");
           }
         
           //Verify the check box is disabled
           String checkbox1 = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).getText();
      String verify = "disabled";
      if(verify.equalsIgnoreCase(checkbox1)) {
    	  
    	  System.out.println("Check box is disabled.");
      }
      else {
   	   System.out.println("Check box is not disabled.");
      }
       Thread.sleep(3000);
       
      // Select multiple options on the page (details may be needed).
       driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
       Thread.sleep(2000);
       //Perform any additional actions or verifications required.
       driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
       driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[2]/div[1]/div[2]")).click();
       driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[3]/div[1]/div[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[5]/div[1]/div[2]")).click();
       Thread.sleep(2000);
driver.close();
	}
}