package in.medicare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirm {
	
	@FindBy(xpath = "//h3[contains(text(),'Your Order is Confirmed')]")
	private WebElement order;
	
	public OrderConfirm(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	public String OrderConfirmation() {
		String confirm = order.getText();
		return confirm;
	}
}
