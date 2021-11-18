package TestClasses;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClasses.CRMLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCRM extends BaseClass{

	@Test(priority=0)
	public void LoginTest() throws FileNotFoundException {
	CRMLogin crm=new CRMLogin(driver);	
	crm.Login();
	}

}
