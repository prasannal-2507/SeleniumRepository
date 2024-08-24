package week2.homeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocators {

	public static void main(String[] args) throws InterruptedException {

            ChromeDriver driver = new ChromeDriver();
            
            driver.get("http://leaftaps.com/opentaps/");
            
            driver.manage().window().maximize();
            
            Thread.sleep(5000);
            
            driver.findElement(By.id("username")).sendKeys("demoSalesManager");
            driver.findElement(By.id("password")).sendKeys("crmsfa");
            driver.findElement(By.className("decorativeSubmit")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("CRM/SFA")).click();
            driver.findElement(By.xpath("//a[text()='Accounts']")).click();
            driver.findElement(By.xpath("//a[text()='Create Account']")).click();
            driver.findElement(By.id("accountName")).sendKeys("Prasanna");
            driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
            driver.findElement(By.id("numberEmployees")).sendKeys("25");
            driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
            driver.findElement(By.className("smallSubmit")).click();
            Thread.sleep(5000);
            
            driver.close();
            
	}

}
