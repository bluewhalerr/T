package in.medicare.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(id = "brand")
	private WebElement brand;
	
	@FindBy(id = "description")
	private WebElement description;
	
	@FindBy(id = "unitPrice")
	private WebElement price; 
	
	@FindBy(xpath = "//button[contains(text(),'Add New Category')]")
	private WebElement add; 
	
	@FindBy(id = "quantity")
	private WebElement quantity; 
	
	@FindBy(xpath = "(//input[contains(@type,'submit')])[1]")
	private WebElement psave;

	@FindBy(xpath = "//input[contains(@name,'file')]")
	private WebElement file;
	
	@FindBy(xpath = "//div[contains(text(),'Product submitted successfully!')]")
	private WebElement sucess;
	
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void prodName() {
		name.sendKeys("Cold Syrup");
	}
	public void brandName() {
		brand.sendKeys("Natural");
	}
	public void Description() {
		description.sendKeys("Consume after meal");
	}
	public void Price() {
		price.sendKeys("5");
		
	}
	public void Quantity() {
		quantity.sendKeys("5");
		
	}
	public void AddProduct() {
		add.click();
	}
	
	public void Save() {
		psave.click();
		
	}
	public void AddFile() {
		file.sendKeys("C:\\Users\\User\\OneDrive\\Pictures\\Saved Pictures\\attachment_79406911.jpeg");
	
	}
	public String SucessMsg() {
		String msg = sucess.getText();
		return msg;
	}
	
}
