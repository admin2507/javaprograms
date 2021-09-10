import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://in.indeed.com/?r=us");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		dr.findElement(By.id("login-email-input")).sendKeys("pawarpv@outlook.com");
		dr.findElement(By.name("__password")).sendKeys("Rekha@9766");
		//dr.findElement(By.id("login-submit-button")).click(); by id 
		dr.findElement(By.xpath("//button[text()=\"Sign In\"]")).click(); //by xpath using text
		dr.getCurrentUrl();
		String title = dr.getTitle();
		System.out.println(title);
		
		if(title.equals("Job Search India | Indeed")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
        dr.close();
	}

}
