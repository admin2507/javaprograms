package homework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_hm {

	public static void main(String[] args) throws IOException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//a[@role='button']")).click();
		dr.switchTo().frame(0);  // if we dont write this statement then we dont get following element so we will get no such element exception
		dr.findElement(By.xpath("//span[text()='Calendar']")).click();
	    dr.switchTo().defaultContent();
	    
	    TakesScreenshot ts = (TakesScreenshot) dr;
		File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("./photo/chrome.png");
        FileUtils.copyFile(source, destination);
		
		dr.close();
		
				
	}

}
// to check if frame is there we just need to right click and check if we can see view frame source or reload frame