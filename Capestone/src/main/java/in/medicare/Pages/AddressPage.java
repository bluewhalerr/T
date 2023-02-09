package in.medicare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

	
	@FindBy(id ="addressLineOne")
	private WebElement lineone;
	
	@FindBy(id = "addressLineTwo")
	private WebElement linetwo;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "postalCode")
	private WebElement postal;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "country")
	private WebElement country;
	
	@FindBy(xpath = "//button[@name='_eventId_saveAddress']")
	private WebElement addadress;
	
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

	public void LineOne() {
		lineone.sendKeys("Mahatma Gandhi Road");
	}
	public void LineTwo() {
		linetwo.sendKeys("Salt Lake");
	}
	public void city() {
		city.sendKeys("Banglore");
	}
	public void Postal() {
		postal.sendKeys("12345");
	}
	public void State() {
		state.sendKeys("Karnataka");
	}
	public void Country() {
		country.sendKeys("INDIA");
	}
	public void AddAddress() {
		addadress.click();
	}
	
}	

	