package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPOM {
	public WebDriver driver;
	@FindBy(xpath="//*[@name='mainpanel']") private WebElement iframe;
	@FindBy(xpath="//*[@title='Contacts']") private WebElement contacts;
	@FindBy(xpath="//*[@title='New Contact']") private WebElement newContact;
	@FindBy(xpath="//*[@name='title']") private WebElement titleDropdown;
	@FindBy(id="first_name") private WebElement firstNametext;
	@FindBy(id="middle_initial") private WebElement middleNameText;
	@FindBy(id="surname") private WebElement surnameText;
	@FindBy(xpath="//*[@name='suffix']") private WebElement suffixDropdown;
	@FindBy(id="image_file") private WebElement fileUpload;
	
	public ContactsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void switchToFrame() {
		driver.switchTo().frame(iframe);
	}
	public void redirectToNewContact() {
		Actions act=new Actions(driver);
	   act.moveToElement(contacts).perform();
	   newContact.click();
	}
	public void selectTitle() {
		Select s=new Select(titleDropdown);
		s.selectByValue("Mr.");
	}
	public void enterFirstName(String fname) {
		firstNametext.sendKeys(fname);
	}
	public void enterMidName(String mName) {
		middleNameText.sendKeys(mName);
	}
	public void enterSurname(String Lname) {
		surnameText.sendKeys(Lname);
	}
	public void selectSuffix() {
		Select se=new Select(suffixDropdown);
		se.selectByValue("Jr.");	
	}
	public void fileUpload() {
		fileUpload.sendKeys("C:\\Users\\balgu\\Downloads\\And or xpath.png");
	}



}
