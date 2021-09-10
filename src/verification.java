import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification {

	public static void main(String[] args) {
		WebDriver fr = new ChromeDriver();
		fr.manage().window().maximize();
		fr.get("https://www.facebook.com/");
	    fr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    fr.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
	   
	    WebElement username = fr.findElement(By.name("firstname"));
	    if(username.isDisplayed()) {
	    	System.out.println("pass");
	    }
	    else {
	    	System.out.println("Fail");
	    }
	
	    
	    WebElement checkbox = fr.findElement(By.name("sex"));
	if (checkbox.isSelected()) {
		System.out.println("checkbox is enabled");
	}else {
		System.out.println("checkbox is not selected");
	}

	
	WebElement button = fr.findElement(By.name("websubmit"));
	if (button.isEnabled()) {
		System.out.println("button is enabled");
	}else {
		System.out.println("button disabled");
	}
	
	fr.close();
	}
	

}
