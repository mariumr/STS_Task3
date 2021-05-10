package Outline;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Utilities;
import pages.loginPage;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAppLogin {

	WebDriver driver = null;
	loginPage login = new loginPage(driver);
	Utilities util = new Utilities();

	@Given("Browser is Open")
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", util.CHROME_DRIVER_LOCATION);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("User Navigates to Login Page")
	public void enterLoginPage() {

		driver.navigate().to(util.BASE_URL_Login);
	}

	@When("User Enters user name")
	public void enterUserName() throws InterruptedException {
		WebElement userName = driver.findElement(login.byuserNameInput);
		userName.sendKeys(login.UserNameStr);
		Thread.sleep(1000);
	}

	@When("User Enters password")
	public void enterPassword() throws InterruptedException {
		WebElement password = driver.findElement(login.byPasswordInput);
		password.sendKeys(login.CorrectPasswordStr);
		Thread.sleep(1000);
	   
	}

	@When("User Enters wrong password")
	public void enterWrongPassword() throws InterruptedException {
		WebElement Wrongpssword = driver.findElement(login.byPasswordInput);
		Wrongpssword.sendKeys(login.WrongPasswordStr);
		Thread.sleep(1000);
	}

	@When("User Clicks Login")
	public void clickLoginButton() throws InterruptedException {
		driver.findElement(login.byloginButton).click();
		Thread.sleep(1000);
	}

	@Then("Validate Login Message")
	public void checkSuccessMessage() {
		String message = driver.findElement(login.bysuccessMessage).getText();
		if(login.expectedMessage.equalsIgnoreCase(message));
		System.out.println("You logged into a secure area!");
		 
	}

	@Then("Validate Invalid Message")
	public void checkInvalidMessage() {
		String message = driver.findElement(login.byerrorMessage).getText();
		if(login.expectedInvalidMessage.equalsIgnoreCase(message));
		System.out.println("Your password is invalid!");
		 driver.close();
	}


}
