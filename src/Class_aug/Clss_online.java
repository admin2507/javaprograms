package Class_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clss_online {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement a = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions S = new Actions(driver);
        S.moveToElement(a).perform();
        driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
        
        driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
        Alert x = driver.switchTo().alert();
        System.out.println(x.getText());
        x.dismiss();
        driver.close();
	}

}
