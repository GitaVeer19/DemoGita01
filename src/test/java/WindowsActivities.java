import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\veerg\\Cucumber_Automation\\Practice_Automation_01\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https:\\www.google.com");
		   driver.navigate().to("http:\\www.facebook.com");
		   driver.navigate().back();
		   driver.navigate().forward();
	}

}
