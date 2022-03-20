package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
public static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		driver = new ChromeDriver();
	}

	@Test
	public void doLogin()
	{
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("amitkohli3969@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
	}

	@AfterSuite
		public void TearDown()
		{
			driver.quit();
	}
	}

