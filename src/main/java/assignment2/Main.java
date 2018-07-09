package assignment2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Main {
	WebDriver driver;
	public Main(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void BASIC_AUTH()
	{
		driver.findElement(By.linkText("Basic Auth")).click();
		Assert.assertEquals("http://10.0.31.161:9292/basic_auth", driver.getCurrentUrl(),"wrong page!");
	}
	public void EXIT_INTENT()
	{
		driver.findElement(By.linkText("Exit Intent")).click();
		Assert.assertEquals("http://10.0.31.161:9292/exit_intent", driver.getCurrentUrl(),"wrong page!");
		WebElement el = driver.findElement( By.cssSelector( "#content > div.example > p") );  
		Actions builder = new Actions(driver);
		builder.moveToElement(el).click().build().perform();
	}
	public void form_authention()
	{
		driver.findElement(By.className("username")).sendKeys("tomsmith");
		driver.findElement(By.className("password")).sendKeys("SuperSecretPassword");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}
	

}
