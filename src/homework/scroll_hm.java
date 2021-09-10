package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_hm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.snapdeal.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-5000)");
		
		WebElement ele = dr.findElement(By.xpath("//p[text()='Shop on the Go']"));
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();
		
		js.executeScript("window.scrollBy("+x+" ,"+y+")");
		
		WebElement test = dr.findElement(By.xpath("(//div[text()='Maxbell USB Rechargeable Electronic Flameless Lighter'])[2]"));	
		Point loc = test.getLocation();
		int z = loc.getX();
		int q = loc.getY();
		
		js.executeScript("window.scrollBy("+z+","+q+")");
		
		dr.close();
		
		
		
		

	}

}
