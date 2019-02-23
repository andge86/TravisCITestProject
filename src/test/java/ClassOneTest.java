import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassOneTest extends BaseTest {


    @Test
    public void passingTest1() {

        System.out.println("Hello Test1!!!");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void passingTest2() {

        System.out.println("Hello Test2!!!");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void checkSiteNameTest() throws InterruptedException {

        driver.get("https://www.seleniumhq.org/");
        Thread.sleep(1500);
        Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");

    }

}
