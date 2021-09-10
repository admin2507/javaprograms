import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attributeandlocation {

	public static void main(String[] args) {
		WebDriver fr = new ChromeDriver();
		fr.manage().window().maximize();
		fr.get("https://www.amazon.com/");
	    fr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   WebElement ele = fr.findElement(By.id("twotabsearchtextbox"));
	   Point loc = ele.getLocation();
	   System.out.println(loc.getX()+"X coordinates");
	   System.out.println(loc.getY()+"Y coordinates");
	   
	  WebElement text = fr.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
	  System.out.println(text.getAttribute("class"));
	  fr.close();
	   

	}

}
