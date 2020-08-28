import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LexDataprovider {

	@DataProvider
	public Object[][] getdata() throws IOException
	{
			FileInputStream fileStream = new FileInputStream("E:\\LAKSH\\Selenium\\Selenium Practice\\DataDriven.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			
				Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
				for (int i = 0; i < sheet.getLastRowNum(); i++) {
					for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
						data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					// System.out.println(data[i][k]);
					}
				}
			
			return data;
	}


	@Test(dataProvider="getdata")	
	public void test(String username, String Password) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\LAKSH\\Selenium\\Selenium Library\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.name("firstName")).sendKeys(username);
		driver.findElement(By.name("lastName")).sendKeys(Password);
		
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("lastName")).clear();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}
}

