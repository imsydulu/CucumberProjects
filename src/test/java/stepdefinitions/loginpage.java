package stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage {
	WebDriver driver;

	@Given("i want to open a browser")
	public void i_want_to_open_a_browser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Given("enter the url {string}")
	public void enter_the_url(String string) {
		driver.get(string);
	}

	@Then("i am able to see the login page")
	public void i_am_able_to_see_the_login_page() {
		boolean flag = driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("i have to enter username {string}")
	public void i_have_to_enter_username(String string) {
		driver.findElement(By.name("username")).sendKeys(string);
	}

	@When("i have to enter the password {string}")
	public void i_have_to_enter_the_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("i have to click the login button")
	public void i_have_to_click_the_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("i am able to see welcomepage")
	public void i_am_able_to_see_welcomepage() {
		boolean flag = driver.findElement(By.xpath("//div/p[@class='has-text-align-center']/strong")).isDisplayed();
		assertTrue(flag);
	}

	@Then("i will close the browser")
	public void i_will_close_the_browser() {
		driver.quit();
	}

}
