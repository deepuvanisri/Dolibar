package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ListOfGroupsPage extends BasePage
{

	public ListOfGroupsPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()=' accnt']")
	private WebElement clickongroup;
	@FindBy(xpath = "//a[text()='Groups']")
	private WebElement click;
	@FindBy(xpath = "//a[text()=' accnt']")
	private WebElement clickonaccnt;
	
	public void clickOnGroup()
	{
		clickongroup.click();
	}
	public void clickOnGroupSubmenu()
	{
		click.click();
	}
	public void clickOnAccnt()
	{
		clickonaccnt.click();
	}
	
	
}
