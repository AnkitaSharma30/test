package assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Main {
	WebDriver driver;
	Main main;
	@BeforeTest
	public void launchlink()
	{
		driver = new ChromeDriver();
		//driver.get("http://10.0.31.161:9292/");
		main=new Main(driver);	
	}
	@Test(priority=2)
	public void basic_auth()
	{
		driver.get("http://10.0.31.161:9292/");
		main.BASIC_AUTH();
	}
	@Test(priority=1)
	public void exitintent()
	{
		driver.get("http://10.0.31.161:9292/");
		main.EXIT_INTENT();
	}
	@Test(priority=0)
	public void form_authetication()
	{
		driver.get("http://10.0.31.161:9292/");
		main.form_authention();
	}

}
