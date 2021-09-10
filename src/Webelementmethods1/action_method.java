package Webelementmethods1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action_method {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//sendkeys,clear 
		WebElement search = dr.findElement(By.id("qsb-keyword-sugg"));
		search.sendKeys("Testing");
		search.clear();
		search.sendKeys("developement");
		
		//click
		WebElement button = dr.findElement(By.xpath("//button[text()=\"Search\"]"));
		button.click();
		
		dr.findElement(By.xpath("//div[text()='Login']")).click();
		dr.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		
		dr.close();
		
		

	}

}
