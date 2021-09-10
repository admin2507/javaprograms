package twentyeightAug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.actitime.com/login.do");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = dr.findElement(By.id("username"));
		dr.navigate().refresh();
		//ele.sendKeys("abcgg"); we will get exception here as staleelement refrence execption beacuse we have refresed the page so element locator might get change thats why we use POM 
		pom p = new pom(dr);
		p.username("admin");
		//Thread.sleep(3000);
		
		pom2 p1 = new pom2(dr);
		p1.pass("manager");
		dr.close();

	}

}
