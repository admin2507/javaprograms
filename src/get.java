import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) {
		WebDriver fr = new ChromeDriver();
		fr.manage().window().maximize();
		fr.get("https://www.myntra.com/");
	    fr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebElement ele = fr.findElement(By.xpath("//input[@class =\"desktop-searchBar\"]"));
        Dimension size = ele.getSize();
        System.out.println("height is "+size.getHeight());
        System.out.println("width is "+size.getWidth());
        
        WebElement text = fr.findElement(By.xpath("//a[@data-group=\"home-&-living\"]"));
        System.out.println(text.getText());
        fr.close();
	}

}
