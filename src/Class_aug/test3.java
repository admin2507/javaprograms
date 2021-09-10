package Class_aug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {

	public static void main(String[] args) throws AWTException {
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.selenium.dev");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//span[text()='Downloads']")).click();
		//dr.findElement(By.linkText("https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.0.0-beta-4/selenium-server-4.0.0-beta-4.jar")).click();
		dr.findElement(By.xpath("//a[text()='4.0.0-beta-4']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		dr.close();
		
		

	}

}
