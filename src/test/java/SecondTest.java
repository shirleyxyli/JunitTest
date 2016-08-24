import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by xiaoyan.li on 2016-8-24.
 */
@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty","html:reports/test-report"},tags= "@Calculator")
@Cucumber.Options(format = {"json:target/surefire-reports/dw.json"},tags = "@Calculator")
public class SecondTest {
}
