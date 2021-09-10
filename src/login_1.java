import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("poojavpawar");
		driver.findElement(By.name("password")).sendKeys("Rekha@9766");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Instagram")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		driver.close();
	}

}
