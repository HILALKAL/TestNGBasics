package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class tc1 {

	WebDriver driver;
		@BeforeMethod
		public void SetUp() {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		
		
		}
	

}
