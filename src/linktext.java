import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		WebDriver f = new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://demoapp.skillrary.com/");
		f.findElement(By.linkText("LOGIN")).click();
		f.findElement(By.partialLinkText("Forgot your")).click();
        f.close();
	}

}
