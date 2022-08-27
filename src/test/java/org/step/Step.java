package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step {
	WebDriver driver;
	@Given("user in facebook application")
	public void user_in_facebook_application() {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		driver=new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//driver = new EdgeDriver();
		//driver =new 
		driver.get("https://www.facebook.com");
    
	}

	@When("user enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		 txtEmail.sendKeys("Welcome");
		 WebElement txtPass = driver.findElement(By.id("pass"));
		 txtPass.sendKeys("Testing"); 
	}

	@When("user click login button")
	public void user_click_login_button() {
		WebElement findElement = driver.findElement(By.name("login"));
		   findElement.click();
	}

	@Then("Error page is displayed")
	public void error_page_is_displayed() {
		 System.out.println("error page is displayed"); 
	}



}
