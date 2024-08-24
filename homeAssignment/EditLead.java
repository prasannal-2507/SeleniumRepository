package week2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	       driver.get("http://leaftaps.com/opentaps/");
	        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	        
	        driver.findElement(By.xpath("//a[text()='Leads']")).click();
	        Thread.sleep(3000);
	    WebElement createLead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
	    createLead.click();
	    Thread.sleep(3000);
	    //Company Name
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Yantra");
	    
	     //First Name
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vani");
	     //Last Name
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rama");
	     //First Name Local
	     driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("chakri");
	     //Department
	     driver.findElement(By.name("departmentName")).sendKeys("Sales Department");
	     //Description
	     driver.findElement(By.name("description")).sendKeys("Java Selenium Batch");
	     //Email
	     driver.findElement(By.name("primaryEmail")).sendKeys("kavya@abc.com");
	     //State/Province
	   WebElement state =  driver.findElement(By.name("generalStateProvinceGeoId"));
	   Select stateopt = new Select(state);
	   stateopt.selectByVisibleText("New York");
	   Thread.sleep(3000);
	   //Create Lead
	   driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	   //Edit
	   driver.findElement(By.xpath("//a[text()='Edit']")).click();
	   //Clear Description
	 WebElement des = driver.findElement(By.name("description"));
	 des.clear();
	 Thread.sleep(3000);
	 //Important note field
   WebElement impNote = driver.findElement(By.xpath("//textarea[@name='importantNote']"));
        impNote.sendKeys("Description should be clear");
        //Update Button
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        Thread.sleep(2000);
        //Get Title
   String title =  driver.getTitle();
   if(title.contains("opentaps CRM")) {
	   System.out.println("Title Is Successful");
   }
   else {
	   System.out.println("Title Is not Successful");
   }
   Thread.sleep(3000);
	        driver.close();
	}

}
