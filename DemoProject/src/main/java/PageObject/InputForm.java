package PageObject;

import javax.swing.SwingWorker.StateValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InputForm {

	WebDriver driver ;
	
	public InputForm(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	
	@FindBy(xpath= "//input[@name = 'first_name']")WebElement fname;
	@FindBy(xpath= "//input[@name = 'last_name']")WebElement lname;
	@FindBy(xpath= "//input[@name = 'email']")WebElement email;
	@FindBy(xpath= "//input[@name = 'phone']")WebElement phone;
	@FindBy(xpath= "//input[@name = 'address']")WebElement address;
	@FindBy(xpath= "//input[@name = 'city']")WebElement city;
/*	Select stateVal = new Select(driver.findElement(By.name("state")));
	stateVal.selectByValue('Texas');*/
	
	@FindBy(xpath= "//input[@name = 'zip']")WebElement zipcode;
	@FindBy(xpath= "//input[@name = 'website']")WebElement website;
	@FindBy(xpath= "//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")WebElement prjDesc;

	
	public WebElement fnameField()
	{
		return fname;
	}
	public WebElement lnameField()
	{
		return lname;
	}
	public WebElement emailField()
	{
		return email;
	}
	public WebElement phField()
	{
		return phone;
	}
	public WebElement adField()
	{
		return address;
	}
	public WebElement cityField()
	{
		return city;
	}
	public WebElement zipField()
	{
		return zipcode;
	}
	public WebElement siteField()
	{
		return website;
	}
	public WebElement cmmntField()
	{
		return prjDesc;
	}
	
	

}
