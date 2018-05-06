package javaPractice;
		import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	
		public class CalendarHandling {
		 
			public static void main(String[] args) 
			{
				
				//System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");
				
/*				WebDriver driver=new FirefoxDriver();
		 
				driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
				
				driver.findElement(By.id("datepicker")).click();
							
				List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
				for(WebElement ele:allDates)
				{
					
					String date=ele.getText();
					
					if(date.equalsIgnoreCase("28"))
					{
						ele.click();
						break;
					}
					
				}
*/		
				
				//Start browser
				WebDriver driver = new FirefoxDriver();

				//maximize browser
				driver.manage().window().maximize();

				driver.get("http://seleniumpractise.blogspot.co.uk/2016/08/how-to-handle-calendar-in-selenium.html");

				//add implicit wait
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

				driver.findElement(By.id("datepicker")).click();

				//find the xptah of all the TD elements
				List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

				for(WebElement W:allDates)
				{
				String text = W.getText();
				if(text.equalsIgnoreCase("6"))
				{
				W.click();
				break;
				} 
				else
				{
				//System.out.println("Couldnt find the text");
				}
				} 
				//driver.quit();
				
			}
		 }
