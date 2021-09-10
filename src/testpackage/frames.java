package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {//redo

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.snapdeal.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = dr.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(dr);
		a.moveToElement(ele).perform();
		
		dr.findElement(By.xpath("//a[text()='login']")).click();
		dr.switchTo().frame(0);
		dr.findElement(By.id("userName")).sendKeys("7030286002");
		Thread.sleep(3000);
		dr.switchTo().defaultContent();
		dr.close();
	}

}
