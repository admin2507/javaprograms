import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(3000);
		dr.findElement(By.id("usernameField")).sendKeys("pawarpv@outlook.com");
		dr.findElement(By.id("passwordField")).sendKeys("pooja9766");
		dr.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		dr.getCurrentUrl();
		String title = dr.getTitle();
		System.out.println(dr.getTitle());
		
		if (title.equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com")) {
			System.out.println("Success you are logged in");
		}
		else {
			System.out.println("Sorry Failure!");
		}
        dr.close();
	}

}
