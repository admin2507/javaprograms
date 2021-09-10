import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {

	public static void main(String[] args)  {
		WebDriver fr = new ChromeDriver();
		fr.manage().window().maximize();
		fr.get("https://www.amazon.com/");
		fr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = fr.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("phone");
		ele.submit();
	    fr.close();

	}

}
