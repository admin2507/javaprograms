package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hard_Assert {
     public WebDriver dr;
	@BeforeMethod
	public void Open() {
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.myntra.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@Test
	public void search() {
		dr.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("test");
		dr.findElement(By.xpath("//li[text()='Nude Twist']")).click();
		Reporter.log(dr.getTitle(),true);
		
		Assert.assertEquals(dr.getTitle(), "test");
		Reporter.log(dr.getCurrentUrl(),true);
	}
	
	@AfterMethod
	public void close() {
		dr.close();
	}


}
