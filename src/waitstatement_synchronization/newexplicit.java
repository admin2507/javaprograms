package waitstatement_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newexplicit {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/nlogin/login");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebDriverWait wt = new WebDriverWait(dr, 5);
		WebElement ele = dr.findElement(By.id("usernameField"));
		wt.until(ExpectedConditions.visibilityOf(ele)).sendKeys("pawarpv@outlook.com");
		
		WebElement pwd = dr.findElement(By.id("passwordField"));
		wt.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("pooja9766");
		
		WebElement button = dr.findElement(By.xpath("//button[text()=\"Login\"]"));
		wt.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String title = dr.getTitle();
		wt.until(ExpectedConditions.titleContains("Naukri"));
		System.out.println(title);
		
		if(title.equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com")) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("tst fail");
		}
		dr.close();
	}

}
// when any button like login or add to cart is taking time means a loading is displayed on the button then we can use explicit wait 