package step;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstep {

	public WebDriver driver;

	@Given("^User is on the Facebook page$")
	public void user_is_on_the_Facebook_page() {

		System.out.println("User is on the Facebook page");

//		 System.setProperty("webdriver.ie.driver",
//		 "C:\\Users\\RAJESH\\Desktop\\workspace\\Cucumber\\driver1\\IEDriverServer.exe");
//		 driver = new InternetExplorerDriver();
//		 driver.get("https://www.facebook.com/");
	}

	@When("^User enters the username and password$")
	public void user_enters_the_username_and_password() {

		System.out.println("User enters the username and password");

//		 driver.findElement(By.id("email")).sendKeys("rajesh.business7@gmail.com");
//		 driver.findElement(By.id("pass")).sendKeys("cucumber@123");
	}

	@Then("^User clicks the login button$")
	public void user_clicks_the_login_button() {

		System.out.println("User clicks the login button");

//		 driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
