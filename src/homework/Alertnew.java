package homework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertnew {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.actitime.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.id("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		dr.findElement(By.id("container_users")).click();
		dr.findElement(By.xpath("//div[text()='New User']")).click();
		
		
        dr.switchTo().activeElement();
        //Actions a = new Actions(dr);
       
       WebElement cl = dr.findElement(By.id("createUserPanel_lastNameField"));
      // a.moveToElement(cl).click().perform();
       Thread.sleep(3000);
       cl.sendKeys("ppp");
       dr.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
      
       Alert al = dr.switchTo().alert();
	   al.dismiss();
       
       TakesScreenshot ts = (TakesScreenshot) dr;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File dest = new File("./photo/alert1.png");
       FileUtils.copyFile(src, dest);
       
       dr.close();
	}

}
