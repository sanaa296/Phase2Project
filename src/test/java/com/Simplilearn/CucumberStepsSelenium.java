package com.Simplilearn;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepsSelenium {
	static ChromeDriver chromeDriver;
	  @Given("user opens the {string} browser")
	    public void user_Open_Browser(String browser) {
		  chromeDriver = new ChromeDriver();
	    }
	    
	    
	    @When("user navigate to swiggy page")
	    public void user_Login_Page() {
	        chromeDriver.get("https://www.swiggy.com/");
	        System.out.println("open");
	        chromeDriver.manage().window().maximize();
	    }
	    
	    @And("user enter {string} page")
	    public void username() {
	        System.out.println("user add the number...");
	    }

	    
	    @Then("user can see profile page")
	    public void profilePage() {
	        System.out.println("the result should be 30...");
	        chromeDriver.quit();
	    }
}
