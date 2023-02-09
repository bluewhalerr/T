package in.medicare.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.medicare.Pages.AddressPage;
import in.medicare.Pages.CardPage;
import in.medicare.Pages.CartPage;
import in.medicare.Pages.CheckoutPage;
import in.medicare.Pages.LandingPage;
import in.medicare.Pages.ManageProduct;
import in.medicare.Pages.OrderConfirm;
import in.medicare.Pages.ProductPage;
import in.medicare.Pages.UserLogin;

public class Driver extends Tools {
	
	protected static LandingPage landingPage;
	protected static CartPage cartPage;
	protected static UserLogin userlogin;
	protected static CheckoutPage checkout;
	protected static AddressPage addressPage;
	protected static CardPage cardpage;
	protected static OrderConfirm orderconfirm;
	protected static ProductPage productpage;
	protected static ManageProduct manageproduct;
	public static void init() {
	System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
	driver = new ChromeDriver();
	landingPage = new LandingPage(driver);
	cartPage = new CartPage(driver);
	userlogin = new UserLogin(driver);
	checkout = new CheckoutPage(driver);
	addressPage = new AddressPage(driver);
	cardpage = new CardPage(driver);
	orderconfirm = new OrderConfirm(driver);
	productpage = new ProductPage(driver);
	manageproduct = new ManageProduct(driver);
}
}