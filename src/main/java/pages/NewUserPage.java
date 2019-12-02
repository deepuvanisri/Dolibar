package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class NewUserPage extends BasePage
{

	public NewUserPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="nom")
	private WebElement lntb;
	@FindBy(name="prenom")
	private WebElement fntb;
	@FindBy(name="login")
	private WebElement lgtb;
	@FindBy(name="password")
	private WebElement pwtb;
	@FindBy(name="user_mobile")
	private WebElement mobileno;
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="create")
	private WebElement createbt;
	@FindBy(xpath = "//div[text()='Login  already exists.']")
	private WebElement errmsg;
	@FindBy(xpath = "//img[@title = 'Logout']")
	private WebElement lgbt;
	
	public void enterLastname(String ln)
	{
		lntb.sendKeys(ln);
	}
	public void enterFirstname(String fn)
	{
		fntb.sendKeys(fn);
	}
	public void enterLogin(String login)
	{
		lgtb.sendKeys(login);
	}
	public void enterPassword(String pwd)
	{
		pwtb.sendKeys(pwd);
	}
	public void enterMobileno(String num)
	{
		mobileno.sendKeys(num);
	}
	public void enterMail(String mail)
	{
		email.sendKeys(mail);
	}
	public void clickOnCreateButton()
	{
		createbt.click();
	}
	public String verifyerrmsg()
	{
		verifyElement(errmsg);
		String aerror = errmsg.getText();
		return aerror;
	}
	public void clickOnLogout()
	{
		lgbt.click();
	}
	
	
}
