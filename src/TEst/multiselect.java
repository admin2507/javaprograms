package TEst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(" https://demoapp.skillrary.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement multi = dr.findElement(By.id("cars"));
       Select s = new Select(multi);		
        s.selectByIndex(1);
        s.selectByValue("199");
        Thread.sleep(3000);       
        s.deselectByIndex(1);
        Thread.sleep(3000);
        s.deselectByValue("199");
        Thread.sleep(3000);
        dr.close();
	}

}
