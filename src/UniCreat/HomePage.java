package UniCreat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod
	public void Openwebsite()
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.get("https://www.unicreds.com/contact-us");
		
	}
	@Test
	public void validdata()
	{
		driver.findElement(By.cssSelector("input[id='fullname']")).sendKeys("Abdulgaffoor");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abdulgaffoor565@gmail.com");
		driver.findElement(By.cssSelector("input[id='phone']")).sendKeys("7204746636");
	}
	
	@AfterMethod
	public void closewebsite()
	{
		driver.close();
	}

}