package pages;

import java.io.Console;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;


public class loginPage extends pageObject {

	//credentials
	public final String UserNameStr = "tomsmith";
	public final String CorrectPasswordStr = "SuperSecretPassword!";
	public final String WrongPasswordStr = "abc123";
	public final String expectedMessage = "You logged into a secure area!";
	public final String  expectedInvalidMessage = "Your password is invalid!";

	//xpath
	public  By byuserNameInput = By.xpath("//div//input[@id='username']");
	public  By byPasswordInput = By.xpath("//div//input[@id='password']");
	public  By byloginButton = By.xpath("//div//button//i[@class='fa fa-2x fa-sign-in']");
	public  By byerrorMessage = By.xpath("//div[@class='flash error']");
	public  By bysuccessMessage = By.xpath("//div[@id='flash']");

	public loginPage(WebDriver driver) {
		super(driver);
	}

}
