package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Testbase;

public class EnterInsurancePageObjects extends Testbase {
	
	@FindBy(id="firstname")
	WebElement txt_firstname;
	@FindBy(id="lastname")
	WebElement txt_lastname;
	@FindBy(id="birthdate")
	WebElement date_birthdate;
	@FindBy(xpath = "//input[@name='Gender']/parent::label")
	List<WebElement> rdo_Gender;
	
	@FindBy(id="streetaddress")
	WebElement txt_streetaddress;
	@FindBy(id="country")
	WebElement dd_country;
	@FindBy(id="zipcode")
	WebElement txt_zipcode;
	@FindBy(id="city")
	WebElement txt_city;
	@FindBy(id="occupation")
	WebElement dd_occupation;
	@FindBy(xpath = "//input[@name='Hobbies']/parent::label")
	List<WebElement> chk_Hobbies;
	@FindBy(id="website")
	WebElement txt_website;
	@FindBy(id="picturecontainer")
	WebElement btn_picturecontainer;
	@FindBy(id="nextenterproductdata")
	WebElement btn_nextenterproductdata;
	//initialize driver
	public EnterInsurancePageObjects() {
		PageFactory.initElements(driver, this);
	}
	// Enter the Insurance data
	public void EnterInsurancedata() throws Exception {
		txt_firstname.sendKeys("Prabhakar");
		txt_lastname.sendKeys("KR");
		date_birthdate.sendKeys("12/05/1998");
		cm.SelectRadioButtonValue(rdo_Gender, "Male");
		txt_streetaddress.sendKeys("ABC");
		cm.SelectDropDownButton(dd_country, "India");
		txt_zipcode.sendKeys("517325");
		txt_city.sendKeys("MPL");
		cm.SelectDropDownButton(dd_occupation, "Employee");
		txt_website.sendKeys("google.com");
		cm.selectChecBoxes(chk_Hobbies, "Speeding,Other");
	}
	public void ClickonnextButton() {
		btn_nextenterproductdata.click();
	}

}
