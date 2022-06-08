package insuranceCalculation_Motorcycle;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.Testbase;

public class EndtoEndTests_motorCycle extends Testbase {
	/*
	 * @BeforeMethod public void SetUpMethod() throws Exception {
	 * LaunchBrowserandnavigate();
	 * 
	 * }
	 */
	/*
	 * @Test(priority = 2) public void insuranceCalculate_volvoMotor() throws
	 * Exception { System.out.println(driver.getTitle()); }
	 * 
	 * @Test(priority = 1) public void insuranceCalculate_FordMotor() {
	 * System.out.println(driver.getCurrentUrl()); }
	 * 
	 * @AfterMethod public void CleanUp() { driver.quit(); }
	 * 
	 */ @Test(priority = 1)
	public void insuranceCalculate() throws Exception {
		homepage.ClickOnMotorCycle();
		vehData.enterVehicleData();
		vehData.ClickonNextbuttonAfterVehicldata();
		insData.EnterInsurancedata();
		insData.ClickonnextButton();
		prodData.enterProductData();
		prodData.ClickOnNextButton();
		String Expectedprice = "238.00";
		String actualprice = priceoptions.getpriceforselectedoption("Silver");
		Assert.assertEquals(actualprice, Expectedprice);
		priceoptions.selectPriceOption("Silver");	
		priceoptions.pricenext();

	}

}
