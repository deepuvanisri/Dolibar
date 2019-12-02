package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class NewGroupPage extends BasePage
{

	public NewGroupPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='nom']")
	private WebElement gname;
	
	@FindBy(id="note")
	private WebElement gnote;
	
	@FindBy(xpath = "//input[@class= 'button']")
	private WebElement creategroup;
	
	@FindBy(xpath = "//div[text()='Group  already exists.']")
	private WebElement errormsg;
	
	@FindBy(xpath = "//div[text()='Name is not defined.']")
	private WebElement errmsg;
	
	public void enterGname(String name)
	{
		gname.sendKeys(name);
	}
	public void enterNote(String note)
	{
		gnote.sendKeys(note);
	}
	public void clickOnCreateGroup()
	{
		creategroup.click();
	}
	public String verifyErrmsg()
	{
		verifyElement(errmsg);
		String aerror = errmsg.getText();
		return aerror;
	}
	public String verifyErrormsg()
	{	
		verifyElement(errormsg);
		String aerror = errormsg.getText();
		return aerror;
		
	}
	
}
