package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.actitime.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.id("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		dr.findElement(By.id("container_users")).click();
		dr.findElement(By.xpath("//div[text()='New User']")).click();
		
		dr.findElement(By.xpath("//div[@class='components_switcher small off animated']")).click();		
   		dr.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		
		Alert cl = dr.switchTo().alert();
		cl.dismiss();
		
		dr.close();
	}

}
