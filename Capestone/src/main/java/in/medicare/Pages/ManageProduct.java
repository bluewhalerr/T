package in.medicare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProduct {
	@FindBy(id = "manageProduct")
	private WebElement manage;
	
	public ManageProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void manageProduct() {
		manage.click();
		
	}
}