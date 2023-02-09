package in.medicare.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class UserLogin {
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//*[@value='Login']")
	private WebElement login;
	
	
	public UserLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void LoginToUser() {
		username.sendKeys("kn@gmail.com");
		password.sendKeys("12345");
		login.click();
	}
	public void adminLogin() {
		username.sendKeys("vk@gmail.com");
		password.sendKeys("admin");
		login.click();
	}
}
