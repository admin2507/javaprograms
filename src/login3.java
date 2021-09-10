import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver fr = new ChromeDriver();
		fr.manage().window().maximize();
		fr.get("https://www.timesjobs.com/");
        Thread.sleep(3000);
        fr.findElement(By.xpath("//a[text()=\"Login\"]")).click();
        Thread.sleep(2000);
        fr.findElement(By.id("j_username")).sendKeys("pawarpv@outlook.com");
        fr.findElement(By.id("j_password")).sendKeys("pooja9766");
        fr.findElement(By.xpath("//input[@type=\"button\"]")).click();
        String title = fr.getTitle();
        fr.getCurrentUrl();
        
        if(title.equals("Jobs Search | Recruitment | Employment | Job Vacancies | TimesJobs")) {
        	System.out.println("Success you are logged in");
        } else {
        	System.out.println("Failure!");
        }
        fr.close();
	}

}
