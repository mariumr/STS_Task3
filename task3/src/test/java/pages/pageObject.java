package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageObject {
	   //Creating instance of the driver
    protected WebDriver driver;

    public pageObject(WebDriver driver) {
        this.driver = driver;

        //Passing the driver to all pages to re-use
        PageFactory.initElements(driver,this);
    }
}
