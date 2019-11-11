package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://192.168.233.128/dolibarr-3.3.1/htdocs/");
	}
	
	public void postCondition()
	{
		driver.close();
		
	}
}
