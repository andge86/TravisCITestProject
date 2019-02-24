import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public class ClassOneTest extends BaseTest {



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

    @Test (dataProvider = "variables")
    public void passingTestEnvironmentVariablesTest(String value1, String value2) {

        System.out.println("Variables from dataprovider: ");
        System.out.println(value1 + " " + value2);

        System.out.println("Hello Test Environment Variables!!!");
        System.out.println("Take one variable:");
        System.out.println(System.getenv("INSTAGRAM_LOGINS"));
        String likeLogins = System.getenv("LIKE_LOGINS");
        System.out.println(likeLogins);

        Map<String, String> map = System.getenv();

        System.out.println("Map of Environment Variables: ");
     //   System.out.println(map);
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getKey()));

        System.out.println(System.getenv("TRY1"));
        System.out.println(System.getenv("TRY2"));


        driver.get("https://www.google.com/");


        Assert.assertEquals(likeLogins, "123,456,789");
    }

    @DataProvider(name = "variables")
    public Object[][] variablesData(){

       return new Object[][] {

               {System.getenv("TRY1"), System.getenv("TRY2")},
               {System.getenv("LIKE_LOGINS").split(",")[0], System.getenv("LIKE_LOGINS").split(",")[1]}
       };
    }

}
