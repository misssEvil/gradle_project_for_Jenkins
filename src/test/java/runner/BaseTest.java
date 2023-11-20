package runner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver;

    @BeforeEach
    protected void beforeMethod(){
        driver = BaseUtils.createDriver();
    }

    @AfterEach
    protected void afterMethod(){
        driver.quit();
    }

    protected WebDriver getDriver(){
        return driver;
    }

}
