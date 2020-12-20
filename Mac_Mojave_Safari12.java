package stepDEfinATION;

import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Mac_Mojave_Safari12 {
	
	public static final String AUTOMATE_USERNAME = "sabbirahamed1";
	  public static final String AUTOMATE_ACCESS_KEY = "iamNWq4myp2Y1FJzpNxE";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws Exception {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os_version", "Mojave");
	    caps.setCapability("resolution", "1920x1080");
	    caps.setCapability("browser", "Safari");
	    caps.setCapability("browser_version", "12.1");
	    caps.setCapability("os", "OS X");
	    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
	    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    
driver.get("https://test.crowdstreet.com/invexp/properties/all?");
	    
	    driver.findElement(By.xpath("//a[@href = '/invexp/accounts/create-account/'][text()='Create An Account']")).click();
	    
	    long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("create_account_email")).clear();
		driver.findElement(By.id("create_account_email")).sendKeys("yogesh.lulla@crowdstreet.com" + currentTime);
		
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
		
		
		driver.findElement(By.xpath("//div[7]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[7]/div[1]/input[1]")).sendKeys("8622327878" + currentTime);
		
		driver.findElement(By.xpath("//div[9]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[9]/div[1]/input[1]")).sendKeys("621 SW Morrison St" + currentTime);
		
		driver.findElement(By.xpath("//div[10]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//div[10]/div[1]/input[1]")).sendKeys("Portland" + currentTime);
		
		driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/form/div[11]/div[1]/div[1]/div/input")).click();
		
	    driver.findElement(By.xpath("//div/div[@class='visible menu transition' and 2]/div[@class='item' and 37]")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/form/div[11]/div[2]/div[1]/input")).sendKeys("36117");

	    driver.findElement(By.xpath("//label[@class='_field_e1a40']/div[1]")).click();
	    
	    
	    driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div[1]/label/div")).click();
		
	    driver.findElement(By.xpath(".//*[@id='content-well']/div[1]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/label/div")).click();

	    driver.findElement(By.xpath("//div[1]/div[1]/iframe[1]")).click();
		
	    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	    
	    driver.findElement(By.xpath("html/body/div[2]/div/div[2]/section/div[2]/div[2]/button[1]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
	  }

}
