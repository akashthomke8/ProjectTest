package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectMode.LoginPageObject;
import PageObjectMode.SingUpPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

 
public class VerfiyLoginPage extends BaseClass
{
	
	@Test(dataProvider="testData")
	public void login(String username, String password) throws IOException, InterruptedException
	{
	
		LoginPageObject obj=new LoginPageObject(driver);
		
		CommonMethod.HandleAssertion(driver.getCurrentUrl(), "https://login.salesforce.com/", "Ur is not Matching");
		
		obj.enterusername().sendKeys(username);
		obj.password().sendKeys(password);
		obj.loginClick().click();

		
		CommonMethod.HandleAssertion(obj.ShowErrorMsg().getText(), "Please check your username and password. If you still can't log in, contact your Salesforce administrator.", "Error massge is not matching");
		
		 /*	
		SoftAssert z=new SoftAssert();
		String Actual=obj.ShowErrorMsg().getText();		
		String Expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		z.assertEquals(Actual, Expected,"Error Massage is not matching");
		z.assertAll();*/
	
	}
	
	@DataProvider
	public Object[][]	testData()
	{
		
		Object[][]	data=new Object[3][2];
		data[0][0]=Constants.usrname1;
		data[0][1]=Constants.password1;
		data[1][0]=Constants.usrname2;
		data[1][1]=Constants.password2;
		data[2][0]=Constants.username3;
		data[2][1]=Constants.password3;
		
		return data;
	}
}
