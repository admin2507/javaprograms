package TEst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assigment2_08aug {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//a[text()='English (UK)']")).click();
		dr.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement drp = dr.findElement(By.id("month"));
		Select S = new Select(drp);
		S.selectByIndex(2);
		S.selectByValue("4");
		S.selectByVisibleText("Dec");
		
		if(S.isMultiple()) {
			S.deselectAll();
		}
		
		//List<WebElement> opt = S.getOptions();
		
		
		ArrayList <String> ar = new ArrayList<String>();
		
			for(WebElement b:S.getOptions()) {
			//System.out.println(b.getText());
			ar.add(b.getText());
			}
		
		Collections.sort(ar);
		System.out.println(ar); 
		System.out.println(S.getOptions().size());//doubt why month is coming when i put this above
		
						
       dr.close();
	}

}
