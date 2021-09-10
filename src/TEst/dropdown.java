package TEst;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown = dr.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
        s.selectByIndex(2);
        Thread.sleep(3000);
        s.selectByValue("search-alias=beauty-intl-ship");
        Thread.sleep(3000);
        s.selectByVisibleText("Sports & Outdoors");
        //to get all the options in dropdown we use get option in select class
        List<WebElement> options = s.getOptions();
        System.out.println(options.size());

        for(WebElement b : options) {
        	System.out.println(b.getText());  // print list of dropdown
        }
        dr.close();
	}

}
