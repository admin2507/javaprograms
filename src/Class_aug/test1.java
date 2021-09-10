package Class_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.actitime.com");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.id("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		
		dr.findElement(By.id("ext-gen23")).click();
		dr.findElement(By.xpath("(//span[text()='27'])[2]")).click();
		Thread.sleep(3000);
		
		dr.close();
		

	}

}
