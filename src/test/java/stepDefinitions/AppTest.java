package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void firstTest() {
        /*
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://saucedemo.com/");

        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.click();

        driver.quit();

         */

    }

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on login page");
    }

    @When("User enters valid user name")
    public void userEntersValidUserName() {
        System.out.println("1");
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        System.out.println("2");
    }

    @And("User enters valid user password")
    public void userEntersValidUserPassword() {
        System.out.println("3");
    }

    @Then("User should successfully login to system")
    public void userShouldSuccessfullyLoginToSystem() {
        System.out.println("4");
    }

    @Then("User should not login to system")
    public void userShouldNotLoginToSystem() {
        System.out.println("5");
    }

    @When("User enters invalid user name")
    public void userEntersInvalidUserName() {
        System.out.println("6");
    }

    @And("User enters  user password")
    public void userEntersUserPassword() {
        System.out.println("7");
    }

    @And("User enters invalid user password")
    public void userEntersInvalidUserPassword() {
        System.out.println("8");
    }
}
   

