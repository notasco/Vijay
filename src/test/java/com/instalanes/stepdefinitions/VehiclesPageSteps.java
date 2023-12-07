package com.instalanes.stepdefinitions;



import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.VehiclesPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehiclesPageSteps {
	WebDriver driver;
	@Given("the user is logged in")
	public void the_user_is_logged_in() {
		DriverFactory.getDriver().get("https://frontendnewopt.vercel.app/login");     
	    VehiclesPage vp = new VehiclesPage(DriverFactory.getDriver());
	    vp.usPwTxt("vijaybmvj.821@gmail.com", "HINATAmvj1189");
	    vp.loginBtn();
	}

	@When("the user clicks on Add Vehicle")
	public void the_user_clicks_on_add_vehicle() {
		 VehiclesPage vp = new VehiclesPage(DriverFactory.getDriver());
		    vp.carrer();
		    vp.vehicleButton();
		    vp.addVehicle();
	}
	
	@When("the user navigates to add a new vehicle with details:")
	public void the_user_navigates_to_add_a_new_vehicle_with_details(DataTable dataTable) {
		 List<Map<String, String>> vehicleDetails = dataTable.asMaps(String.class, String.class);

		    for (Map<String, String> details : vehicleDetails) {
		        String vehicleNumber = details.get("VehicleNumber");
		        String vehicleStatus = details.get("VehicleStatus");
		        // ... other details

		        // Your existing code to interact with the page using these details goes here
		        VehiclesPage vp = new VehiclesPage(DriverFactory.getDriver());
		        vp.vehicleNum(vehicleNumber);
		        vp.vehicleStsOpt();
		        vp.vehicleTyOpt();
	}
	}
	@When("the user clicks on the Marketplace button")
	public void the_user_clicks_on_the_marketplace_button() {
		
	    
	}

	@When("the user clicks on the Save button")
	public void the_user_clicks_on_the_save_button() {
	}

	@Then("verify that the vehicle is successfully registered")
	public void verify_that_the_vehicle_is_successfully_registered() {
	    
	}
}