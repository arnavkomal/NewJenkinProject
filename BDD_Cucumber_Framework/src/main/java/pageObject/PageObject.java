package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageObject 
{
public static WebDriver driver;


public 	PageObject(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
	
//Object Repository
@FindBy(xpath="//input[@name='username']")
WebElement Username;
public void username(String userName) throws Exception
{
Username.sendKeys(userName);
//String getUser = Username.getAttribute("value");
//Assert.assertEquals(getUser, 1362);
}

//Object Repository
@FindBy(xpath="//input[@name='password']")
WebElement Password;
public void password(String passWord)
{
Password.sendKeys(passWord);
}


//Object Repository
@FindBy(xpath="//button[normalize-space()='Login']")
WebElement LoginBtn;
public void loginBtn()
{
LoginBtn.click();
}	


}
