package PageClasses;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLogin extends PropertyClass {
  public static String name;
  public static String pssd;
	 private WebElement uname;
	 private WebElement pass;
     private WebElement button;
	
	public CRMLogin(WebDriver driver) throws FileNotFoundException{
		super();
		name=prop.getProperty("email");
		pssd=prop.getProperty("pwd");
		PageFactory.initElements(driver, this);	
	   uname=driver.findElement(By.xpath("//input[@name='username']"));
	   pass=driver.findElement(By.xpath("//input[@name='password']"));
	   button=driver.findElement(By.xpath("//input[@value='Login']"));
	   
	}
	
	public void Login() {
	uname.sendKeys("naveenk");
	pass.sendKeys("test@123");
	button.click();
	}
}
