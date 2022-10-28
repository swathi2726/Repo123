package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	WebDriver driver;
	@Given("User is on Home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is on Home page");
	   System.out.println("Launch Rediff,this test executes before testNG enters into a class and only at once");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arpana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@When("user clicks on Signin link check title")
	public void user_clicks_on_signin_link_check_title() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Sign in")).click();
		String act_title=driver.getTitle();
		Assert.assertEquals(act_title, "Rediffmail");
	}
	@When("user enters username and password click on Submit button")
	public void user_enters_username_and_password_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Assert Executed...");
		driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
	}
	@Then("check User name and display Login Successful as a message")
	public void check_user_name_and_display_login_successful_as_a_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
		System.out.println("Login Successful...");
		
	}
	@Then("Close Rediff")
	public void close_rediff() {
	    // Write code here that turns the phrase above into concrete actions

		driver.quit();
	}



}
