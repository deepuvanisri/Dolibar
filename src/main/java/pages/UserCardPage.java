package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;
import generic.GenericUtils;

public class UserCardPage extends BasePage
{
	@FindBy(xpath="//img[@title='Remove from group']")
	private WebElement deletegroup;
	@FindBy(xpath="(//img[@title='Show user'])[8]")
	private WebElement user;
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement deletebutton;
	@FindBy(xpath="//span[text()='Yes']")
	private WebElement spopup;
	
	@FindBy(xpath="//div/a[text()='Modify']")
	private WebElement modify;
	@FindBy(name="nom")
	private WebElement lname;
	
	@FindBy(name="prenom")
	private WebElement fname;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(name="email")
	private WebElement emailid;
	
	@FindBy(id="photoinput")
	private WebElement photo;
	
	@FindBy(name="save")
	private WebElement save;
	
	@FindBy(xpath = "//img[@title = 'Logout']")
	private WebElement lgbt;
	String file_path1="E:\\pictures\\FB_IMG_1564478064970 (1).jpg";

	
	public void clickOnUser()
	{
		user.click();
	}
		
	public void clickOnModify()
	{	
		modify.click();
	}
	
	public void enterLname(String ln)
	{
		lname.sendKeys(ln);
	}
	
	public void enterFname(String fn)
	{
		fname.sendKeys(fn);
	}
	
	public void enterLogin(String lgn)
	{
		login.sendKeys(lgn);
	}
	
	public void enterPassword(String pw)
	{
		pwd.sendKeys(pw);
	}
	
	public void enterEmail(String mail)
	{
		emailid.sendKeys(mail);
	}
	
	public void clickOnBrowse(WebDriver driver,String file)
	{
		GenericUtils.javaScriptFileUpload(driver, file);
		//GenericUtils.fileUpload(file_path1);
	}
	public void clickOnLogout()
		{
			lgbt.click();
		}
	
	public void clickOnSave()
	{
		save.click();
	}
	
	public void clickOnDelete()
	{
		deletebutton.click();
	}
	public void clickOnYes()
	{
		spopup.click();
	}
	
	
	public void deleteAssignedGroup()
	{
		deletegroup.click();
	}

	public UserCardPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
}
