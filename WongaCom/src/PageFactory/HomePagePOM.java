package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='slide slide--horizontal product-card--three']//wn-product-card-instalment-6//wn-product-card//div[@class='product-card product-card--horizontal']//div[@class='mo-row']//div[@class='mo-col product-card__information-col']//div[@class='product-card__information product-card__information--horizontal']//a[@class='mo-btn--secondary -display-block product-card__btn wn-apply-btn product-card__btn--horizontal']")
	WebElement sixMonth;
	


	// ***********************************************************************
	public HomePagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ***********************************************************************

	public void SelectSixMonthLoanOption() {
		sixMonth.click();
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
		
		
	}
}
