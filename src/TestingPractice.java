import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingPractice {

	 
	static String url="http://newtours.demoaut.com";// test
	static String url2="https://demo.guru99.com/V4/";
	static String url3="http://demo.guru99.com/test/table.html";
	static String url4="http://demo.guru99.com/test/drag_drop.html";
	public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException  {
		WebDriver driver=null;
		 Workbook book;
		 Sheet sheet;
		System.setProperty("webdriver.chrome.driver", "D:\\LAKSH\\Selenium\\chromedriver.exe");
		//driver=new ChromeDriver(); 
		/*
		driver.get(url);
		driver.findElement(By.name("userName")).sendKeys("lakshmi");
		driver.findElement(By.name("password")).sendKeys("Saibabajii@25");
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTACT")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[type='text'][name='userName']")).sendKeys("lakshmi");
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("Saibabajii@25");
		driver.findElement(By.cssSelector("input[name$='word']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type='password'][name*='passw']")).sendKeys("Saibabajii@24");
		String date= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println(date);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\LAKSH\\Selenium\\Selenium Practice\\ScreenshotImages\\img.png"));
		
		
		/*
		driver.get(url2);
		String username=driver.findElement(By.xpath("//td[contains(text(),'UserID')]")).getText();
		System.out.println(username);
		driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("laksh");
		*/
		
		/*
		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.cssSelector("input#vfb-7-2")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='vfb-6-0']")).click();
		boolean displayString=driver.findElement(By.xpath("//input[@type='checkbox'][@value='checkbox2' and @id='vfb-6-1']")).isDisplayed();
		boolean selectedSring=driver.findElement(By.cssSelector("input[id='vfb-6-0']")).isSelected();
	
		System.out.println(displayString);
		System.out.println(selectedSring);
		String tagname=driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]")).getTagName();
		System.out.println(tagname);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
		Thread.sleep(3000);	
		*/
		
		                   // accessing table cell values
		
		/*
		driver.navigate().to(url);
		WebElement we=driver.findElement(By.xpath("//table[@width='270'][@cellpadding='2']"));
		
		List <WebElement> rows= we.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 1; i < rows.size()-3; i++) {
			List <WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 1; j < cols.size(); j++) {
				String values=cols.get(j).getText();
				
				System.out.println(values);
			}
		}
	
		*/
				//File src= new File ("D:\\LAKSH\\Selenium\\Selenium Practice\\TestDataDriven.xlsx");
				//XSSFWorkbook wb= new XSSFWorkbook(src);
				//XSSFSheet sheet= wb.getSheet("Sheet1");
				
		//		sheet.getRow(0).createCell(2).setCellValue(values);	
			//	System.out.println("1");
				//sheet.getRow(1).createCell(2).setCellValue(values);
				//sheet.getRow(2).createCell(2).setCellValue(values);
				//sheet.getRow(3).createCell(2).setCellValue(values);
				//sheet.getRow(4).createCell(2).setCellValue(values);
		/*	try
			{
				FileOutputStream out = new FileOutputStream(src);
				wb.write(out);
				wb.close();
			}
				catch (Exception e)
	            {
	                e.printStackTrace();
	            }
			*/	
			
		
		 /*                // Actions - Drag and Drop
		driver.navigate().to(url4);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\LAKSH\\Selenium\\Selenium Practice\\ScreenshotImages\\img.png"));*/
		
		/*                       read excel and write in Application
		driver.get(url);
		File src=new File ("D:\\LAKSH\\Selenium\\Selenium Practice\\TestDataDriven.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=  workbook.getSheet("Sheet1");
		
		int no_of_rows = sheet.getLastRowNum()-sheet.getFirstRowNum();
	
		for (int i = 1; i <=(no_of_rows-1); i++) {
			
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			driver.findElement(By.name("userName")).click();
			driver.findElement(By.name("userName")).clear();;
			driver.findElement(By.name("userName")).sendKeys(username);
			
			DataFormatter formatter = new DataFormatter();
			String val = formatter.formatCellValue(sheet.getRow(i).getCell(1));
			System.out.println(val);
						
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(val);
			}
			
		sheet.getRow(0).createCell(2).setCellValue("working");
		sheet.getRow(1).createCell(2).setCellValue("working");
		FileOutputStream out = new FileOutputStream(src);
		workbook.write(out);
		workbook.close();
		
		*/
		
		
		/* Amazon ------------------------ hover, ajax, window handling ----------------------------------- */
		/*
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		System.out.println("2");
		Actions action = new Actions(driver);

		WebElement prime =driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[contains(@class,'nav-line-2')]"));
		System.out.println("1");
		Thread.sleep(3000);
		
		action.moveToElement(prime).build().perform();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement prime_hover= driver.findElement(By.xpath("//a[@class='nav-action-button']//span[@class='nav-action-inner']"));
		wait.until(ExpectedConditions.elementToBeClickable(prime_hover));
		System.out.println("success");
		prime_hover.click();
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("horlicks");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		System.out.println("success 2");
		String parent_amazon=driver.getWindowHandle();

		for(int i=0;i<3;i++)
		{
		driver.findElement(By.xpath("//*[contains(text(),'Bournvita Health Drink, 2 kg')]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parent_amazon);
		Thread.sleep(3000);
		}
		Set <String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
			String main_window= i1.next();
			String child1=i1.next();
			String child2=i1.next();
			driver.switchTo().window(child1);
			System.out.println(driver.getTitle());
			String Price=driver.findElement(By.xpath("//span[contains(text(),'Inclusive of all taxes')]")).getText();
			System.out.println(Price);
			driver.switchTo().window(child2);
			System.out.println("child window 2 : "+driver.getTitle());
			*/
		
		//--------------------READING AND WRITING DATA FROM SAME SHEET------------------------------ 
		/*FileInputStream file = new FileInputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet1");
	
		int row_count=sheet.getLastRowNum();
		
		System.out.println("Row count"+row_count);
		int col_count = sheet.getRow(1).getLastCellNum();
		System.out.println("col count:"+col_count);
		
		for (int i = 1; i <= row_count; i++) {
			XSSFCell cell=sheet.getRow(i).getCell(1);
			String cell_value="";
			
		if (cell.getCellType()==CellType.NUMERIC) {
			cell_value=String.valueOf(cell.getNumericCellValue());
		}
		if (cell.getCellType()==CellType.STRING) {
			cell_value=cell.getStringCellValue();
		}
		
		if (Double.parseDouble(cell_value)>50) {
			sheet.getRow(i).createCell(2).setCellValue("aged");
		}
		}
		file.close();
		FileOutputStream out= new FileOutputStream("D:\\LAKSH\\Selenium//\\Selenium Practice\\TestParameterization.xlsx");
		wb.write(out);
		wb.close();*/
		
		//--------------------WRITING ALL SINGLE AMOUNT IN SHEEET FROM WEB PAGE TABLE TRIMMING "$" SYMBOL------------------------------ 
		/*
		driver.get("http://newtours.demoaut.com/index.php");
		WebElement we=driver.findElement(By.xpath("//table[@width='270']"));
		List <WebElement> list=we.findElements(By.tagName("tr"));
		String Amount_trimmed="";
		for (int i = 0; i < list.size()-4; i++) {
			List <WebElement> col=list.get(i).findElements(By.tagName("td"));
			for (int j = 1; j < col.size(); j++) {
				 String Amount= col.get(j).getText();
				 Amount_trimmed=Amount.substring(1, 4);
			}
		}
		
		FileInputStream file = new FileInputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		int row_count=sheet.getLastRowNum();
		System.out.println("Row count"+row_count);
		int col_count = sheet.getRow(1).getLastCellNum();
		System.out.println("col count:"+col_count);	

		System.out.println(Amount_trimmed);
			for (int k = 1; k <=row_count; k++) {
			sheet.getRow(k).createCell(1).setCellValue(Amount_trimmed);
			System.out.println("1");
			//String cell_value="";
			System.out.println("2");
			
		}
				file.close();
		FileOutputStream out= new FileOutputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		wb.write(out);
		wb.close();
		*/
		
		// --------------------WRITING ALL DOLLOR AMOUNT IN SHEEET FROM WEB PAGE TABLE------------------------------ 
		/*
		FileInputStream file = new FileInputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet3");
		int row_count=sheet.getLastRowNum();
		System.out.println("Row count"+row_count);
		int col_count = sheet.getRow(1).getLastCellNum();
		System.out.println("col count:"+col_count);	


		driver.get("http://newtours.demoaut.com/index.php");
		WebElement we=driver.findElement(By.xpath("//table[@width='270']"));
		List <WebElement> list=we.findElements(By.tagName("tr"));
		String Amount="";
		for (int i = 0; i < list.size(); i++) {
			List <WebElement> col=list.get(i).findElements(By.tagName("td"));
			for (int j = 1; j < col.size(); j++) {
				  Amount= col.get(j).getText();
				 //System.out.println(Amount);
				 
		}
			System.out.println(Amount);
			for (int k = 1; k <=row_count; k++) {
				sheet.getRow(k).createCell(1).setCellValue(Amount); 
				System.out.println("2");		
				
	}
			
		file.close();
		FileOutputStream out= new FileOutputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		wb.write(out);
		wb.close(); */
	
		// --------------------WRITING ENTIRE TABLE IN SHEEET FROM WEB PAGE TABLE------------------------------ 
		/*FileInputStream file = new FileInputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet4");
		int row_count=sheet.getLastRowNum();
		System.out.println("Row count"+row_count);
		driver.get("http://newtours.demoaut.com/index.php");
		WebElement we=driver.findElement(By.xpath("//table[@width='270']"));
		List <WebElement> list=we.findElements(By.tagName("tr"));
		String Amount_trimmed="";
		for (int i = 0; i < list.size(); i++) {
			List <WebElement> col=list.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < col.size()-1; j++) {
				 String countries= col.get(j).getText();
				 System.out.println("1");
				 for (int k = 1; k <=row_count; k++) {
						sheet.getRow(k).createCell(1).setCellValue(countries); 
						continue;
				 }			 
			}
		}
		for (int i = 0; i < list.size(); i++) {
			List <WebElement> col=list.get(i).findElements(By.tagName("td"));
			for (int j = 1; j < col.size(); j++) {
				 String amount= col.get(j).getText();
				 System.out.println("2");
				 for (int l = 1; l <=row_count; l++) {
						sheet.getRow(l).createCell(2).setCellValue(amount); 
				 } 
			}
		}	
		file.close();
		FileOutputStream out= new FileOutputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		wb.write(out);
		wb.close();
		*/
		
		// --------------------Read from sheet and write to web page----------------------------- 
		/*
		driver.get("http://newtours.demoaut.com/index.php");
		FileInputStream file = new FileInputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\TestParameterization.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet5");
		int row_count=sheet.getLastRowNum();
		System.out.println("Row count"+row_count);
		for (int i = 1; i <= row_count; i++) {
			String Country1=sheet.getRow(i).getCell(0).getStringCellValue();
			driver.findElement(By.name("userName")).sendKeys(Country1);
			
			for (int j = 1; j <= row_count; j++) {
				String price=String.valueOf(sheet.getRow(j).getCell(1).getNumericCellValue());
				driver.findElement(By.name("password")).sendKeys(price);
				driver.findElement(By.name("userName")).clear();
				driver.findElement(By.name("password")).clear();
				Thread.sleep(3000);
			}
		}
		file.close();
		*/
	/*
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("welcome");
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("q")));
		int count ;
		List <WebElement> we=driver.findElements(By.xpath("//*[@class='erkvQe']//li//span"));
		//*[@class='sbct sbhl']//child::li
		//*[@class='erkvQe']//
		//*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/div/div[2]/div/span/b
		System.out.println("The no of suggessions given the input"+we.size());
		try {
			for (int i = 1; i < we.size(); i++) {
				String values = we.get(i).getText();
				System.out.println(values);
				if (values.equals("welcome back")) {
					System.out.println("the match is complete");
					
						we.get(i).click();
					
				break;
				}
				
			}
			
		} catch (StaleElementReferenceException  e) {
			System.out.println("The element is found"+e);
		}
		*/
		
		//driver.get("http://demo.guru99.com/V1/index.php");
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"input[name='uid']\").value='laksh'");
		String text= js.executeScript("return document.querySelector(\"input[name='uid']\").innerHTML").toString();
		System.out.println(text);
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,500)");
		//window.scrollBy(0,document.body.scrollHeight) - scroll wholeweb page
		//document.querySelector("input[name='password']").scrollIntoView() --- scroll to particular element
		//window.history.back()--- navigate backpage
		//window.history.forward() --- navigate forward
	
		//WebElement userid_ele= driver.findElement(By.xpath("//*[contains(text(),'UserID')]"));
		//String userid=driver.findElement(By.xpath("//*[contains(text(),'UserID')]")).getText();
		//System.out.println(userid);
		
		//*driver.switchTo().frame("flow_close_btn_iframe");
		System.out.println("switched");
		Thread.sleep(3000);
		driver.findElement(By.id("closeBtn")).click();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement butttonreset = driver.findElement(By.name("btnReset"));
		
		changeColor(butttonreset, driver);
		*/
		
	/*	driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown open']//a[@role='menuitem'][contains(text(),'HTML')]")).click();
	*/
		
		
			/*FileInputStream fis= new FileInputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\DataProvider.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheet("Sheet1");
			int rowcount= sheet.getLastRowNum();
			for (int i = 1; i <= rowcount; i++) {
				String firstname=sheet.getRow(i).getCell(0).getStringCellValue();
				String lastname = sheet.getRow(i).getCell(1).getStringCellValue();
				String username = sheet.getRow(i).getCell(2).getStringCellValue();
				String password=sheet.getRow(i).getCell(3).getStringCellValue();
				String confirm_password=sheet.getRow(i).getCell(4).getStringCellValue();
			
		String [][] array=getdataExcel();
		System.out.println(array);
			
	}*/
	
	/*public static String[][] getdataExcel() throws IOException
	{
		FileInputStream fis= new FileInputStream("D:\\LAKSH\\Selenium\\Selenium Practice\\DataProvider.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		int rowcount= sheet.getLastRowNum();
		int colcount= 2;
		String[][] tabArray = new String[rowcount][colcount];
		for (int i = 1; i < rowcount; i++) {
			for (int j=1;j<2;j++) {              
				 
				    tabArray[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
		}}
		//System.out.println(tabArray);
		return tabArray;
	}*/
		
	/*driver.get("http://demo.guru99.com/V1/index.php");	
	Thread.sleep(3000);
	driver.switchTo().frame("flow_close_btn_iframe");
	Thread.sleep(1000);	
	driver.findElement(By.id("closeBtn")).click();
	System.out.println("The Video button closed successfully");
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.name("uid")).sendKeys("mngr242369");
	driver.findElement(By.name("password")).sendKeys("jemevyh");
	driver.findElement(By.name("btnLogin")).click();
	
	Thread.sleep(3000);
	driver.switchTo().frame("flow_close_btn_iframe");
	Thread.sleep(1000);	
	driver.findElement(By.id("closeBtn")).click();
	System.out.println("The Video button closed successfully");
	driver.switchTo().defaultContent();
	Thread.sleep(3000);*/
		
		/*ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("X://extension_3_40_1_0.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
	
	driver.findElement(By.xpath("//a[text()='New Account']")).click();*/
	
		
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("D:\\LAKSH\\Selenium\\Selenium Library\\AD Blocker\\AdBlock.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver1 = new ChromeDriver(options);
		//Thread.sleep(10000);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
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
		
		driver1.get("https://demo.guru99.com/V4/manager/Managerhomepage.php");
		
		driver1.findElement(By.xpath("//a[text()='New Account']")).click();
		driver1.findElement(By.name("cusid")).sendKeys("12345");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[text()='New Customer']")).click();
		
		
		
		
		/*int count= allwindows.size();
		for (String child : allwindows) {
			if (!mainwindow.equalsIgnoreCase(child)) {
				System.out.println(child);
				driver.switchTo().window(mainwindow);
			}
		}*/
		
		
		
		//driver.get("https://demo.guru99.com/V4/manager/Managerhomepage.php");
	}
	public static void changeColor(WebElement element, WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		//String color_bg=element.getCssValue("backgroundcolor");
		
		for (int i = 0; i < 500; i++) {
			highlight("#000000", element, driver);
			//highlight(color_bg, element, driver);
			
		}
		
				
	}
	public static void highlight(String color,WebElement element, WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundcolor='"+color+"'", element);
		//js.executeScript("arguments[0].style.border = '3px solid red '", arg1)
		Thread.sleep(5000);
	}
	
}
