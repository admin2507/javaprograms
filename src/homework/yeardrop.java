package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yeardrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement er = driver.findElement(By.id("year"));
		Select s = new Select(er);
		List<WebElement> b = s.getOptions();
		System.out.println(b.size());
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(WebElement e:s.getOptions()) {
			ar.add(Integer.parseInt(e.getText()));
		}
	    Collections.sort(ar);
	    System.out.println(ar);
		driver.close();
		
	}

}
