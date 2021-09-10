package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdown {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//a[text()='English (UK)']")).click();
		dr.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement drp = dr.findElement(By.id("day"));
		Select opt = new Select(drp);
				
		List<String> original = new ArrayList();
		for (WebElement e:opt.getOptions()) {
			original.add(e.getText());
			
		}
           List <String> temp = original;
           Collections.sort(temp);
           System.out.println(temp);
           System.out.println(opt.getOptions().size());
           
           dr.close();
	}

}
