package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
/**
 * Unit test for simple App.
 */
public class LoginTest extends BaseTest{
    // @Test
    //public void firstTest() {
    //driver.manage().window().maximize();
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    // }
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.get("https://saucedemo.com/");
    }
        @When("User enters valid user name")
        public void userEntersValidUserName () {
            WebElement userNameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
            userNameInput.sendKeys("standard_user");
        }
        @And("User enters valid user password")
        public void userEntersValidUserPassword () {
            WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
            passwordInput.sendKeys("secret_sauce");
        }
         @And("User clicks login button")
         public void userClicksLoginButton () {
             WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
             loginBtn.click();
    }
        @Then("User should successfully login to system")
        public void userShouldSuccessfullyLoginToSystem () {

            Assert.assertFalse(false);
            //driver.quit();
        }
      /*  @Then("User should not login to system")
        public void userShouldNotLoginToSystem () {
            driver.quit();

        }

        @When("User enters invalid username")
        public void userEntersInvalidUserName () {
            System.out.println("6");
           // driver.quit();
        }

        @And("User enters  user password")
        public void userEntersUserPassword () {
            System.out.println("7");
           // driver.quit();
        }

        /*@And("User enters invalid user password")
        public void userEntersInvalidUserPassword () {
            System.out.println("8");*/
            //driver.quit();
        }


