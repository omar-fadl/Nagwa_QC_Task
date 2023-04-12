import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.nagwa.com/en");


    }



    @AfterTest
    public void closeDriver()  {



        driver.quit();
    }
}
