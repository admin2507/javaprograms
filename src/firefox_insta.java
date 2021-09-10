import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefox_insta {

	public static void main(String[] args) throws InterruptedException {
		WebDriver fr = new FirefoxDriver();
		fr.manage().window().maximize();
		fr.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		fr.findElement(By.name("username")).sendKeys("poojavpawar");
		//fr.findElement(By.cssSelector("input['name'='username']")).sendKeys("poojavpawar");
		fr.findElement(By.name("password")).sendKeys("Rekha@9766");
        fr.findElement(By.xpath("//div[text()='Log In']")).click();
		String g = fr.getTitle();
		System.out.println(fr.getCurrentUrl());
		
		if(g.equals("Login • Instagram")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test fail");
		}
		fr.close();

	}

}
