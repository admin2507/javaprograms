package Class_aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/account/register/basicdetails");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.name("userType")).click();
		dr.findElement(By.name("uploadCV")).sendKeys("E:\\CV's\\Pooja CV.docx");
		Thread.sleep(3000);
		dr.close();
	}

}
