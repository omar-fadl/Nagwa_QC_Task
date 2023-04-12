package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LessonWorkSheet {
    private WebDriver driver;
By questionsSection=By.xpath("//div[@class=\"instances\"]//div[@class=\"instance \"]");
    public LessonWorkSheet(WebDriver driver)  {

        this.driver=driver;
    }


    public int getQuestionsCount(){

    return driver.findElements(questionsSection).size();

    }
}
