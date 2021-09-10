package twentyeightAug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
   @FindBy(name ="pwd")
   private WebElement pass;
   
   public pom2(WebDriver driver) {
	   PageFactory.initElements(driver,this);
   }
   
   public void pass(String password) {
	   pass.sendKeys(password);
   }
}
