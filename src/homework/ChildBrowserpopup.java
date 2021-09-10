package homework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//close perticular window from childbrowser popup 
public class ChildBrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Set<String> child = dr.getWindowHandles();
		
		for(String b:child) {
			dr.switchTo().window(b);
			System.out.println(dr.getTitle());
			if(dr.getTitle().equals("Sykes")) {
				dr.close();
				}
		}

	}

}
