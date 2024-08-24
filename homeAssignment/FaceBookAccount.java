//Face Book Account Creation
package week2.homeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccount {

	public static void main(String[] args) throws InterruptedException {

      ChromeDriver driver = new ChromeDriver();
      driver.get("https://en-gb.facebook.com/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      //Create New Account
     WebElement cl = driver.findElement(By.xpath("//a[text()='Create new account']"));
     cl.click();
     Thread.sleep(3000);
     //First Name
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vani");
    
    //Surname
   WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
   surname.sendKeys("Hema");
   
   //Mobile Number
   WebElement num = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
   num.sendKeys("1234567891");
   //New Password
   driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Abc@123");
   Thread.sleep(3000);
   //Day
  WebElement day = driver.findElement(By.id("day"));
   Select optDay = new Select(day);
   optDay.selectByVisibleText("25");
   Thread.sleep(3000);
   //Month
   WebElement month = driver.findElement(By.id("month"));
   Select optMonth = new Select(month);
   optMonth.selectByVisibleText("Jul");
   Thread.sleep(3000);
   //Year
  WebElement year = driver.findElement(By.id("year"));
  Select optYear = new Select(year);
  optYear.selectByVisibleText("1988");
  Thread.sleep(3000);
  //Gender
  driver.findElement(By.xpath("//label[text()='Female']")).click();
  Thread.sleep(3000);
  //Sign Up
  driver.findElement(By.xpath("//button[@name='websubmit']")).click();
  Thread.sleep(3000);
  
  String title = driver.getTitle();
  if(title.contains("sign up")) {
	  System.out.println("Title is didplying correctly");
  }
  else {
	System.out.println("Title is not displaying correctly");
}
  driver.close();
  
   
      

	}

}
