import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiaoyan.li on 2016-8-24.
 */
public class FirstCase {
    public int a;
    public int b;
    public int c;

    @Given("^输入第一个数字20$")
    public void 输入第一个数字20(){
        a=20;
    }

    @And("^输入第二个数字40$")
    public void 输入第二个数字40(){
        b=40;
    }

    @When("^两个数进行相加$")
    public void 两个数进行相加(){
        Add t = new Add();
        c=t.addtest(a,b);
    }

    @Then("^得出的结果(\\d+)$")
    public void 得出的结果(int ExpectedResult){
        assertEquals(ExpectedResult,c);
        System.out.println("得出结果为:"+c);
    }
}
