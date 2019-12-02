package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class DolibarLoginPage extends BasePage

{

	public DolibarLoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "username")
	private WebElement lgtb;
	@FindBy(id="password")
	private WebElement pwtb;
	@FindBy(className = "button")
	private WebElement ctbt;
	@FindBy(xpath = "//div[text()='\r\n" + 
			"	Bad value for login or password	']")
	private WebElement errmsg;
	@FindBy(xpath="//td[text() = 'Dolibarr 3.3.1']")
	private WebElement version;
	
	public void enterLogin(String un)
	{
		lgtb.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		pwtb.sendKeys("admin");
	}
	public void clickOnConnection()
	{
		ctbt.click();
	}
	public String verifyErrormsg()
	{
		verifyElement(errmsg);
		String aerror = errmsg.getText();
		return aerror;
	}
	public String verifyVersion()
	{
		verifyElement(version);
		String aversion = version.getText();
		return aversion;
	}
}
