package twentyeightAug;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String user = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(url);
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.findElement(By.id("username")).sendKeys(user);
		dr.findElement(By.name("pwd")).sendKeys(pwd);
		dr.close();

	}

}
