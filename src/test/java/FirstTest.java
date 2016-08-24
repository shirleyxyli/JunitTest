import cucumber.annotation.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by shirley.li on 2016-8-23.
 */
public class FirstTest {
    public Add a;
    @Before
    public void create(){
        a = new Add();
    }

    @Test
    public void test(){
        a = new Add();
        assertEquals(0,a.addtest(0,0));
        System.out.println("test1 is successful");
        assertEquals(10,a.addtest(1,9));
        System.out.println("test2 is successful");
    }
}
