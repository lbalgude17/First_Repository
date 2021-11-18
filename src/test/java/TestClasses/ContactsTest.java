package TestClasses;

import org.testng.annotations.Test;

import PageClasses.ContactsPOM;

public class ContactsTest extends BaseClass {
	@Test(priority=0)
	public void contactLinkTest() {
		
		ContactsPOM c=new ContactsPOM(driver);
		c.switchToFrame();
		c.redirectToNewContact();
	   String title= driver.getTitle();
	   System.out.println("Link text and Title is: "+title);
	}
	
	@Test(priority=1)
	public void nameTextboxTest() {
		ContactsPOM crm=new ContactsPOM(driver);
		crm.enterFirstName("Laxman");
		crm.enterMidName("Shivaji");
		crm.enterSurname("Balgude");
	}
	
	@Test(priority=2)
	public void suffixDropdownTest() {
		ContactsPOM crm=new ContactsPOM(driver);
		crm.selectSuffix();
	}
	@Test(priority=3)
	public void fileUploadTest() {
     ContactsPOM crm=new ContactsPOM(driver);
	crm.fileUpload();
	System.out.println("File Uploaded");
	}
	@Test(priority=4)
	public void selctTitleDropdownTest() {
		ContactsPOM crm=new ContactsPOM(driver);
		crm.selectTitle();
	}


}
