import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
      /*  dr.findElement(By.id("email")).sendKeys("pp@gmail.com");
        dr.findElement(By.name("pass")).sendKeys("password");
        dr.findElement(By.name("login")).click();*/
		dr.findElement(By.cssSelector("input[type='text']")).sendKeys("pawarpv@gmail.com");
		dr.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("xxxx");
		dr.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        String url = dr.getCurrentUrl();
        String url2 = dr.getTitle();
        System.out.println(url);
        
        
        if(url2.contains("Facebook"))
        {
        	System.out.println("pass");
        }
        else {
        	System.out.println("fail");
        }dr.close();
	} 
	

}
