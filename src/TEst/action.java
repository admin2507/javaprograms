package TEst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.myntra.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	WebElement ele = dr.findElement(By.xpath("//a[@data-group='women']"));
	Actions a = new Actions(dr);
	a.moveToElement(ele).perform();
	
	dr.findElement(By.xpath("//a[text()='Kurtas & Suits']")).click();
	dr.close();
		
	}

}
