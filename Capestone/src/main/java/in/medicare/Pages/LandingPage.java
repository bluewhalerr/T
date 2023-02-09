package in.medicare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	
	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary pull-right')][1])")
	private WebElement aceclofenac;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement login;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickmedicine(){
		aceclofenac.click();
		
	}
	public void loginButton() {
		login.click();
	}
	
}
