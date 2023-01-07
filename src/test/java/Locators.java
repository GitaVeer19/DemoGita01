import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Locators {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\veerg\\Cucumber_Automation\\Practice_Automation_01\\Drivers\\chromedriver.exe");
   WebDriver driver = new ChromeDriver ();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://rahulshettyacademy.com/locatorspractice/");
   driver.findElement(By.id("inputUsername")).sendKeys("Gita");
   driver.findElement(By.name("inputPassword")).sendKeys("Veer");
   driver.findElement(By.className("signInBtn")).click();
   System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
   driver.findElement(By.linkText("Forgot your password?")).click();
   Thread.sleep(4000);
   driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
  // driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
  // driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
   
	//driver.findElement(By.xpath("//form/input[3])")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("123456789");
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//parent- child
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("#chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();  //regular expression
	
	}
	
	}


