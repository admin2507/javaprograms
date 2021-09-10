package twentyeightAug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
   // find element by @findby 
	@FindBy(id = "username")
	private WebElement usernametb;
	
	//create a constructor initialisation
	public pom (WebDriver driver) {
	
		PageFactory.initElements(driver,this);
	}
		
	//utilization
	public void username(String name) {
		usernametb.sendKeys(name);
	}
	
	


}
