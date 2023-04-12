package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonHomePage {
    private WebDriver driver;
    By workSheetSection=By.xpath("//div[@class=\"question-preview\"]//a");


    public LessonHomePage(WebDriver driver)  {

        this.driver=driver;
    }
    public LessonWorkSheet openLessonWorkSheet(){
        driver.findElement(workSheetSection).click();
        return new LessonWorkSheet(driver);
    }




}
