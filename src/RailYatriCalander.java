import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailYatriCalander {
	static WebDriver driver;
	
	public static void calenderCall(String day)
	{
		boolean flag=false;
		String dates = null;
		String xpath_before="//*[@class='datepicker-days']//table[@class=' table-condensed']//tbody//tr[";
		String xpath_after= "]//td[";
		for (int rownum=1; rownum <=6; rownum++) {
			for (int colnum = 1; colnum <=7; colnum++) {
				WebElement dateselement = driver.findElement(By.xpath(xpath_before+rownum+xpath_after+colnum+"]"));
				dates=driver.findElement(By.xpath(xpath_before+rownum+xpath_after+colnum+"]")).getText();
				
				System.out.println(dates);
				if (dates.equals(day) && dateselement.isEnabled()) {
					System.out.println("matched");
					System.out.println("enter valid dates");
					flag=true;
					break;
				}			
			}
			if (flag) {
				break;
				
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\LAKSH\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.railyatri.in/");	
		
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker_bus")).click();
		String date= "15-January-2020";
		String date_val[]=date.split("-");
		String day=date_val[0];
		String month=date_val[1];
		String year=date_val[2];	
	
		WebElement JanEle=driver.findElement(By.xpath("//*[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr[1]//th[@class='datepicker-switch' and contains(text(),'January')]"));
		//WebElement FebEle=driver.findElement(By.xpath("//*[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr[1]//th[@class='datepicker-switch' and contains(text(),'February')]"));
		String jan=JanEle.getText();
		String jan1=jan.substring(0,jan.length()-4);
		System.out.println(jan1);
		if (month.equals(jan1)) {
			System.out.println("working");
			RailYatriCalander.calenderCall(day);
			System.out.println("working1");
			//driver.findElement(By.xpath("//*[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr[1]//th[@class='next']")).click();
		}	
		
		/*else 
		{
			
			driver.findElement(By.xpath("//*[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr[1]//th[@class='next']")).click();
			WebElement FebEle=driver.findElement(By.xpath("//*[@class='datepicker-days']//table[@class=' table-condensed']//thead//tr[1]//th[@class='datepicker-switch' and contains(text(),'February')]"));
			String feb=FebEle.getText();
			String feb1=feb.substring(0,feb.length()-4);
			System.out.println(feb1);
			if (month.equals(feb1)) {
				System.out.println("feb");
			RailYatriCalander.calenderCall(day);
			
			}
			
			
		}*/
		
		
	}
}
