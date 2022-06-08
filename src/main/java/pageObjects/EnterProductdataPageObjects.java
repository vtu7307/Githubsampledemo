package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Testbase;

public class EnterProductdataPageObjects extends Testbase {
	
	@FindBy(id="startdate")
	WebElement date_startdate;
	@FindBy(id="insurancesum")
	WebElement dd_insurancesum;
	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	
	@FindBy(xpath = "//input[@name='Optional Products[]']/parent::label")
	List<WebElement> chk_Optionalproducts;
	@FindBy(id="nextselectpriceoption")
	WebElement btn_next;
	
	public EnterProductdataPageObjects() {
		PageFactory.initElements(driver, this);
		
	}
	public void enterProductData() throws Exception {
		date_startdate.sendKeys("12/01/2022");
		cm.SelectDropDownButton(dd_insurancesum, "5.000.000,00");
		cm.SelectDropDownButton(dd_damageinsurance, "Full Coverage");
		cm.selectChecBoxes(chk_Optionalproducts, "Euro Protection");
	}
	public void ClickOnNextButton() {
		btn_next.click();
		
	}

}
