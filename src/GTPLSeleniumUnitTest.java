import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

//test new

public class GTPLSeleniumUnitTest {

	public static void main(String args[]) throws InterruptedException, Exception
	{
		boolean temp;
		System.setProperty("webdriver.chrome.driver", "E:\\LAKSH\\Selenium\\Selenium Library\\Selenium Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("E:\\LAKSH\\Selenium\\Selenium Library\\AD Blocker\\AdBlock.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver1 = new ChromeDriver(options);
		//Thread.sleep(10000);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver1.manage().deleteAllCookies();
		String mainwindow=driver1.getWindowHandle();
		System.out.println(mainwindow);
		driver1.manage().window().maximize();
		
		Set <String> allwindows = driver1.getWindowHandles();
		Iterator<String> i1=allwindows.iterator();
		String s1=i1.next();
		String s2=i1.next();
		System.out.println(s1);
		System.out.println(s2);
		driver1.switchTo().window(s2);
		
		driver1.close();
		driver1.switchTo().window(s1);
		Thread.sleep(5000);
		
		driver1.get("http://demo.guru99.com/V1/html/Managerhomepage.php");
		
		
		driver1.findElement(By.xpath("//a[text()='New Customer']")).click();
		
		
		File src=new File ("E:\\LAKSH\\Selenium\\Selenium Practice\\GTPL Project\\DDT\\GTPL_TestNG_Data_Driven.xlsx");
		FileInputStream file=new FileInputStream(src);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet  = book.getSheet("New Customer");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		for (int i = 1; i <=(rowCount-1); i++) {
			//for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				DataFormatter formatter = new DataFormatter();
				
				String pin = formatter.formatCellValue(sheet.getRow(i).getCell(6));
	            String ph = formatter.formatCellValue(sheet.getRow(i).getCell(7));
	            System.out.println(pin);
	            System.out.println(ph);
	            driver1.findElement(By.name("pinno")).sendKeys(pin);
	            driver1.findElement(By.name("telephoneno")).sendKeys(ph);
		
			//}
		}
	         
		driver1.findElement(By.name("pinno")).clear();
		driver1.findElement(By.name("telephoneno")).clear();
		Thread.sleep(2000);
		for (int i = 2; i <=rowCount; i++) {
			//for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				DataFormatter formatter = new DataFormatter();
				
				String pin = formatter.formatCellValue(sheet.getRow(i).getCell(6));
	            String ph = formatter.formatCellValue(sheet.getRow(i).getCell(7));
	            System.out.println(pin);
	            System.out.println(ph);
	            driver1.findElement(By.name("pinno")).sendKeys(pin);
	            driver1.findElement(By.name("telephoneno")).sendKeys(ph);
		
			//}
		}    
		sheet.getRow(1).createCell(9).setCellValue("working");
		sheet.getRow(2).createCell(9).setCellValue("working");
		FileOutputStream out = new FileOutputStream(src);
		book.write(out);
		book.close();
		
	       
	   		/*String gender="female";
		String trimtest="anger  swdhiwj";
		WebElement maleele=driver1.findElement(By.xpath("//table[@class='layout']//tr[5]//td[2]//child::input[1]"));
		WebElement femaleele=driver1.findElement(By.xpath("//table[@class='layout']//tr[5]//td[2]//child::input[2]"));
		String male=maleele.getText();
		System.out.println(trimtest.trim());
		System.out.println(male);
		String female=femaleele.getText().trim();
		System.err.println(female);
		
		if (gender.equalsIgnoreCase("male"))
		{
			maleele.click();
			System.out.println("completed");
		}
		else if(gender.equalsIgnoreCase("female"))
		{
			femaleele.click();
			System.out.println("completed");
			
			
		}
		else
		{
			System.out.println("nothing is available");
		}
		
*/		
	}
}
