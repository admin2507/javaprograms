package TEst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(" https://demoapp.skillrary.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = dr.findElement(By.id("course"));
		Actions a = new Actions(dr);
		a.moveToElement(ele).perform();
		
		dr.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		WebElement bt = dr.findElement(By.id("add"));
		a.doubleClick(bt).perform();
		dr.close();
		

	}

}
