package class_AugTwentytwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parelle {
	public WebDriver driver;
	@Parameters({"Selenium"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
