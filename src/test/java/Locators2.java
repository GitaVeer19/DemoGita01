import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name ="rahul";
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\veerg\\Cucumber_Automation\\Practice_Automation_01\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver ();
		  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.tagName("p")).getText());
			//assert.assertEquals(successfulMsg, "You are successfully logged in.");
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
			//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.", "Login message mismatch");
	       String expectedName= driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
	       System.out.println(expectedName); 
	       Assert.assertEquals( driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " +name+ ",");
	       //driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	       driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	       driver.close();
	}
}
	

