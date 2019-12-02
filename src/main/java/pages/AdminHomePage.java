package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class AdminHomePage extends BasePage
{

	public AdminHomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title = 'Logout']")
	private WebElement lgbt;
	
	@FindBy(xpath = "//a[text()='Users & Groups']")
	private WebElement usergroup;
	
	@FindBy(xpath = "//a[text()='New group']")
	private WebElement newgroup;
	@FindBy(xpath = "//a[text()='New user']")
	private WebElement newuser;
	
	public void clickOnUserGroups()
	{
		usergroup.click();
	}
	
	public void clickOnNewGroup()
	{
		newgroup.click();
	}
	public void clickOnNewUser()
	{
		newuser.click();
	}
	public void clickOnLogout()
	{
		lgbt.click();
	}
	
}
