package week2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("http://leaftaps.com/opentaps/");
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("97");
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8988");
        Thread.sleep(3000);
        //
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        //Exception
        //Capturing 1stlead
        WebElement firstLeadIdElement = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
        String leadId = firstLeadIdElement.getText();
        System.out.println("Captured Lead ID: " + leadId);
     // Click the first resulting lead
        firstLeadIdElement.click();
     //driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        Thread.sleep(3000);
        
       
        
        
        
        driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[1]")).sendKeys("10039");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
       WebElement noRecordsMessage = driver.findElement(By.className("x-paging-info"));
       if(noRecordsMessage.getText().equals("No records to display")) {
    	   System.out.println("Lead was successfully deleted");
       }
       else {
    	   System.out.println("Lead was not deleted");
       }
        
        driver.close();
	}

}
