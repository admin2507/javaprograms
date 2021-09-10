import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		Thread.sleep(3000);
		dr.findElement(By.id("email")).sendKeys("pawarpv2507@gmail.com");
		dr.findElement(By.name("pass")).sendKeys("ppp");
		dr.findElement(By.name("login")).click();
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		dr.close();

	}

}
