package Outline;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SelectRowPage;
import pages.Utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectRowStepDefination {
	
	WebDriver driver = null;
	SelectRowPage getRow = new SelectRowPage(driver);
	Utilities util = new Utilities();
	
	@Given("Browser is open")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", util.CHROME_DRIVER_LOCATION);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("Visit Home page")
	public void visitHomePage() {
		driver.navigate().to(util.BASE_URL_Large);
	}


	@Then("Select Row one")
	public void selectRowOne() throws InterruptedException {
		String Siblings = driver.findElement(getRow.bySiblings).getText();
		System.out.println(Siblings);
		Thread.sleep(2000);
	}

	@Then("Select Row two")
	public void selectRowTwo() throws InterruptedException {
		String Siblings2 = driver.findElement(getRow.bySiblings2).getText();
		System.out.println(Siblings2);
		Thread.sleep(2000);
	}

	@Then("Select Row three")
	public void selectRowThree() throws InterruptedException {
		String Siblings3 = driver.findElement(getRow.bySiblings3).getText();
		System.out.println(Siblings3);
		Thread.sleep(2000);

	}

}
