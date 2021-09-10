package homework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {
//close the file download pop up 
	public static void main(String[] args) throws AWTException {
			WebDriver dr = new FirefoxDriver();
			dr.manage().window().maximize();
			dr.get("https://www.selenium.dev/downloads/");
			dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			dr.findElement(By.xpath("//a[text()='4.0.0-beta-4']")).click();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			dr.close();
			

	}

}
