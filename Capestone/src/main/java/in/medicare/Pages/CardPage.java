package in.medicare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPage {
	
	
	@FindBy(id = "cardNumber")
	private WebElement card;
	
	@FindBy(id = "expityMonth")
	private WebElement expirymonth;
	
	@FindBy(id = "expityYear")
	private WebElement expiryyear;
	
	@FindBy(id = "cvCode")
	private WebElement cvcode;
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg btn-block']")
	private WebElement pay;
	
	public CardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Card() {
		card.sendKeys("1122 2233");
	}
	public void Month() {
		expirymonth.sendKeys("10");
	}
	public void Year() {
		expiryyear.sendKeys("23");
	}
	public void CVCode() {
		cvcode.sendKeys("111");
	}
	public void Pay() {
		pay.click();
	}
}