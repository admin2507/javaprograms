import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.monsterindia.com/rio/login");
		Thread.sleep(3000);
		dr.findElement(By.id("signInName")).sendKeys("pawarpv@outlook.com");
		dr.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Arjun*141#");
		dr.findElement(By.id("signInbtn")).click();
		dr.getCurrentUrl();
		String title = dr.getTitle();
				
		if(title.equals("Jobseeker's Sign in - Search & Apply to Latest Jobs Online | MonsterIndia"))
		{
			System.out.println("Success LOGGGED IN");
		}
		else {
			System.out.println("Failure!");
		}
		
        dr.close();
	}

}
