package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

WebDriver driver =new ChromeDriver();

public class salesforce {

    @Given("user navigates to salesforce login page")
    public void loginpage() {
        driver.get("https://login.salesforce.com/?locale=in");

    }

    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {

        driver.findElement(By.id("id=\"username\"")).sendKeys("Kaleeshwari");
        driver.findElement(By)
    }

    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {
    }

    @When("user enters username {string} and Password {string}")
    public void userEntersUsernameAndPassword(String arg0, String arg1) {
    }
}
