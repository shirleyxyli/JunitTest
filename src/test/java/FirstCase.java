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

    @Given("^Input the first num is 20$")
    public void InputFirNum(){
        a=20;
    }

    @And("^Input the second num is 40$")
    public void InputSecNum(){
        b=40;
    }

    @When("^Two numbers add$")
    public void TwoNumAdd(){
        Add t = new Add();
        c=t.addtest(a,b);
    }

    @Then("^The result should be (\\d+)$")
    public void AddResult(int ExpectedResult){
        assertEquals(ExpectedResult,c);
        System.out.println("Result is:"+c);
    }
}
