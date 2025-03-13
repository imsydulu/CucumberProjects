package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPage {

	WebDriver driver;
	Actions actions;

	@Given("i want open the browser and enter the url {string}")
	public void i_want_open_the_browser_and_enter_the_url(String string) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		actions = new Actions(driver);
		actions.scrollByAmount(0, 600).build().perform();
	}

	@Then("i should see the login page")
	public void i_should_see_the_login_page() {
		boolean loginDisplayed = driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed();
		assertTrue(loginDisplayed);
	}

	@When("i have to enter the username as {string}")
	public void i_have_to_enter_the_username_as(String string) {
		driver.findElement(By.name("username")).sendKeys(string);
	}

	@When("I shoud enter the password as {string}")
	public void i_shoud_enter_the_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I shoud click the login button")
	public void i_shoud_click_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("I verify login success")
	public void i_verify_login_success() {
		String errMsg = driver.findElement(By.xpath("//div[@id='flash']/b")).getText();
		assertEquals(true, errMsg.contains("invalid"));
	}

	@When("I close the browser")
	public void i_close_the_browser() {
		driver.quit();
	}

}
