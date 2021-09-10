package waitstatement_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
     				WebDriver driver = new ChromeDriver();
			       driver.manage().window().maximize();
			       driver.get("https://www.instagram.com/accounts/login/");
			       
			       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


			       WebDriverWait wait=new WebDriverWait(driver,5);
			       WebElement ele = driver.findElement(By.name("username"));
		           wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("hhjhfhhjh");

		         
			       
			       
			       
			       
			       driver.findElement(By.name("password")).sendKeys("fhghgfhg");
			       
			       
			       
			       WebElement btn = driver.findElement(By.xpath("//div[text()='Log In']"));
			       wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
			       
			       
			       String title = driver.getTitle();
			       wait.until(ExpectedConditions.titleContains("Login • Instagram"));
			       System.out.println(title);
			       
			      String url = driver.getCurrentUrl();
			      System.out.println(url);
			       
			       if(title.equals("Login • Instagram")) {
			    	   System.out.println("pass:home page is dispalyed");
			       }
			       else
			       {
			    	   System.out.println("Fail:home page is not dispalayed");
			       }
			       
			       driver.close();
				}
			
}


