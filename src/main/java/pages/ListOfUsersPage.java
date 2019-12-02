package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;
import generic.GenericUtils;

public class ListOfUsersPage extends BasePage
{

	public ListOfUsersPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Users']")
	private WebElement clickonusers;
	
	@FindBy(xpath = "//a[text()=' deepu']")
	private WebElement user;
	
	@FindBy(name="group")
	private WebElement assigngroup;
	
	@FindBy(xpath = "//img[@title = 'Logout']")
	private WebElement lgbt;
	
	public void clickOnUsersmenu()
	{
		clickonusers.click();
	}
	public void clickOnUser()
	{
		user.click();
	}
	public void clickOnGroup()
	{
		assigngroup.click();
	}
	public void selectGroup()
	{
		GenericUtils.selectByVisibleText(assigngroup, "Account1");
	}
	
	
}
