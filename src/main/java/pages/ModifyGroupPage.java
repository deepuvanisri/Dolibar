package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ModifyGroupPage extends BasePage
{

	public ModifyGroupPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='butAction']")
	private WebElement modify;
	
	@FindBy(name="group")
	private WebElement gname;
	@FindBy(name="note")
	private WebElement gnote;
	@FindBy(xpath="//input[@value='Save']")
	private WebElement save;

//	public void clickOnModify()
//	{
//	
//		modify.click();
//		
//	}
//	
//	public void enterGroupName(String name)
//	{
//		gname.sendKeys(name);
//	}
//	public void enterGroupNote(String note)
//	{
//		gnote.sendKeys(note);
//	}
//	public void clickOnSave()
//	{
//		save.click();
//	}
}
