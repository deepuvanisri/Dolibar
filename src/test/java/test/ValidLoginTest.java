package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ExcelData;
import generic.GenericUtils;
import pages.AdminHomePage;
import pages.DolibarLoginPage;
import pages.GroupCardPage;
import pages.ListOfGroupsPage;
import pages.ListOfUsersPage;
import pages.ModifyGroupPage;
import pages.NewGroupPage;
import pages.NewUserPage;
import pages.UserCardPage;

public class ValidLoginTest extends BaseTest
{
	@Test
	public void validLoginLogout() throws Exception
	{
		String un = ExcelData.getData(file_path, "TC01",1 ,0 );
		String pwd = ExcelData.getData(file_path, "TC01", 1, 1);
//		String gname = ExcelData.getData(file_path, "TC03", 1,1 );
//		String note = ExcelData.getData(file_path, "TC03", 1, 2);
		String lgtitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String adtitle = ExcelData.getData(file_path, "TC02", 1, 0);
		String ugtitle = ExcelData.getData(file_path, "TC03", 1, 0);
		String uutitle = ExcelData.getData(file_path, "TC04", 1, 0);
		String gptitle = ExcelData.getData(file_path, "TC05", 1, 0);
		String lutitle = ExcelData.getData(file_path, "TC06", 1, 0);
		String lname = ExcelData.getData(file_path, "TC04", 1, 1);
		String fname = ExcelData.getData(file_path, "TC04", 1, 2);
		String login = ExcelData.getData(file_path, "TC04", 1, 3);
		String password = ExcelData.getData(file_path, "TC04", 1, 4);
		String mobile = ExcelData.getData(file_path, "TC04", 1, 5);
		String email = ExcelData.getData(file_path, "TC04", 1, 6);
		String gruname=ExcelData.getData(file_path, "TC07", 1, 0);
		String grunote=ExcelData.getData(file_path, "TC07", 1, 1);
		DolibarLoginPage dlp = new DolibarLoginPage(driver);
		AdminHomePage ahp = new AdminHomePage(driver);
		NewGroupPage ngp = new NewGroupPage(driver);
		NewUserPage nup = new NewUserPage(driver);
		ListOfGroupsPage lgp = new ListOfGroupsPage(driver);
		GroupCardPage gcp = new GroupCardPage(driver);
		ListOfUsersPage lup = new ListOfUsersPage(driver);
		ModifyGroupPage mgp = new ModifyGroupPage(driver);
		//login page
		dlp.verifyTitle(lgtitle);
		dlp.enterLogin(un);
		dlp.enterPassword(pwd);
		dlp.clickOnConnection();
		ahp.verifyTitle(adtitle);
		Reporter.log("admin logined successsfully");
		//new group page
		ahp.clickOnUserGroups();
		ahp.clickOnNewGroup();
		ngp.verifyTitle(ugtitle);
		File f = new File(file_path);
		FileInputStream file = new FileInputStream(f);
		int row_cnt = WorkbookFactory.create(file).getSheet("TC03").getLastRowNum();
		for(int i=0;i<=row_cnt;i++)
		{
			int j=0;
			String gname = ExcelData.getData(file_path, "TC03", i, j+1);
			String gnote = ExcelData.getData(file_path, "TC03", i, j+2);
			ngp.enterGname(gname);
			ngp.enterNote(gnote);
			ngp.clickOnCreateGroup();
			Reporter.log("group created successfully");
			ahp.clickOnNewGroup();
		}
		Reporter.log("group created successfully");
		ahp.clickOnNewGroup();
		//ngp.verifyErrmsg();
		//new user page
		ahp.clickOnUserGroups();
		ahp.clickOnNewUser();
		nup.verifyTitle(uutitle);
		nup.enterLastname(lname);
		nup.enterFirstname(fname);
		nup.enterLogin(login);
		nup.enterPassword(password);
		nup.enterMobileno(mobile);
		nup.enterMail(email);
		nup.clickOnCreateButton();
		//assign user to group
//		ahp.clickOnUserGroups();
//		lgp.clickOnGroupSubmenu();
//		lgp.clickOnGroup();
//		//nup.verifyerrmsg();
//		gcp.verifyTitle(gptitle);
//		//lgp.clickOnGroup();
//		//assign group to user
//		gcp.clickOnUser();
//		gcp.SelectValue();
//		gcp.clickOnAdd();
//		lup.clickOnUsersmenu();
//		lup.clickOnUser();
//		lup.verifyTitle(lutitle);
//		lup.clickOnGroup();
//		lup.selectGroup();
		//modify group
//		ahp.clickOnUserGroups();
//		lgp.clickOnGroupSubmenu();
//		lgp.clickOnGroup();
//		lgp.clickOnAccnt();
		//gcp.clickOnDeleteButton();
//		gcp.deleteAssignedUser();
//		Reporter.log("user deleted from group",true);
		UserCardPage ucp = new UserCardPage(driver);
		ahp.clickOnUserGroups();
		lgp.clickOnGroupSubmenu();
		lup.clickOnUsersmenu();
		ucp.clickOnUser();
		ucp.clickOnModify();
		String ln = ExcelData.getData(file_path, "TC05", 1, 0);
		String fn = ExcelData.getData(file_path, "TC05", 1, 1);
		String lgn = ExcelData.getData(file_path, "TC05", 1, 2);
		String pw = ExcelData.getData(file_path, "TC05", 1, 3);
		String mail = ExcelData.getData(file_path, "TC05", 1, 4);
		ucp.enterLname(ln);
		ucp.enterFname(fn);
		ucp.enterLogin(lgn);
		ucp.enterPassword(pw);
		ucp.enterEmail(mail);
		Thread.sleep(2000);
		//String fileadress="document.getElementById('photoinput').click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('photoinput').click()");
		
		GenericUtils.fileUpload("‪D:\\picture\\scenary.png");
		
		Thread.sleep(5000);
//		//ucp.uploadPhoto(file_path1);
		Thread.sleep(5000);
		//ucp.clickOnSave();
		
		//ucp.clickOnLogout();
//		ucp.clickOnDelete();
//		ucp.clickOnYes();
//		Reporter.log("user deleted successfully",true);
		Reporter.log("user modified successfully",true);
		//ucp.deleteAssignedGroup();
	
	}
}
