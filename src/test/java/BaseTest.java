import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void browserInit() {

        driver = new ChromeDriver();


    }

    @AfterClass
    public void browserClose(){

        driver.close();
        driver.quit();
    }


}
