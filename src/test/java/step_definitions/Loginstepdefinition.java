package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinition {
	WebDriver driver;
	@Given("open the browser enter url")
	public void open_the_browser_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rudre\\Downloads\\chromedriver-win64-22thJune\\chromedriver-win64\\chromedriver.exe");
		    driver = new ChromeDriver();
	}

	@Given("make sure the url is validated")
	public void make_sure_the_url_is_validated() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("user enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("username")).sendKeys("tomsmithasdf");
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!asdf");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class='radius']")).click();
	}

	@Then("Login should happen successfully")
	public void login_should_happen_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user successfully loggedin");
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user successfully loggedin");
	}

}
