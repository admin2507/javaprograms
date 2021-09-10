package Class_aug;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
//childbrowser pop up 
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String Parent = dr.getWindowHandle(); //get address of parent
		System.out.println(Parent);

		Set<String> child = dr.getWindowHandles(); //get address of parent & child
		System.out.println(child);
		System.out.println(child.size());
		child.remove(Parent);// remove the parent from list
		for(String b:child) {
			dr.switchTo().window(b);
			
			System.out.println(dr.getTitle());
			dr.close(); // close only child browsers
		}
		
		
		
		//dr.close(); // close only current open window
		//dr.quit(); // close all open windows
	}

}
