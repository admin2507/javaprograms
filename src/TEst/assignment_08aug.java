package TEst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_08aug {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement search = dr.findElement(By.id("twotabsearchtextbox"));
		Actions s = new Actions(dr);
		s.contextClick(search).perform();
		Thread.sleep(3000);
		
		/*dr.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		WebElement ele = dr.findElement(By.name("q"));
		s.contextClick(ele).perform();
		Thread.sleep(5000);// using this just to view if correct */ //Ask bharni why right click stays in screen
		dr.close();
		

	}

}
