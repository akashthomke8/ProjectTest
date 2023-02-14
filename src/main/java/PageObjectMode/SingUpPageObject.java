package PageObjectMode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class SingUpPageObject
	{
		public WebDriver driver;
		
		private By Firstname=By.xpath("//input[@name='UserFirstName']");
		private By lastname=By.xpath("//input[@name='UserLastName']");
		private By jobtitle=By.xpath("//input[@name='UserTitle']");
		private By email=By.xpath("//input[@name='UserEmail']");
		private By phone=By.xpath("//input[@name='UserPhone']");
		private By employees=By.xpath("//select[@id='CompanyEmployees-6q2t']");
		private By company=By.xpath("//input[@name='CompanyName']");
		private By state=By.xpath("//select[@name='CompanyState']");
		private By tuktuk=By.xpath("//div[@class='checkbox-ui']");
		
		
	
		
		
		public SingUpPageObject(WebDriver driver2)
		{
			this.driver=driver2;	
		}
		
		public WebElement Firstname()
		{
			return driver.findElement(Firstname);
		}
		public WebElement lastname()
		{
			return driver.findElement(lastname);
		}
		public WebElement jobtitle()
		{
			return driver.findElement(jobtitle);
		}
		public WebElement email()
		{
			return driver.findElement(email);
		}
		public WebElement phone()
		{
			return driver.findElement(phone);
		}
		public WebElement employees()
		{
			return driver.findElement(employees);
		}
		public WebElement company()
		{
			return driver.findElement(company);
		}
		public WebElement state()
		{
			return driver.findElement(state);
		}
		public WebElement tuktuk()
		{
			return driver.findElement(tuktuk);
		}
		
		
		
	
	}
