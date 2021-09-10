package TEst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele1 = dr.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement ele2 = dr.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions a = new Actions(dr);
		Thread.sleep(3000);
		a.dragAndDrop(ele1, ele2).perform();
		Thread.sleep(3000);
		dr.close();
		

	}

}
