import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.facebook.com/");
		wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wb.findElement(By.xpath("//a[text()='English (UK)']")).click();
		wb.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement day = wb.findElement(By.id("day"));
        Select s = new Select(day);
        
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(WebElement b:s.getOptions()) {
        	ar.add(Integer.parseInt(b.getText()));
        }
        Collections.sort(ar);
        System.out.println(ar);
        System.out.println("No of options are "+s.getOptions().size());
        wb.close();
	}

}
