import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LessonHomePage;
import pages.LessonWorkSheet;
import pages.SearchResultsPage;
import  static Utilities.DataReader.getTestData;

public class GetLessonQuestionsCount extends TestBase{
    @Test
    public void getLessonQuestionsCount(){

        HomePage home=new HomePage(driver);
        SearchResultsPage searchResultsPage;
        LessonHomePage lessonHomePage;
        LessonWorkSheet lessonWorkSheet;
        home.selectLanguage(getTestData("language"));
        searchResultsPage=home.search(getTestData("queryWord"));
        lessonHomePage=searchResultsPage.selectSecondLesson();
        lessonWorkSheet=lessonHomePage.openLessonWorkSheet();
         int count=lessonWorkSheet.getQuestionsCount();
        Assert.assertEquals(getTestData("lessonQuestionsCount"),String.valueOf(count));
        System.out.println("number of questions is "+count);

    //home.search("").selectSecondLesson().openLessonWorkSheet().getQuestionsCount();



    }

}
