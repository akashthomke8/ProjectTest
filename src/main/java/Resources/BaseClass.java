package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public void driverInitilize() throws IOException
	{
		//This will Read Properties File
		FileInputStream fis=new FileInputStream("D:\\EDUCATION   FILES\\Software Testing File\\SeleniumTestNGmavenLK\\src\\main\\java\\Resources\\data.properties");
		
		//for access the properties file
		prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			//driver firefox
		}
		else
		{
			System.out.println("cant open browser");
		}
	}
	
	@BeforeMethod
	public void openurl() throws IOException 
	{
		driverInitilize();
		String urlname=prop.getProperty("url");
		driver.get(urlname);		
	}
	
	@AfterMethod
	public void close() throws IOException 
	{
		driver.quit();
			
	}
	
	
	
	
	
	
	
	
	
}
