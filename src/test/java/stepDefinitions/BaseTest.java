package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  BaseTest {
    protected  WebDriver driver;
    public BaseTest(){
        this.driver=DriverSource.getDriver();
    }


}
