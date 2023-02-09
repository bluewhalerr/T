package in.medicare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(xpath = "//a[@class='btn btn-success']")
	private WebElement addtocart;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickAddtoCart() {
		addtocart.click();
	}
}
