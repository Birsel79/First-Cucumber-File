package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    @BeforeAll
    public static void initTest(){
        DriverSource.getDriver();
    }
    @AfterAll
    public static void endTest(){
        DriverSource.getDriver().quit();
    }

}
