package stepDEfinATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class C_Accredited_AccTest {
	
	public static WebDriver driver;
	
	
	@Given("^I open crowdstreet website$")
	public void i_open_crowdstreet_website() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://test.crowdstreet.com/invexp/properties/all?");
	    
	}

	@Given("^I click on create an account button$")
	public void i_click_on_create_an_account_button() throws Throwable {
		
		driver.findElement(By.xpath("//a[@href = '/invexp/accounts/create-account/'][text()='Create An Account']")).click();
	   
	}

	@When("^I enter email$")
	public void i_enter_email() throws Throwable {
		
		long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("create_account_email")).clear();
		driver.findElement(By.id("create_account_email")).sendKeys("yogesh.lulla@crowdstreet.com" + currentTime);
		
	

	}

	@When("^First name last name create password referred by$")
	public void first_name_last_name_create_password_referred_by() throws Throwable {
		long currentTime = System.currentTimeMillis();
		
		driver.findElement(By.xpath("//div[@class='input-container flex-input -left sc-bdVaJa hgkmdP']/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[@class='input-container flex-input -left sc-bdVaJa hgkmdP']/div[1]/input[1]")).sendKeys("Yogesh" + currentTime);

		driver.findElement(By.xpath("//div[2]/div[@class='input-container flex-input sc-bdVaJa hgkmdP' and 2]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[2]/div[@class='input-container flex-input sc-bdVaJa hgkmdP' and 2]/div[1]/input[1]")).sendKeys("Lulla" + currentTime);
		
		driver.findElement(By.xpath("//div[@class='input-container password-input sc-bdVaJa hgkmdP']/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[@class='input-container password-input sc-bdVaJa hgkmdP']/div[1]/input[1]")).sendKeys("Abcdef#1234" + currentTime);

		driver.findElement(By.xpath("//div[@class='input-container password-confirm-input no-match sc-bdVaJa hgkmdP']/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[@class='input-container password-confirm-input no-match sc-bdVaJa hgkmdP']/div[1]/input[1]")).sendKeys("Abcdef#1234" + currentTime);

		driver.findElement(By.xpath("//div[5]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[5]/div[1]/input[1]")).sendKeys("Client" + currentTime);

	}

	@When("^I enter phone number street address city$")
	public void i_enter_phone_number_street_address_city() throws Throwable {
		
		long currentTime = System.currentTimeMillis();
		
		driver.findElement(By.xpath("//div[7]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[7]/div[1]/input[1]")).sendKeys("8622327878" + currentTime);
		
		driver.findElement(By.xpath("//div[9]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[9]/div[1]/input[1]")).sendKeys("621 SW Morrison St" + currentTime);
		
		driver.findElement(By.xpath("//div[10]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[10]/div[1]/input[1]")).sendKeys("Portland" + currentTime);



	}

	@When("^Select state zipecode$")
	public void select_state_zipecode() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/form/div[11]/div[1]/div[1]/div/input")).click();
		
	    driver.findElement(By.xpath("//div/div[@class='visible menu transition' and 2]/div[@class='item' and 37]")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/form/div[11]/div[2]/div[1]/input")).sendKeys("36117");



	}

	@When("^Select country accredited investor$")
	public void select_country_accredited_investor() throws Throwable {
		
		driver.findElement(By.xpath("//label[@class='_field_e1a40']/div[1]")).click();
		
		


	}

	@When("^I click on I agree$")
	public void i_click_on_I_agree() throws Throwable {
		
		
		driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div[1]/label/div")).click();
		
		


	}

	@When("^I click I understand$")
	public void i_click_I_understand() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/label/div")).click();


	}

	@When("^Click on i am not a robot$")
	public void click_on_i_am_not_a_robot() throws Throwable {
		
		
		driver.findElement(By.xpath("//div[1]/div[1]/iframe[1]")).click();
		
		
		


	}

	@Then("^I click on complete your info$")
	public void i_click_on_complete_your_info() throws Throwable {
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		


	}

	@Then("^Verified congratulations$")
	public void verified_congratulations() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/section/div[2]/div[2]/button[1]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		
		
		
		


	}



}
