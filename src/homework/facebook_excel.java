package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream js = new FileInputStream("./facebook.xlsx");
		Workbook wb = WorkbookFactory.create(js);
		String name = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String lastname = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		String phone = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		String pwd = wb.getSheet("sheet1").getRow(1).getCell(3).getStringCellValue();
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://en-gb.facebook.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		dr.findElement(By.name("firstname")).sendKeys(name);
		dr.findElement(By.name("lastname")).sendKeys(lastname);
		dr.findElement(By.name("reg_email__")).sendKeys(phone);
		dr.findElement(By.id("password_step_input")).sendKeys(pwd);
		
		WebElement drp = dr.findElement(By.id("day"));
		Select s = new Select(drp);
		s.selectByVisibleText("25");
		
		WebElement month = dr.findElement(By.id("month"));
		Select sr = new Select(month);
		sr.selectByValue("2");
		
		WebElement year = dr.findElement(By.id("year"));
		Select sr1 = new Select(year);
		sr1.selectByIndex(30);
		
		dr.findElement(By.name("sex")).click();
		dr.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		
		dr.close();
		
		
	}

}
