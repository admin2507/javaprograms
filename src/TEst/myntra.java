package TEst;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// to have search suggestion in serach in myntra
public class myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.myntra.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	WebElement serach = dr.findElement(By.xpath("//input[@class='desktop-searchBar']"));
     serach.sendKeys("dress");
     List<WebElement> result = dr.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
     Thread.sleep(3000);
     System.out.println(result.size());
     
     for(WebElement b : result) {
    	 System.out.println(b.getText());
     }
     dr.close();
	}

}
