import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\veerg\\Cucumber_Automation\\Practice_Automation_01\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent child traverse
		 //header/div/button[1]/following-sibling::button[1]
		   System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		   //same way to reach login button below via child to parent to child
		  // driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).click();
		   Thread.sleep(2000);
		   driver.close();
	}
}
