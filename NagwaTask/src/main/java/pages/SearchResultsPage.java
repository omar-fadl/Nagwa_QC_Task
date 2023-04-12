package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private WebDriver driver;

    By result=By.xpath("//ul[@class=\"list\"]//li//a");

    public SearchResultsPage(WebDriver driver)  {

        this.driver=driver;
    }
 public LessonHomePage selectSecondLesson(){
        driver.findElements(result).get(1).click();
        return new LessonHomePage(driver);
 }
}
