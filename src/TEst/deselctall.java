package TEst;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselctall {

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
        
        System.out.println(s.isMultiple());
        
        if(s.isMultiple()) {
        	s.deselectAll();
        }
        Thread.sleep(3000);
        List<WebElement> options = s.getOptions();
       for(WebElement b:options)
       {
    	   System.out.println(b.getText());
       }
        System.out.println(options.size());
        
        dr.close();

	}

}
