package in.medicare.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import in.medicare.Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyApillSteps extends Driver {
		
	@Given("the user is on the landing page of the Medicare")
	public void the_user_is_on_the_landing_page_of_the_medicare() {
		//to perform Scroll on application using Selenium
		Assert.assertTrue(driver.getTitle().equals("Medicare - Home"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	@When("clicks on the view form the displayed pills")
	public void clicks_on_the_view_form_the_displayed_pills() {
		landingPage.clickmedicine();   
	}

	@When("he clicks on Add To Cart button")
	public void he_clicks_on_add_to_cart_button() throws InterruptedException {
		Thread.sleep(2000);
		cartPage.clickAddtoCart();
	    
	}

	@When("he login as a user and clicks on the login button")
	public void he_login_as_a_user_and_clicks_on_the_login_button() {
		userlogin.LoginToUser();
	    
	}

	@When("he clicks on the checkout button")
	public void he_clicks_on_the_checkout_button() throws InterruptedException {
		Thread.sleep(2000);
		checkout.clickCheckout();
	    
	}

	@When("he enters the delivery address and clicks on the add address button")
	public void he_enters_the_delivery_address_and_clicks_on_the_add_address_button() throws InterruptedException {
		addressPage.LineOne();
		addressPage.LineTwo();
		addressPage.city();
		addressPage.Postal();
		addressPage.State();
		addressPage.Country();
		Thread.sleep(4000);
		addressPage.AddAddress();    
	}

	@When("he enters the card number for payment and click on the pay button")
	public void he_enters_the_card_number_for_payment_and_click_on_the_pay_button() throws InterruptedException {
		cardpage.Card();
		cardpage.Month();
		cardpage.Year();
		cardpage.CVCode();
		Thread.sleep(4000);
		cardpage.Pay();
	    
	}

	@Then("he should be able to purchase a pill sucessfully")
	public void he_should_be_able_to_purchase_a_pill_sucessfully() {
		String expectedMsg = "Your Order is Confirmed!!";
		String actualMsg = orderconfirm.OrderConfirmation();
		Assert.assertEquals(actualMsg,expectedMsg);
	   
	}
	@Given("the user is on the landing page of the Medicare click the login button")
	public void the_user_is_on_the_landing_page_of_the_medicare_click_the_login_button() throws InterruptedException {
	    Thread.sleep(2000);
		landingPage.loginButton();
	}
	@When("he login as a admin")
	public void he_login_as_a_admin() {
		userlogin.adminLogin();
	    
	}
	@When("he clicks on the manage product button")
	public void he_clicks_on_the_manage_product_button() throws InterruptedException {
		 Thread.sleep(2000);
		manageproduct.manageProduct();
	    
	}
	@When("he adds the product and save")
	public void he_adds_the_product_and_save() throws InterruptedException {
		//productpage.AddProduct();
		Thread.sleep(2000);
		productpage.prodName();
		productpage.brandName();
		productpage.Description();
		productpage.Price();
		productpage.Quantity();
		Thread.sleep(2000);
		productpage.AddFile();
		productpage.Save();
	}
	@Then("he sees the product added sucessful message")
	public void he_sees_the_product_added_sucessful_message() {
		String expectedMsg = "Product submitted successfully!";
		String actualMsg = productpage.SucessMsg();
		Assert.assertEquals(actualMsg,expectedMsg);
	   
	}

}
