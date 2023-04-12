package pages;

import net.bytebuddy.asm.Advice;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class HomePage {





  private   WebDriver driver;
  private By languagesListIcon=By.xpath("//div[@class=\"user-actions\"]//li[@class=\"dropdown\"]//a[@href=\"#\"]//i[@class=\"f-icon arrow-head-down-icon\"]");

  //private By englishLanguage=By.linkText("English");
  private By searchIcon=By.xpath("//div[@class=\"search\"]//button[@type=\"button\"]");
  private By searchInput=By.xpath("//div[@class=\"search active\"]//input[@id=\"txt_search_query\"]");

  //passing driver through constrctor
    public HomePage(WebDriver driver)  {

        this.driver=driver;
    }


    public void selectLanguage(String language){
        driver.findElement(languagesListIcon).click();

        driver.findElement(By.linkText(language)).click();


    }
    public SearchResultsPage search(String query){
        driver.findElement(searchIcon).click();
        driver.findElement(searchInput).sendKeys(query);
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
       return new SearchResultsPage(driver);
    }

    }

