package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GenericUtils 
{
	public static void getScreenShot(WebDriver driver, String name)
	{
		SimpleDateFormat s1 = new SimpleDateFormat("YYYY-MM-DD");
		String dd = s1.format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+dd+" "+name+".png");
		try
		{
			Files.copy(src, dest);
		}
		catch (Exception e) 
		{
		}
	
	}
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public static void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void javaScriptClickOnOkButton(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public static void javaScriptClickOnCancelButton(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public static void javaScriptEnterText(WebDriver driver,String text)
	{
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}
	public static void javaScriptFileUpload(WebDriver driver,String fileadress)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(fileadress);
	}
	
	public static void fileUpload(String filepath) throws Exception
	{
		StringSelection file = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
			Robot r = new Robot();
			int c = KeyEvent.VK_CONTROL;
			int  v = KeyEvent.VK_V;
			int enter = KeyEvent.VK_ENTER;
			r.keyPress(c);
			r.keyPress(v);
			Thread.sleep(2000);
			r.keyRelease(v);
			r.keyRelease(c);
			Thread.sleep(2000);
			r.keyPress(enter);
			Thread.sleep(2000);
			r.keyRelease(enter);
			Thread.sleep(2000);
		
			
	}
	
	public static void fileUploadPopup(WebDriver driver,String filepath)
	{
		driver.findElement(By.id(filepath)).sendKeys();
	}
}
