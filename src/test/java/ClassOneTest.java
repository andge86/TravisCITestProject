import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

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
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
        driver.findElement(By.xpath("//a[@title = 'Get Selenium']")).click();
        Thread.sleep(1500);
        System.out.println(driver.getTitle());

    }

    @Test
    public void passingTestEnvironmentVariables() {

        System.out.println("Hello Test Environment Variables!!!");
        System.out.println("Take one variable:");
        System.out.println(System.getenv("INSTAGRAM_LOGINS"));
        String likeLogins = System.getenv("LIKE_LOGINS");
        System.out.println(likeLogins);

        Map<String, String> map = System.getenv();

        System.out.println("Map of Environment Variables: ");

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getKey()));

        System.out.println(System.getenv("TRY1"));
        System.out.println(System.getenv("TRY2"));

        Assert.assertEquals(likeLogins, "123;456;789");
    }

}
