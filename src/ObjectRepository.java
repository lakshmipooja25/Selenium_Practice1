import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ObjectRepository {
	
	static WebDriver driver;
	public static void main(String args[]) throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Practice1\\src\\Properties");
		p.load(fis);
		System.out.println("1");
		String brow_name=p.getProperty("browser");
		if (brow_name.equals("chrome")) {
			System.out.println(brow_name);
			System.setProperty("webdriver.chrome.driver", "D:\\LAKSH\\Selenium\\chromedriver.exe");
			//ChromeOptions option = new ChromeOptions();
			//option.addArguments("window-size-1400,800");
			//option.addArguments("headless");
			 driver=new ChromeDriver();
			
		}
		else if (p.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "D:\\LAKSH\\Selenium\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		
		else if (p.getProperty("browser").equals("IE")) {
			System.setProperty("webdriver.internetexplorer.driver", "D:\\LAKSH\\Selenium\\geckodriver.exe");
			 driver=new InternetExplorerDriver();
		}
		
		driver.get(p.getProperty("url"));
		WebElement login_button= driver.findElement(By.name("login"));
		//flash(login_button, driver);
		
		drawBorder(login_button, driver);
	}
	public static void flash(WebElement element, WebDriver driver)
	{
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	String green_color="rgb(0,200,0)";
	String ori_color=element.getCssValue("backgroundcolor");
	for (int i = 0; i < 100 ; i++) {
		color(green_color, element, driver);
		color(ori_color, element, driver);
	}
	
	}
	public static void color(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor=' "+color+"'", element);
	}
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.border='3px color red'", element);
	}
	
}
