package stepDefinition;








import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageObject;




public class StepDefinition 
{
public static WebDriver driver;
public static PageObject pageobject;

@Given("User is on OrangeHRM page as {string}")
public void user_is_on_orange_hrm_page_as(String Url) throws Exception 
{
System.setProperty("webdriver.chrome.driver","WebDriver\\chromedriver.exe");
driver= new ChromeDriver();	
driver.manage().window().maximize();	
driver.get(Url);
pageobject = new PageObject(driver);
Thread.sleep(3000);
}

@When("User enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String User, String Pass) throws Exception 
{
pageobject.username(User);
pageobject.password(Pass);
}

@Then("User will login on main page sucessfully.")
public void user_will_login_on_main_page_sucessfully() 
{
pageobject.loginBtn();
}

}
