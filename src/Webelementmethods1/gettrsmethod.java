package Webelementmethods1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettrsmethod {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//to find search button size 
	WebElement btn = dr.findElement(By.xpath("//button[text()='Search']"));
	Dimension size = btn.getSize();
	System.out.println("Height is "+size.getHeight());
	System.out.println("width is "+size.getWidth());

	//get text of button
	String text = btn.getText();
	System.out.println("text is "+text);
	
	//get x and y axis 0
	 Point axis = btn.getLocation();
	 System.out.println(axis.getX());
	 System.out.println(axis.getY());
	 
	 //get attributes 
	    WebElement attribute = dr.findElement(By.xpath("//div[text()=\"Jobs\"]"));
	    System.out.println(attribute.getAttribute("class"));
	
	    dr.close();
	}

}
