package in.medicare.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	
	@FindBy (xpath ="//input[contains(@type,'number')]")
	private WebElement pill;
	
	@FindBy (xpath = "//a[@class='btn btn-success btn-block']")
	private WebElement check;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void noOfPill() {
		pill.sendKeys("3");
	}
	
	public void clickCheckout() {
		check.click();
		}
}
