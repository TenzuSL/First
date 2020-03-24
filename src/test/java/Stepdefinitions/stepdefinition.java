package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.automation.Base;

public class stepdefinition extends Base{
	
	
	@Before()
	public void chrome() throws IOException
	{   
	    intitatedriver();
		driver.manage().window().maximize();
	}
	@After()
	public void close()
	{	
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@Given("^initialise browser$")
	public void Initialise_Browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

	}
	
	@Given("^user is in the poorvika reg page$")
	public void user_in_poorvika_page()
	{
	     driver.get("https://www.poorvikamobile.com/register");	
	     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

		 
	}
	
	@Given("^user is in sip calculator page$")
	public void user_in_sip_page()
	{
	     	
		driver.get("https://sipcalculator.in/");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

		
	}

    
	@When("^user enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_valid_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		 driver.findElement(By.id("userid")).sendKeys("strArg1");
		 driver.findElement(By.id("pass")).sendKeys("strArg2");
		 driver.findElement(By.id("sgnBt")).click();
		 System.out.println(strArg1);
		 System.out.println(strArg2);
	}
	
	
		@When("^user enters details$")
	    public void details(DataTable data ) throws Throwable {
			List<List<String>> obj = data.raw();
			driver.findElement(By.id("input-firstname")).sendKeys(obj.get(0).get(0));
			driver.findElement(By.id("input-lastname")).sendKeys(obj.get(0).get(1));
			driver.findElement(By.id("input-email")).sendKeys(obj.get(0).get(2));
			driver.findElement(By.id("input-mobile")).sendKeys(obj.get(0).get(3));
			driver.findElement(By.id("input-telephone")).sendKeys(obj.get(0).get(4));
			driver.findElement(By.id("input-fax")).sendKeys(obj.get(0).get(5));
			
	    }
    
		@When("^user enters (.+) (.+) (.+)$")
	    public void user_enters(String amount, String period, String returns) throws Throwable {
			driver.findElement(By.id("amountInputField")).sendKeys(amount);
			driver.findElement(By.id("periodInputField")).sendKeys(period);
			driver.findElement(By.id("returnRateInputField")).sendKeys(returns);
			driver.findElement(By.id("calculateButton")).click();

	    }
   	
	@Then("^the home page is displayed$")
	public void result()
	{
		 System.out.println("Poorvika result");
	}
	
	@Then("^verify the calculated SIP result$")
	public void sip_result() {
		String Result = driver.findElement(By.id("maturity-amount")).getText();
		System.out.println(Result);
		
	}
	
	  @Given("^land in greenkart$")
	    public void land_in_greenkart() throws Throwable {
		      driver.get(prop.getProperty("url"));
	  
	    }

	    
	    @When("^select \"([^\"]*)\" and select count as \"([^\"]*)\"$")
	    public void select_something_and_select_count_as_something(String strArg1, String strArg2) throws Throwable {
	    	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
	        driver.findElement(By.cssSelector("a.increment")).click();	
	        driver.findElement(By.cssSelector("a.increment")).click();
	        System.out.println(strArg2);
	        Thread.sleep(5000);
	   	    }


	    @And("^add product to cart and checkout$")
	    public void add_product_to_cart_and_checkout() throws Throwable {
	    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();	
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    	Thread.sleep(5000);
	   	    }
	    
	    

	    @Then("^validate the selected item$")
	    public void validate_the_selected_item() throws Throwable {
	    	String result = driver.findElement(By.xpath("//p[@class='product-name']")).getText();
	    	System.out.println(result);
	    	Assert.assertTrue(result.contains("Cucumber"));
	    }

	   
	
	


	
}
 