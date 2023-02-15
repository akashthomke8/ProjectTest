package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	//same curret mistakes
	
	public static void selectdropdown(WebElement element, int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	
	
	public static void HandleAssertion(String Actual, String Expected, String Massage)
	{
		SoftAssert a=new SoftAssert();
		String ac=Actual;
		String Exp=Expected;
		a.assertEquals(ac,Exp,Massage);
		a.assertAll();
	}
}
