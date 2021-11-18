package TestClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import PageClasses.AlertPOM;

public class AlertLinkTest extends BaseClass{
	
	@Test(priority=6)
	public void redirectToAlertTest() {
		AlertPOM a=new AlertPOM(driver);
		a.clickOnAlert();
	}
	
	@Test(priority=7)
	public void alertSelectTest() {
		Reporter.log("Alert Dropdown Test");
		AlertPOM a=new AlertPOM(driver);
		a.alertSelect();
	}
	
	@Test(priority=8)
	public void globalAlertSelectTest() {
		AlertPOM a=new AlertPOM(driver);
		a.globalAlertSelect();
	}
	
	@Test(priority=9)
	public void triggerAlertSelectTest() {
		Reporter.log("DropdownTest");
		AlertPOM a=new AlertPOM(driver);
		a.triggerAlertSelect();
	}
	
	@Test(priority=10)
	public void emailAlertTest() {
		AlertPOM a=new AlertPOM(driver);
		a.emailAlertSelect();
	}
	
	@Test(priority=11)
	public void radioButtonTest() {
		AlertPOM a=new AlertPOM(driver);
		a.pressRadioButton();
	}
	
	@Test(priority=12
			)
	public void saveButtonTest() {
		AlertPOM a=new AlertPOM(driver);
		a.save();
		Assert.assertTrue(false);
	}

}
