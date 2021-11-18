package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AlertPOM {
	public WebDriver driver;
	@FindBy(xpath="//frame[@name='leftpanel']") private WebElement iframe;
    @FindBy(xpath="//a[@title='Alerts']") private WebElement alert;
    @FindBy(xpath="//select[@name='alert_send_mode']") private WebElement alertDropdown;
    @FindBy(xpath="//select[@name='object_type']") private WebElement globalAlertDropdown;
    @FindBy(xpath="//select[@name='alert_trigger']") private WebElement triggerAlertSelect;
    @FindBy(xpath="//select[@name='format']") private WebElement emailAlert;
    @FindBy(xpath="//input[@type='radio' and @value='N']") private WebElement activeRadioButton;
    @FindBy(xpath="//input[@value='Save']") private WebElement saveButton;
    
    public AlertPOM(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	this.driver=driver;
    }
    
    public void clickOnAlert() {
    	
    	alert.click();
    }
    public void alertSelect() {
    	Select s=new Select(alertDropdown);
    	if(s.isMultiple()) {
    	s.selectByValue("O");
    	s.selectByValue("N");
    	}
    	else
    		s.selectByValue("S");
    }
    
    public void globalAlertSelect() {
    	Select s=new Select(globalAlertDropdown);
    	s.selectByValue("CALENDAR");
    }
    public void triggerAlertSelect() {
    	Select s=new Select(triggerAlertSelect);
    	s.selectByValue("INS");
    }
    public void emailAlertSelect() {
    	Select s=new Select(emailAlert);
    	s.selectByValue("S");
    }
    public void pressRadioButton() {
    	activeRadioButton.click();
    }
    
    public void save() {
    	saveButton.click();
    }
}
