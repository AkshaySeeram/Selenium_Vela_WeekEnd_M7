package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.DemoWebShop_POM.Books_Page;
import Com.DemoWebShop_POM.CheckOut_Page;
import Com.DemoWebShop_POM.ShoppingCart_Page;

public class TC_003_Verify_User_is_able_to_place_order_or_not_Test extends BaseTest {

	@Test
	public void placeOrder() throws IOException, InterruptedException {
		System.out.println("Place Order");

		homePage.getSearchTextField().sendKeys(fileUtility.readDataFromPropertyFile("productName"));
		homePage.getSearchBtn().click();

		Books_Page bookPage = new Books_Page(driver);
		webDriverUtility.javaScriptClick(driver, bookPage.getAddTocart());

		Thread.sleep(2000);
		homePage.getShoppingCartLink().click();

		ShoppingCart_Page cartPage = new ShoppingCart_Page(driver);
		cartPage.getTermsOfServiceBtn().click();
		cartPage.getCheckoutBtn().click();

		CheckOut_Page checkOutPage = new CheckOut_Page(driver);
		checkOutPage.getContinueBtn().get(0).click();
		checkOutPage.getContinueBtn().get(1).click();
		checkOutPage.getContinueBtn().get(2).click();
		checkOutPage.getContinueBtn().get(3).click();
		checkOutPage.getContinueBtn().get(4).click();

		checkOutPage.getConfirmBtn().click();
		Thread.sleep(2000);
		webDriverUtility.webPageScreenshot(driver);

	}

}
