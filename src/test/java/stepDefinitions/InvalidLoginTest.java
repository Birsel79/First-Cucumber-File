package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvalidLoginTest extends BaseTest {

    @When("User enters invalid user name")
    public void userEntersInvalidUserName() {
        System.out.println("6");
        // driver.quit();
    }
    @And("User enters  user password")
    public void userEntersUserPassword() {
        System.out.println("7");
    }
    @And("User enters invalid user password")
    public void userEntersInvalidUserPassword() {
    }
    @Then("User should not login to system")
    public void userShouldNotLoginToSystem() {
        //driver.quit();
    }
}