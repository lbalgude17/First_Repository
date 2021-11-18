package TestClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
  public static WebDriver driver;
	@BeforeSuite
	public void initBrowser() {
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://classic.freecrm.com/index.cfm");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	}


