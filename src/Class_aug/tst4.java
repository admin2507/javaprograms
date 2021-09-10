package Class_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tst4 {
//notification pop up 
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver dr = new ChromeDriver(options);
		dr.manage().window().maximize();
		dr.get("https://www.myntra.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.close();

	}

}
