import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver fr = new ChromeDriver();
		fr.manage().window().maximize();
		fr.get("https://demo.vtiger.com/vtigercrm/index.php");
		fr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username = fr.findElement(By.id("username"));
		username.clear();
		WebElement pwd = fr.findElement(By.id("password"));
		pwd.clear();
		fr.close();
		

	}

}
