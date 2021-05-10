package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectRowPage extends pageObject  {

	public SelectRowPage(WebDriver driver) {
		super(driver);
	}

	//xpath
	public  By bySiblings = By.xpath("//h4[text()='Siblings']");
	public  By bySiblings2 = By.xpath("//div[@id='sibling-1.3']");
	public  By bySiblings3 = By.xpath("//div[@id='sibling-13.2']");
}
