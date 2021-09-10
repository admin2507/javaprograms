import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();  // to maximize
         c.get("https://www.amazon.com/");
         System.out.println(c.getTitle());
         System.out.println(c.getCurrentUrl());
       c.close();
	}

}
