package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectMode.LoginPageObject;
import PageObjectMode.SingUpPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class verifySingUpPage extends BaseClass
{
	@Test
	public void singup() throws IOException, InterruptedException
	{
		//some changes
		
		Thread.sleep(4000);
		LoginPageObject obj=new LoginPageObject(driver);
		obj.clickontryPageObject().click();
		
		
		SingUpPageObject obj1=new SingUpPageObject(driver); 
		Thread.sleep(2000);
		obj1.Firstname().sendKeys(Constants.Firstname);
		obj1.lastname().sendKeys(Constants.lastname);
		obj1.jobtitle().sendKeys(Constants.jobtitle);
		obj1.email().sendKeys(Constants.email);
		obj1.phone().sendKeys(Constants.phone);
		obj1.employees().click();
		obj1.company().clear();
		obj1.company().sendKeys(Constants.company);
		obj1.tuktuk().click();
			
		
		CommonMethod.selectdropdown(obj1.employees(), 1);
		CommonMethod.selectdropdown(obj1.company(), 2);
	}

}
