package twentyeightAug;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream("./test.properties"));
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(p.getProperty("url"));
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		dr.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		dr.close();
	}

}
