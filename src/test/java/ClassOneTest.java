import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassOneTest {


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

}
