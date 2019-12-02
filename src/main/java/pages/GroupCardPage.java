package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BasePage;
import generic.GenericUtils;

public class GroupCardPage extends BasePage
{

	public GroupCardPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user")
	private WebElement assignuser;
	
	@FindBy(xpath = "//input[@class='button']")
	private WebElement add;
	
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement deletebutton;
	
	@FindBy(xpath = "(//img[@title='Remove from group'])[2]")
	private WebElement deleteuser;
	
	public void clickOnUser()
	{
		assignuser.click();
	}
	public void SelectValue()
	{
		GenericUtils.selectByVisibleText(assignuser, "scdfd");
	}
	public void clickOnAdd()
	{
		add.click();
	}
	
	public void clickOnDeleteButton()
	{
		deletebutton.click();
	}
	public void deleteAssignedUser()
	{
		deleteuser.clear();
	}
}
